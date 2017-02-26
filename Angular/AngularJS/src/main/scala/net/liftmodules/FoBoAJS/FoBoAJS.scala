package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo AngularJS Toolkit Module==
  * This FoBo toolkit module provides AngularJS API and Resource components to the FoBo Module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.FoBo]] for setup information.
  */
package object FoBoAJS {

  override def toString() = {
    FoBoAJS.Toolkit.toString() + " " + FoBoAJS.Resource
      .toString() + " " + FoBoAJS.API.toString()
  }

  /**
    * Initiate FoBo's Angular Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and if present the FoBo API associated
    * with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoAJS => FoBo}
    *    :
    *   FoBo.Toolkit.Init=FoBo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Toolkit

  /**
    * Initiate FoBo's Angular Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoAJS => FoBo}
    *    :
    *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Resource

  /**
    * Initiate FoBo's Angular API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoAJS => FoBo}
    *    :
    *   FoBo.API.Init=FoBo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait API

  /*=== Toolkit ============================================*/
  object Toolkit extends Toolkit {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Toolkit]
    private var store: Store = List()
    def Init: Store = store
    def Init_=(t: Toolkit): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoAJS.Toolkit = " + store.toString()

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;5&#8228;3 in your bootstrap liftweb Boot.
      * @version 1.5.3
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS153
      * }}}
      *
      */
    case object AngularJS153 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS153
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.5.3 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS153i18n
      * }}}
      *
      */
    case object AngularJS153i18n extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS153i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;4&#8228;8 in your bootstrap liftweb Boot.
      * @version 1.4.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS148
      * }}}
      *
      */
    case object AngularJS148 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS148
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.8 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS148i18n
      * }}}
      *
      */
    case object AngularJS148i18n extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS148i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS148
      * }}}
      *
      */
    case object AngularJS141 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS141
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.1 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS141i18n
      * }}}
      *
      */
    case object AngularJS141i18n extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS141i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;3&#8228;15 in your bootstrap liftweb Boot.
      * @version 1.3.15
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS1315
      * }}}
      *
      */
    case object AngularJS1315 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS1315
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.3.15 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS1315i18n
      * }}}
      *
      */
    case object AngularJS1315i18n extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS1315i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;2&#8228;19 in your bootstrap liftweb Boot.
      * @version 1.2.19
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS1219
      * }}}
      *
      */
    case object AngularJS1219 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS1219
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.2.19 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AngularJS1219i18n
      * }}}
      *
      */
    case object AngularJS1219i18n extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS1219i18n
    }

    /**
      * Enable usage of FoBo's Angular Material API and resources version 1&#8228;0&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.0.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJMaterial101
      * }}}
      *
      */
    @deprecated("Use AJMaterial108 or later", "1.6.0")
    case object AJMaterial101 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJMaterial101
    }

    /**
      * Enable usage of FoBo's Angular Material API and resources version 1&#8228;0&#8228;8 in your bootstrap liftweb Boot.
      * @version 1.0.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJMaterial108
      * }}}
      *
      */
    @deprecated("Use AJMaterial111 or later", "2.0.0")
    case object AJMaterial108 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJMaterial108
    }

    /**
      * Enable usage of FoBo's Angular Material API and resources version 1&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.1.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJMaterial111
      * }}}
      *
      * @since v1.7
      */
    case object AJMaterial111 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJMaterial111
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 2&#8228;4&#8228;0 in your bootstrap liftweb Boot.
      * @version 2.4.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSUIBootstrap240
      * }}}
      *
      */
    case object AJSUIBootstrap240 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSUIBootstrap240
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
      * @version 0.10.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSUIBootstrap0100
      * }}}
      *
      */
    case object AJSUIBootstrap0100 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSUIBootstrap0100
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;7&#8228;0 in your bootstrap liftweb Boot.
      * @version 0.7.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSUIBootstrap070
      * }}}
      *
      */
    @deprecated("Use AJSUIBootstrap0100 or later", "2.0.0")
    case object AJSUIBootstrap070 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSUIBootstrap070
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;2&#8228;0 in your bootstrap liftweb Boot.
      * @version 0.2.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSUIBootstrap020
      * }}}
      *
      */
    @deprecated("Use AJSUIBootstrap0100 or later", "2.0.0")
    case object AJSUIBootstrap020 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSUIBootstrap020
    }

    /**
      * Enable usage of FoBo's Angular API and NG-Grid resources version 2&#8228;0&#8228;7 in your bootstrap liftweb Boot.
      * @version 2.0.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSNGGrid207
      * }}}
      *
      */
    case object AJSNGGrid207 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSNGGrid207
    }

    /**
      * Enable usage of FoBo's Angular API and UI-Grid resources version 3&#8228;0&#8228;7 in your bootstrap liftweb Boot.
      * @version 3.0.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.AJSUIGrid307
      * }}}
      *
      */
    case object AJSUIGrid307 extends Toolkit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSUIGrid307
    }
  }

  /*=== Resource ============================================*/
  object Resource extends Resource {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store: Store = List()
    def Init: Store = store
    def Init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoAJS.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's AngularJS version 1&#8228;5&#8228;3 resources files in your bootstrap liftweb Boot.
      * @version 1.5.3
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS153
      * }}}
      *
      */
    case object AngularJS153 extends Resource {
      FoBoAJSRes.Resource.AngularJS153
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.5.3 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS153i18n
      * }}}
      *
      */
    case object AngularJS153i18n extends Resource {
      FoBoAJSRes.Resource.AngularJS153i18n
    }

    /**
      * Enable usage of FoBo's AngularJS version 1&#8228;4&#8228;8 resources files in your bootstrap liftweb Boot.
      * @version 1.4.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS148
      * }}}
      *
      */
    case object AngularJS148 extends Resource {
      FoBoAJSRes.Resource.AngularJS148
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.8 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS148i18n
      * }}}
      *
      */
    case object AngularJS148i18n extends Resource {
      FoBoAJSRes.Resource.AngularJS148i18n
    }

    /**
      * Enable usage of AngularJS version 1&#8228;4&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resources.Init=FoBo.Resouces.AngularJS148
      * }}}
      *
      */
    case object AngularJS141 extends Resource {
      FoBoAJSRes.Resource.AngularJS141
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.1 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resources.Init=FoBo.Resources.AngularJS141i18n
      * }}}
      *
      */
    case object AngularJS141i18n extends Resource {
      FoBoAJSRes.Resource.AngularJS141i18n
    }

    /**
      * Enable usage of AngularJS version 1&#8228;3&#8228;15 resource files in your bootstrap liftweb Boot.
      * @version 1.3.15
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resources.Init=FoBo.Resources.AngularJS1315
      * }}}
      *
      */
    case object AngularJS1315 extends Resource {
      FoBoAJSRes.Resource.AngularJS1315
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.3.15 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resources.Init=FoBo.Resources.AngularJS1315i18n
      * }}}
      *
      */
    case object AngularJS1315i18n extends Resource {
      FoBoAJSRes.Resource.AngularJS1315i18n
    }

    /**
      * Enable usage of AngularJS version 1&#8228;2&#8228;19 resource files in your bootstrap liftweb Boot.
      * @version 1.2.19
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS1219
      * }}}
      *
      */
    case object AngularJS1219 extends Resource {
      FoBoAJSRes.Resource.AngularJS1219
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.2.19 i18n
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AngularJS1219i18n
      * }}}
      *
      */
    case object AngularJS1219i18n extends Resource {
      FoBoAJSRes.Resource.AngularJS1219i18n
    }

    /**
      * Enable usage of Angular Material version 1&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 1.0.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJMaterial101
      * }}}
      *
      */
    @deprecated("Use AJMaterial108 or later", "1.6.0")
    case object AJMaterial101 extends Resource {
      FoBoAJSRes.Resource.AJMaterial101
    }

    /**
      * Enable usage of Angular Material version 1&#8228;0&#8228;8 resource files in your bootstrap liftweb Boot.
      * @version 1.0.8
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJMaterial108
      * }}}
      *
      */
    @deprecated("Use AJMaterial111 or later", "2.0.0")
    case object AJMaterial108 extends Resource {
      FoBoAJSRes.Resource.AJMaterial108
    }

    /**
      * Enable usage of Angular Material version 1&#8228;1&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 1.1.1
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJMaterial111
      * }}}
      *
      */
    case object AJMaterial111 extends Resource {
      FoBoAJSRes.Resource.AJMaterial111
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 2&#8228;4&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 2.4.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap240
      * }}}
      *
      */
    case object AJSUIBootstrap240 extends Resource {
      FoBoAJSRes.Resource.AJSUIBootstrap240
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;10&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.10.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap0100
      * }}}
      *
      */
    case object AJSUIBootstrap0100 extends Resource {
      FoBoAJSRes.Resource.AJSUIBootstrap0100
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;7&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.7.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap070
      * }}}
      *
      */
    @deprecated("Use AJSUIBootstrap0100 or later", "2.0.0")
    case object AJSUIBootstrap070 extends Resource {
      FoBoAJSRes.Resource.AJSUIBootstrap070
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.2.0
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap020
      * }}}
      *
      */
    @deprecated("Use AJSUIBootstrap0100 or later", "2.0.0")
    case object AJSUIBootstrap020 extends Resource {
      FoBoAJSRes.Resource.AJSUIBootstrap020
    }

    /**
      * Enable usage of NG-Grid version 2&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
      * @version 2.0.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSNGGrid207
      * }}}
      *
      */
    case object AJSNGGrid207 extends Resource {
      FoBoAJSRes.Resource.AJSNGGrid207
    }

    /**
      * Enable usage of UI-Grid version 3&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
      * @version 3.0.7
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.AJSUIGrid307
      * }}}
      *
      */
    case object AJSUIGrid307 extends Resource {
      FoBoAJSRes.Resource.AJSUIGrid307
    }

  }

  /*=== API ============================================*/

  object API extends API {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store: Store = List()
    def Init: Store = store
    def Init_=(t: API): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoAJS.API = " + store.toString()

    /**
      * Enable usage of FoBo's AngularJS API 1&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 1.x.x
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoAJS => FoBo}
      *    :
      *   FoBo.API.Init=FoBo.API.Angular1
      * }}}
      *
      */
    case object Angular1 extends API {
      FoBoAJSAPI.API.Angular1
    }
  }

}
