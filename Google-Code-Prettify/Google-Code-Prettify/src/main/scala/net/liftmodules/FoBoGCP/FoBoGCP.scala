package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Google Code Prettify Toolkit Module==
 * 
 * This FoBo toolkit module provides Google Code Prettify API and Resource components to the 
 * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
 *
 * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
 * 
 */
package object FoBoGCP {

  override def toString() = {
    FoBoGCP.ToolKit.toString()+" "+FoBoGCP.Resource.toString()+" "+FoBoGCP.API.toString()
  }
  
  /**
   * Initiate FoBo's Google Code Prettify ToolKit(s) in you bootstrap liftweb Boot.
   * Using the ToolKit initiation you will bring in both the 
   * toolkit's resources and FoBo/Lift API associated 
   * with the toolkit.  
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoGCP => FoBo}
   *    :
   *   FoBo.ToolKit.Init=FoBo.ToolKit.[ToolKit Companion Object]
   * }}}
   * '''Note:''' To see available companion objects click on the round trait icon in the header of this page.
   */  
  abstract sealed trait ToolKit
  
  /**
   * Initiate FoBo's Google Code Prettify Resource(s) in you bootstrap liftweb Boot.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoGCP => FoBo}
   *    :
   *   FoBo.Resource.Init=FoBo.Resource.[Resource Companion Object]
   * }}}
   * '''Note:''' To see available companion objects click on the round trait icon in the header of this page.
   */   
  abstract sealed trait Resource
  
  /**
   * Initiate FoBo's Google Code Prettify API in you bootstrap liftweb Boot.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoGCP => FoBo}
   *    :
   *   FoBo.API.Init=FoBo.API.[API Companion Object]
   * }}}
   * '''Note:''' To see available companion objects click on the round trait icon in the header of this page.
   */   
  abstract sealed trait API
  
  
  /*=== ToolKit ============================================*/
  
  object ToolKit extends ToolKit {
    
    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[ToolKit]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:ToolKit):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoGCP.ToolKit = "+store.toString()
    
   /**
     * Enable usage of FoBo's Google Code Prettify API and resources version Jun2011 in your bootstrap liftweb Boot.
     * @version Jun2011
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoGCP => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.PrettifyJun2011
     * }}}
     */    
     case object PrettifyJun2011 extends ToolKit {
       FoBoGCPRes.Resource.PrettifyJun2011
       //FoBoPaAPI.API.Prettify1
     }    
    
  }
  
  /*=== Resource ============================================*/
  
  object Resource extends Resource {
   
    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:Resource):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }  
    override def toString() = "FoBoGCP.Resource = "+store.toString()
    
   /**
     * Enable usage of FoBo's Google Code Prettify resources version Jun2011 in your bootstrap liftweb Boot.
     * @version Jun2011
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoGCP => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.PrettifyJun2011
     * }}}
     */    
     case object PrettifyJun2011 extends Resource {
       FoBoGCPRes.Resource.PrettifyJun2011
     }       
  }
  
  /*=== API ============================================*/
  
  object API extends API {
    
    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:API):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }      
    override def toString() = "FoBoGCP.API = "+store.toString()
    
    /**
     * Enable usage of FoBo's Google Code Prettify API version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 1.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoGCP => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.Prettify1
     * }}}
     */    
     case object Prettify1 extends API {
       //ToDo get from module fobo-google-code-prettify-api in FoBoGCPAPI
       //FoBoGCPAPI.API.Prettify1
       FoBoAPI.init
     }
    
  }
  
  /*=== InitParam (deprecated) ============================================*/

  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBoGCP.InitParam","1.6.0")
  def init() {
  }

  //@deprecated("","1.6.0")
  abstract sealed trait FoBoToolkit  
  
  /**
   *
   */
  @deprecated("Use FoBoGCP.ToolKit.Init=FoBoPa.ToolKit.[Toolkit Object]","1.6.0")
  object InitParam extends FoBoToolkit {
    var ToolKit: FoBoToolkit = null 
  }

  
 /**
  * Enable usage of Prettify version Jun2011 in your bootstrap liftweb Boot.
  * @version Jun2011
  * 
  * '''Example:'''
  * 
  * {{{
  *   FoBoGCP.InitParam.Toolkit=FoBoGCP.PrettifyJun2011
  * }}}
  */
  @deprecated("Use FoBoGCP.ToolKit.Init=FoBoGCP.ToolKit.PrettifyJun2011","1.6.0")
  case object PrettifyJun2011 extends FoBoToolkit {
    ToolKit.PrettifyJun2011
  }

  /**
   * Object for initiating FoBo API packages. 
   */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoGCP")  
    }
  }

}




