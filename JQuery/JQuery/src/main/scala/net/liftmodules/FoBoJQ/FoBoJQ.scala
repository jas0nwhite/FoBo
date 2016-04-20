package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo JQuery Toolkit Module==
 * 
 * This FoBo toolkit module provides JQuery API and Resource components to the 
 * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
 *
 * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
 *
 */
package object FoBoJQ {

  override def toString() = {
    FoBoJQ.ToolKit.toString()+" "+FoBoJQ.Resource.toString()+" "+FoBoJQ.API.toString()
  }  

  abstract sealed trait ToolKit
  abstract sealed trait Resource
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
    override def toString() = "FoBoJQ.ToolKit = "+store.toString()
    
   /**
     * Enable usage of FoBo's JQuery-Migrate API and resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQueryMigrate121
     * }}}
     */    
     case object JQueryMigrate121 extends ToolKit {
       FoBoJQRes.Resource.JQueryMigrate121
       //FoBoJQAPI.API.JQuery1
     } 
    
   /**
     * Enable usage of FoBo's JQuery API and resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
     * @version 2.1.4
     * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery214
     * }}}
     */    
     case object JQuery214 extends ToolKit {
       FoBoJQRes.Resource.JQuery214
       //FoBoJQAPI.API.JQuery2
     }     
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
     * @version 2.1.1
     * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery211
     * }}}
     */    
     case object JQuery211 extends ToolKit {
       FoBoJQRes.Resource.JQuery211
       //FoBoJQAPI.API.JQuery2
     }  
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
     * @version 1.11.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery1113
     * }}}
     */    
     case object JQuery1113 extends ToolKit {
       FoBoJQRes.Resource.JQuery1113
       //FoBoJQAPI.API.JQuery2
     }   
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.10.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery1102
     * }}}
     */    
     case object JQuery1102 extends ToolKit {
       FoBoJQRes.Resource.JQuery1102
       //FoBoJQAPI.API.JQuery2
     }   
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.9.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery191
     * }}}
     */    
     case object JQuery191 extends ToolKit {
       FoBoJQRes.Resource.JQuery191
       //FoBoJQAPI.API.JQuery2
     }  
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.8.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery182
     * }}}
     */    
     case object JQuery182 extends ToolKit {
       FoBoJQRes.Resource.JQuery182
       //FoBoJQAPI.API.JQuery2
     }  
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.7.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery172
     * }}}
     */    
     case object JQuery172 extends ToolKit {
       FoBoJQRes.Resource.JQuery172
       //FoBoJQAPI.API.JQuery2
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
    override def toString() = "FoBoJQ.Resource = "+store.toString()
    
   /**
     * Enable usage of FoBo's JQuery-Migrate resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQueryMigrate121
     * }}}
     */    
     case object JQueryMigrate121 extends Resource {
       FoBoJQRes.Resource.JQueryMigrate121
     } 
    
   /**
     * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
     * @version 2.1.4
     * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery214
     * }}}
     */    
     case object JQuery214 extends Resource {
       FoBoJQRes.Resource.JQuery214
     }     
     
   /**
     * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
     * @version 2.1.1
     * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery211
     * }}}
     */    
     case object JQuery211 extends Resource {
       FoBoJQRes.Resource.JQuery211
     }  
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
     * @version 1.11.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery1113
     * }}}
     */    
     case object JQuery1113 extends Resource {
       FoBoJQRes.Resource.JQuery1113
     }   
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.10.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery1102
     * }}}
     */    
     case object JQuery1102 extends Resource {
       FoBoJQRes.Resource.JQuery1102
     }   
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.9.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery191
     * }}}
     */    
     case object JQuery191 extends Resource {
       FoBoJQRes.Resource.JQuery191
     }  
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.8.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery182
     * }}}
     */    
     case object JQuery182 extends Resource {
       FoBoJQRes.Resource.JQuery182
     }  
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.7.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery172
     * }}}
     */    
     case object JQuery172 extends Resource {
       FoBoJQRes.Resource.JQuery172
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
    override def toString() = "FoBoJQ.API = "+store.toString()
    
    /**
     * Enable usage of FoBo's JQuery API version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 1.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.JQuery1
     * }}}
     */    
     case object JQuery1 extends API {
       FoBoJQAPI.API.JQuery1
       //FoBoAPI.init
     } 
    
    /**
     * Enable usage of FoBo's JQuery API version 2&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 2.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQ => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.JQuery2
     * }}}
     */    
     case object JQuery2 extends API {
       FoBoJQAPI.API.JQuery2
       //FoBoAPI.init
     }     

  }
  
  /**
   * Object for initiating FoBo API packages. 
   */
