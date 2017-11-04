package net.liftmodules.FoBoBs4.snippet.FoBo

import net.liftweb._
import http._
import common._
// import common.Box._
// import http.{S, LiftRules}
import sitemap._
// import util.Helpers
import xml._

/**
  * ==Bs4Navbar Snippet Bootstrap v4.x==
  *
  * This snippet object transforms lift SiteMap menu items associated with specified loc
  * group name's into Twitter Bootsrap Nav menu items including dropdown menu items from SiteMap submenu's.
  *
  * See also the TBLocInfo object in [[net.liftmodules.FoBo]] for various, simple to use, SiteMap manipulation functions (menu dividers, labels...).
  * If you are using the FoBoBs module separately from FoBo see the BsLocInfo object in [[net.liftmodules.FoBoBs]]
  *
  * '''Snippet Usage:'''
  * {{{<span data-lift="FoBo.Bs4Navbar.builder?group=[LocGroup name]"></span>}}}
  * and/or
  * {{{<span data-lift="FoBo.Bs4Navbar.builderPullRight?group=[LocGroup name]"></span>}}}
  *
  * '''Snippet Params:'''
  *
  *  - '''Param''' ''group'' - The LocGroup name
  *
  * '''Result:''' The above will result in
  * {{{
  *   <u l class="nav">...lift SiteMap items associated with the locGroup name...</u l>
  *   <u l class="nav pull-right">...lift SiteMap items associated with the locGroup name...</u l>
  * }}}
  * This will be expand into twitter bootstrap nav list's built from the named
  * Lift menu locGroup content where the second list will be pull to the right.
  *
  * '''Example - Fluid Navbar fixed to top''' Invoke with something like this
  * {{{<d i v class="navbar navbar-fixed-top">
  *   <d i v class="navbar-inner">
  *	   <d i v class="container-fluid">
  *	     <a class="btn btn-navbar" data-toggle="collapse" data-target=".navbar-collapse">
  *         <span class="icon-bar"></span>
  *         <span class="icon-bar"></span>
  *         <span class="icon-bar"></span>
  *	     </a> <a class="brand" href="...">Project</a>
  *	     <d i v class="navbar-collapse">
  *         <span data-lift="FoBo.Bs4Navbar.builder?group=top"></span>
  *         <span data-lift="FoBo.Bs4Navbar.builderPullRight?group=top2"></span>
  *	     </d i v>
  *	   </d i v>
  *   </d i v>
  * </d i v>}}}
  *
  * '''Result:''' This will create a fluid bootstrap navbar fixed to top with menu entries associated with the
  * two LocGroup's 'top' and 'top2' where the second one is pulled to the right.
  * @since v2.0
  */
trait Bs4Navbar extends FlexMenuBuilder with DispatchSnippet {

  private val logger = Logger(classOf[Bs4Navbar])

  // a hack to use structural typing to get around the private[http] on Loc.buildItem
  //type StructBuildItem = {def buildItem(kids: List[MenuItem], current: Boolean, path: Boolean): Box[MenuItem]}

  def dispatch: DispatchIt =
    overridenDispatch orElse net.liftweb.builtin.snippet.Menu.dispatch

  def overridenDispatch: DispatchIt = {
    case "builder" =>
      ignore =>
        renderPullLeft
    case "builderPullRight" =>
      ignore =>
        renderPullRight
  }

  private var pullRight = false
  private def renderPullLeft: NodeSeq = this.synchronized {
    pullRight = false
    render
  }
  private def renderPullRight: NodeSeq = this.synchronized {
    pullRight = true
    render
  }

  override def expandAll = true
  override def linkToSelf = true

  override def renderOuterTag(inner: NodeSeq, top: Boolean): NodeSeq = {
    if (top && !pullRight) {
      <ul class="nav navbar-nav mr-auto">{ inner }</ul>
    } else if (top && pullRight) {
      <ul class="nav navbar-nav navbar-right">{ inner }</ul>
    } else {
      <ul class="dropdown-menu">{ inner }</ul>
    }
  }

