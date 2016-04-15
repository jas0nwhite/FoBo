package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Resource sub-module== 
 * This package object provides module initiation in FoBo's most fine grain level. 
 * 
 * This is useful if you want to depend on a small subset of FoBo's functionality 
 * by only pulling in some specific FoBo artifact(s) that provides toolkit resources
 * or FoBo API functions.
 * 
 * This module provides initation of toolkit resources for the JQuery module.
 * 
 * For more information on how to set up and use the FoBo modules see the FoBo readme.
 */
package object FoBoJQRes {
  

  abstract sealed trait Resource
  
  object Resource extends Resource {
    var Init: Resource = null 
   
    /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQueryMigrate121
     * }}}
     */    
     case object JQueryMigrate121 extends Resource {
       FoBoResources.init
       FoBoResources.jqueryMigrate121
     }     
    
    /**
     * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
     * @version 2.1.4
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery214
     * }}}
     */    
     case object JQuery214 extends Resource {
       FoBoResources.init
       FoBoResources.jquery214
     } 
     
    /**
     * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
     * @version 2.1.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery211
     * }}}
     */    
     case object JQuery211 extends Resource {
       FoBoResources.init
       FoBoResources.jquery211
     }      
    
    /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
     * @version 1.11.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery1113
     * }}}
     */    
     case object JQuery1113 extends Resource {
       FoBoResources.init
       FoBoResources.jquery1113
     }  
     
    /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
     * @version 1.10.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery1102
     * }}}
     */    
     case object JQuery1102 extends Resource {
       FoBoResources.init
       FoBoResources.jquery1102
     } 
     
    /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.9.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery191
     * }}}
     */    
     case object JQuery191 extends Resource {
       FoBoResources.init
       FoBoResources.jquery191
     }
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.8.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery182
     * }}}
     */    
     case object JQuery182 extends Resource {
       FoBoResources.init
       FoBoResources.jquery182
     } 
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.7.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery172
     * }}}
     */    
     case object JQuery172 extends Resource {
       FoBoResources.init
       FoBoResources.jquery172
     }      
    
  }
  

  /**
   * Object holding internally used FoBo resources.
   */
private object FoBoResources {

  lazy val init: Unit = {
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }
  
  lazy val jqueryMigrate121 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery-migrate.js" :: Nil if Props.devMode => List("jquery-migrate", "1.2.1", "js", "jquery-migrate.js")
      case "fobo" :: "jquery-migrate.js" :: Nil => List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }
  }    
    
  
  lazy val jquery214 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "2.1.4", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "2.1.4", "js", "jquery-min.js")
    }
  }
  
  lazy val jquery211 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "2.1.1", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "2.1.1", "js", "jquery-min.js")
    }
  } 
  
  lazy val jquery1113 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.11.3", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.11.3", "js", "jquery-min.js")
    }
  } 
  
  lazy val jquery1111 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.11.1", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.11.1", "js", "jquery-min.js")
    }
  } 
  
  lazy val jquery1110 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.11.0", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.11.0", "js", "jquery-min.js")
    }
  } 
  
  lazy val jquery1102 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.10.2", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.10.2", "js", "jquery-min.js")
    }
  }     
    
  lazy val jquery191 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.9.1", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.9.1", "js", "jquery-min.js")
    }
  } 
  
  lazy val jquery182 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.8.2", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.8.2", "js", "jquery-min.js")
    }
  }   
   
  lazy val jquery172 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.7.2", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.7.2", "js", "jquery-min.js")
    }
  }
  
  }
}



