package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Highlight API Module==
  *
  * This FoBo API module provides FoBo/Lift API components for the Highlight Toolkit Module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.FoBo]] for setup information.
  */
package object FoBoHLAPI {

  override def toString() = FoBoHLAPI.API.toString()

  /**
    * Initiate FoBo's Highlight API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoHLAPI => FoBo}
    *    :
    *   FoBo.API.Init=FoBo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait API

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
    override def toString() = "FoBoHLAPI.API = " + store.toString()

    /**
      * Enable usage of FoBo's Highlight API for Highlight version 9&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 9.X.X
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoHLAPI => FoBo}
      *    :
      *   FoBo.API.Init=FoBo.API.HighlightJS9
      * }}}
      *
      */
    case object HighlightJS9 extends API {
      FoBoAPI.init
    }

  }

  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoHL")
    }
  }

}