//  private object FoBoAPI {
//    lazy val init: Unit = {
//      LiftRules.addToPackages("net.liftmodules.FoBoJQ")  
//      
//    }
//  }  
  
  /*=== InitParam (deprecated) ============================================*/  

  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBoJQ.InitParam","1.6.0")  
  def init() {
  }

  @deprecated("Use ToolKit or Resouce","1.6.0")
  abstract sealed trait FoBoJQ
  
  /**
   *
   */
  @deprecated("Use FoBoJQ.ToolKit.Init=FoBoJQ.ToolKit.[Toolkit Object]","1.6.0")
  object InitParam extends FoBoJQ {
    var JQuery: FoBoJQ = null
  }
 
  
   /**
   * Enable usage of JQuery-migrate version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
   * @version 1.2.1
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQueryMigrate121
   * }}}
   * @since v1.3
   */
  @deprecated("Use FoBoJQ.ToolKit.Init=FoBoJQ.ToolKit.JQueryMigrate121","1.6.0")
  case object JQueryMigrate121 extends FoBoJQ {
    FoBoJQ.ToolKit.JQueryMigrate121
  }  

  
  /**
   * Enable usage of JQuery version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
   * @version 2.1.4
   * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery211
   * }}}
   * @since v1.3
   */
  @deprecated("Use FoBoJQ.ToolKit.Init=FoBoJQ.ToolKit.JQuery214","1.6.0")
  case object JQuery214 extends FoBoJQ {
    FoBoJQ.ToolKit.JQuery214
  }

  /**
   * Enable usage of JQuery version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
   * @version 2.1.1
   * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery211
   * }}}
   * @since v1.3
   */
  @deprecated("Use FoBoJQ.ToolKit.Init=FoBoJQ.ToolKit.JQuery211","1.6.0")
  case object JQuery211 extends FoBoJQ {
    FoBoJQ.ToolKit.JQuery211
  } 


/**
 * Enable usage of JQuery version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
 * @version 1.11.3
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery1113
 * }}}
 * @since v1.4 
 */
  @deprecated("Use FoBoJQ.ToolKit.Init=FoBoJQ.ToolKit.JQuery1113","1.6.0")
  case object JQuery1113 extends FoBoJQ {
    FoBoJQ.ToolKit.JQuery1113
  }

/**
 * Enable usage of JQuery version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
 * @version 1.10.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery1102
 * }}}
 */
  @deprecated("Use FoBoJQ.ToolKit.Init=FoBoJQ.ToolKit.JQuery1102","1.6.0")
  case object JQuery1102 extends FoBoJQ {
    FoBoJQ.ToolKit.JQuery1102
  }

/**
 * Enable usage of JQuery version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
 * @version 1.9.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery191
 * }}}
 */
  @deprecated("Use FoBoJQ.ToolKit.Init=FoBoJQ.ToolKit.JQuery191","1.6.0")
  case object JQuery191 extends FoBoJQ {
    FoBoJQ.ToolKit.JQuery191
  }  
  
/**
 * Enable usage of JQuery version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
 * @version 1.8.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery182
 * }}}
 */
  @deprecated("Use FoBoJQ.ToolKit.Init=FoBoJQ.ToolKit.JQuery182","1.6.0")
  case object JQuery182 extends FoBoJQ {
    FoBoJQ.ToolKit.JQuery182
  }

/**
 * Enable usage of JQuery version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
 * @version 1.7.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery172
 * }}}
 */
  @deprecated("Use FoBoJQ.ToolKit.Init=FoBoJQ.ToolKit.JQuery172","1.6.0")
  case object JQuery172 extends FoBoJQ {
    FoBoJQ.ToolKit.JQuery172
  }

}