  override def renderSelfLinked(item: MenuItem,
                                renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(
      <xml:group>{
        renderLink(item.uri, item.text, item.path,
          item.current)
        }{ renderInner(item.kids) }</xml:group>,
      item.path,
      item.current
    )

  override def renderLink(uri: NodeSeq,
                          text: NodeSeq,
                          path: Boolean,
                          current: Boolean): NodeSeq =
    <a class="nav-link" href={ uri }>{ text }</a>

  //investigate why we never get current here
  def renderDropdownItem (uri: NodeSeq,
                          text: NodeSeq,
                          path: Boolean,
                          current: Boolean): NodeSeq =
    if (current)
      <a class="dropdown-item active" href={uri}>
        {text}
      </a>
    else
      <a class="dropdown-item" href={uri}>
        {text}
      </a>

  def renderLinkWithTarget(uri: NodeSeq,
                           text: NodeSeq,
                           path: Boolean,
                           current: Boolean,
                           f: Function0[_]): NodeSeq = {
    val t: String = f().asInstanceOf[String]
    <a class="nav-link" href={ uri } target={t}>{ text }</a>
  }

  override def updateForPath(nodes: Elem, path: Boolean): Elem = nodes

  override def updateForCurrent(nodes: Elem, current: Boolean): Elem = nodes

  override def renderPlaceholder(item: MenuItem,
                                 renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildTBDropdown(
      <li class='nav-item dropdown'>
        <a href='#' class='nav-link dropdown-toggle' data-toggle='dropdown' aria-haspopup="true" aria-expanded="false">
          <span>{ item.text }</span> <b class='caret'></b>
        </a>
        <div class="dropdown-menu">{
          for(kid <- item.kids) yield renderDropdownItem(kid.uri, kid.text, kid.path, kid.current)
          }</div>
      </li>,
      item.path,
      item.current
    )


  override def buildItemMenu[A](loc: Loc[A],
                                currLoc: Box[Loc[_]],
                                expandAll: Boolean): List[MenuItem] = {
    val kids: List[MenuItem] = if (expandAll) loc.buildKidMenuItems(loc.menu.kids) else Nil
    loc.asInstanceOf[StructBuildItem].buildItem(kids, currLoc == Full(loc), currLoc == Full(loc)).toList
  }

  override def emptyGroup: NodeSeq = NodeSeq.Empty

  override def emptyMenu: NodeSeq = Text("No Navigation Defined.")

  override def emptyPlaceholder: NodeSeq = NodeSeq.Empty

  override def buildInnerTag(contents: NodeSeq,
                             path: Boolean,
                             current: Boolean): Elem = {
    if (current) {
      updateForCurrent(updateForPath(<li class="nav-item active">{ contents }</li>, path), current)
    } else {
      updateForCurrent(updateForPath(<li class="nav-item">{ contents }</li>, path), current)
    }
  }

  def buildTBDivider(contents: NodeSeq,
                     path: Boolean,
                     current: Boolean): Elem =
    updateForCurrent(updateForPath(<li class="nav-item divider"></li>, path), current)

  def buildTBVerticalDivider(contents: NodeSeq,
                             path: Boolean,
                             current: Boolean): Elem =
    updateForCurrent(updateForPath(<li class="nav-item divider-vertical"></li>, path),
      current)

  def buildTBDropdown(contents: NodeSeq,
                      path: Boolean,
                      current: Boolean): Elem =
    updateForCurrent(updateForPath({contents}.asInstanceOf[Elem], path), current)

  override def renderSelf(item: MenuItem): NodeSeq = <span>{ item.text }</span>

  override def renderSelfNotLinked(
                                    item: MenuItem,
                                    renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>{ renderSelf(item) }{ renderInner(item.kids) }</xml:group>, item.path, item.current)

  override def renderItemInPath(item: MenuItem,
                                renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>
      {renderLink(item.uri, item.text, item.path, item.current)}{renderInner(item.kids)}
    </xml:group>, item.path, item.current)

  override def renderItem(item: MenuItem,
                          renderInner: Seq[MenuItem] => NodeSeq): Elem = {
    renderItemWithInfo(item.info, renderInner, item)
  }

  private def renderItemWithInfo(
                                  info: List[net.liftweb.common.Box[Function0[_]]],
                                  renderInner: Seq[MenuItem] => NodeSeq,
                                  item: MenuItem): Elem = {

    def buildWithInfo(f: Function0[_],
                      renderInner: Seq[MenuItem] => NodeSeq,
                      item: MenuItem): Elem = {
      if (f().equals("divider")) {
        buildTBDivider(<xml:group></xml:group>, item.path, item.current)
      } else if (f().equals("divider-vertical")) {
        buildTBVerticalDivider(<xml:group></xml:group>,
          item.path,
          item.current)
      } else if (f().equals("_blank") || f().equals("_self") || f().equals(
        "_parent") || f().equals("_top")) {
        buildInnerTag(
          <xml:group>{ renderLinkWithTarget(item.uri, item.text, item.path, item.current, f) }{ renderInner(item.kids) }</xml:group>,
          item.path,
          item.current)
      } else {
        //Unknown function value do the default thingy
        buildInnerTag(
          <xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>,
          item.path,
          item.current)
      }
    }
    //http://lift.la/scala-option-lift-box-and-how-to-make-your-co //should probably rewrite this using for comprehension
    info match {
      case head :: Nil => {
        head match {
          case Full(f) => {
            buildWithInfo(f, renderInner, item)
          }
          case Empty => {
            //hmmm a empty list
            buildInnerTag(<xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>, item.path, item.current)
          }
          case Failure(message, _, _) => {
            //something got wrong
            buildInnerTag(<xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>, item.path, item.current)
          }
        }
      }

      case head :: tail => {
        head match {
          case Full(f) => {
            buildWithInfo(f, renderInner, item)
          }
          case Empty =>
          case Failure(message, _, _) => ""
        }
        //info list has more elements
        renderItemWithInfo(tail, renderInner, item)
      }
      case Nil => {
        //there was no info
        buildInnerTag(<xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>, item.path, item.current)
      }
    }

  }

}

object Bs4Navbar extends Bs4Navbar