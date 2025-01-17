package net.liftmodules

/**
  * ==Welcome to FoBo - A Modular Front-End Toolkit module for Lift==
  *
  * The [[net.liftmodules.fobo]] Package is the starting point for this API.
  * The FoBo modules Github home is [[https://github.com/karma4u101/FoBo here]]
  *
  *===What FoBo will do for you===
  *
  * The FoBo/FoBo module gives you quick and easy integration of some of the industry leading web-centric open source
  * front-end toolkits. FoBo is highly modular, all FoBo toolkit modules are built up of a resource module and possibly
  * a FoBo/Lift API module.
  * You can depend on the FoBo/FoBo module to get access to all FoBo's toolkit/resource/api modules or you can pick the
  * module(s) you need, for example, just the bootstrap API module where you provide your own resources or you may chose
  * any combination of modules.
  *
  * Usage benefits:
  *  - Due to uniform declaration and integration points across toolkit versions only a small amount of changes
  *    is needed for a up/down-grading of a used Toolkit/resource, optimally, if the toolkit has no breaking changes
  *    it will just be a version change of the init param in Lift bootstrap.liftweb.Boot.
  *  - The module provides debug-able js and css files in development and minimized files otherwise.
  *  - FoBo is simultaneously supporting several versions of each toolkit which makes development, maintenance,
  *    upgrade and fall-back quick and easy.
  *  - Most of the FoBo toolkit modules provides a API sub-module with Snippet helpers and lib classes that will
  *    ease you from writing some commonly used toolkit component integration scripts making it a simple snippet invocation.
  *  - Great responsive scalability with responsive toolkits.
  *  - FoBo strives to be highly modular. FoBo is built up by independent toolkit/resource/api module artifacts that
  *    can be used independent of the FoBo/FoBo assembly module.
  *
  *
  * ===FoBo supported toolkits/resources===
  *
  * The following is a list of available toolkits resources
  *
  *  - JQuery [v1.7.2, v1.8.2, v1.9.1, v1.10.2, v1.11.3, v.2.1.1, v.2.1.4, v2.2.4, v3.0.0, v3.1.0] [[net.liftmodules.fobojq]]
  *  - JQueryMigrate [v1.2.1, v1.4.1, v3.0.0] [[net.liftmodules.fobojq]]
  *  - Bootstrap v4.x series [v4.1.3, v4.0.0] [[net.liftmodules.fobobs4]]
  *  - Bootstrap v3.x series [v3.0.1, v3.1.1, v3.2.0, v3.3.7] [[net.liftmodules.fobobs]]
  *  - Bootstrap v2.x series [v2.3.2] [[net.liftmodules.fobotb]]
  *  - Font Awesome [v3.2.1, v4.0.3, v4.1.0, v4.3.0, v4.5.0, v4.7.0] [[net.liftmodules.fobofa]]
  *  - Google Code Prettify [vJun2011] [[net.liftmodules.fobogcp]]
  *  - Highlight JS [v9.3.0] [[net.liftmodules.fobohl]]
  *  - Pace [v0.4.15, v1.0.2] [[net.liftmodules.fobopa]]
  *  - Angular JS [v1.0.6, v1.2.11, v1.2.19, v1.3.15, v1.4.1, v1.4.8, v1.5.3] (angular core modules) [[net.liftmodules.foboajs]]
  *  - Angular UI Bootstrap [v0.2.0, v0.7.0, v0.10.0, v2.5.0] (angular component) [[net.liftmodules.foboajs]]
  *  - Angular NG-Grid [v2.0.4, v2.0.7] (angular component) [[net.liftmodules.foboajs]]
  *  - Angular UI-Grid [v3.0.7] (angular component) [[net.liftmodules.foboajs]]
  *  - Angular Material design [v0.10.0, v1.0.8, v1.1.1, v1.1.4] (angular component) [[net.liftmodules.foboajs]]
  *  - Popper [v1.12.9]
  *  - Tooltip [v1.1.4]
  *
  * ===Help out!===
  *
  * There is a lot more that can be done within the boundaries of the FoBo API modules and the FoBo modules as a hole so
  * your help, suggestions, encouragement, engagement, patches (pull requests) bug-fixes/reports are highly appreciated.
  *
  * ===Setup===
  *
  *  - This module has published artifacts for Lift v3.1 and v3.0 and it's supported Scala versions.
  *    Older versions of FoBo also supports Lift v2.4/v2.5/v2.6
  *  - For a introduction to FoBo see [[http://www.media4u101.se/fobo-lift-template-demo/ FoBo introduction]]
  *
  * @example To initiate this module for usage in your Lift project set something like the following in
  * your projects Lift bootstrap.liftweb.Boot boot method. Here the FoBo ToolkitObjectNameXYZ
  * represent one of FoBo's available FoBo Toolkit objects.
  * {{{
  *    import net.liftmodules.fobo
  *     :
  *     :
  *    fobo.Toolkit.init=fobo.Toolkit.JQueryXYZ  //the fobo jquery module, version xyz
  *    fobo.Toolkit.init=fobo.Toolkit.ToolkitObjectNameXYZ //one or more fobo toolkits
  *    fobo.Toolkit.init=fobo.Toolkit.ToolkitObjectNameXYZ
  * }}}
  *
  * You may substitute Toolkit for Resource or API and if you wish also adjust the artifact dependencies
  * accordingly to include just the FoBo modules you use, but if size is not a issue using the FoBo/FoBo
  * module is convenient and gives you a lot to pick from.
  * @version v2.1.0
  * @author Peter Petersson (Github karma4u101) and the Lift community
  *
  */
package object fobo {

  override def toString() = {
    fobo.Toolkit.toString() + " " + fobo.Resource.toString() + " " + fobo.API
      .toString()
  }

  /**
    * Initiate FoBo's Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and if present the FoBo API associated
    * with the toolkit.
    *
    *  @example
    * {{{
    *   import net.liftmodules.fobo
    *    :
    *   fobo.Toolkit.init=fobo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Toolkit

  /**
    * Initiate the toolkit's associated resources in you bootstrap liftweb Boot.
    * You should use this if you only want to initiate the FoBo provided toolkit
    * resources but not the FoBo API associated with the toolkit.
    *
    *  @example
    * {{{
    *   import net.liftmodules.fobo
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate a toolkit's associated FoBo API in you bootstrap liftweb Boot.
    * You should use this if you want to use FoBo's API for the toolkit but
    * want to provide the toolkit resources yourself.
    *
    *  @example
    * {{{
    *   import net.liftmodules.fobo
    *    :
    *   fobo.API.init=fobo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait API

  /*=== Toolkit ============================================*/

  object Toolkit extends Toolkit {
    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Toolkit]
    private var store: Store = List()
    def init: Store          = store
    def init_=(t: Toolkit): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobo.Toolkit = " + store.toString()

    /*===Angular Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;5&#8228;3 in your bootstrap liftweb Boot.
      * @version 1.5.3
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AngularJS153
      * }}}
      * @since v1.6
      */
    case object AngularJS153 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AngularJS153
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.5.3 i18n
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AngularJS153i18n
      * }}}
      *
      */
    case object AngularJS153i18n extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AngularJS153i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;4&#8228;8 in your bootstrap liftweb Boot.
      * @version 1.4.8
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AngularJS148
      * }}}
      *
      */
    case object AngularJS148 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AngularJS148
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.8 i18n
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AngularJS148i18n
      * }}}
      *
      */
    case object AngularJS148i18n extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AngularJS148i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AngularJS148
      * }}}
      *
      */
    case object AngularJS141 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AngularJS141
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.1 i18n
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AngularJS141i18n
      * }}}
      *
      */
    case object AngularJS141i18n extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AngularJS141i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;3&#8228;15 in your bootstrap liftweb Boot.
      * @version 1.3.15
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AngularJS1315
      * }}}
      *
      */
    case object AngularJS1315 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AngularJS1315
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.3.15 i18n
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AngularJS1315i18n
      * }}}
      *
      */
    case object AngularJS1315i18n extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AngularJS1315i18n
    }

    /**
      * Enable usage of FoBo's AngularJS API and resources version 1&#8228;2&#8228;19 in your bootstrap liftweb Boot.
      * @version 1.2.19
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AngularJS1219
      * }}}
      *
      */
    case object AngularJS1219 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AngularJS1219
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.2.19 i18n
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AngularJS1219i18n
      * }}}
      *
      */
    case object AngularJS1219i18n extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AngularJS1219i18n
    }

    /**
      * Enable usage of FoBo's Angular Material API and resources version 1&#8228;0&#8228;8 in your bootstrap liftweb Boot.
      * @version 1.0.8
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AJMaterial108
      * }}}
      *
      */
    @deprecated("Use AJMaterial111 or later", "2.0.0")
    case object AJMaterial108 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AJMaterial108
    }

    /**
      * Enable usage of FoBo's Angular Material API and resources version 1&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.1.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AJMaterial111
      * }}}
      *
      * @since v1.7
      */
    case object AJMaterial111 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AJMaterial111
    }

    /**
      * Enable usage of FoBo's Angular Material API and resources version 1&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 1.1.4
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AJMaterial114
      * }}}
      *
      * @since v2.0
      */
    case object AJMaterial114 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AJMaterial114
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 2&#8228;5&#8228;0 in your bootstrap liftweb Boot.
      * @version 2.5.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AJSUIBootstrap250
      * }}}
      *
      */
    case object AJSUIBootstrap250 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AJSUIBootstrap250
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
      * @version 0.10.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AJSUIBootstrap0100
      * }}}
      *
      */
    case object AJSUIBootstrap0100 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AJSUIBootstrap0100
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;7&#8228;0 in your bootstrap liftweb Boot.
      * @version 0.7.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AJSUIBootstrap070
      * }}}
      *
      */
    @deprecated("Use AJSUIBootstrap0100 or later", "2.0.0")
    case object AJSUIBootstrap070 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AJSUIBootstrap070
    }

    /**
      * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;2&#8228;0 in your bootstrap liftweb Boot.
      * @version 0.2.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AJSUIBootstrap020
      * }}}
      *
      */
    @deprecated("Use AJSUIBootstrap0100 or later", "2.0.0")
    case object AJSUIBootstrap020 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AJSUIBootstrap020
    }

    /**
      * Enable usage of FoBo's Angular API and NG-Grid resources version 2&#8228;0&#8228;7 in your bootstrap liftweb Boot.
      * @version 2.0.7
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AJSNGGrid207
      * }}}
      *
      */
    case object AJSNGGrid207 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AJSNGGrid207
    }

    /**
      * Enable usage of FoBo's Angular API and UI-Grid resources version 3&#8228;0&#8228;7 in your bootstrap liftweb Boot.
      * @version 3.0.7
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.AJSUIGrid307
      * }}}
      *
      */
    case object AJSUIGrid307 extends Toolkit {
      net.liftmodules.foboajs.Toolkit.AJSUIGrid307
    }

    /*===Font Awesome Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 5&#8228;5&#8228;0 in your bootstrap liftweb Boot.
      * @version 5.5.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome550
      * }}}
      * @since v2.1.0
      */
    case object FontAwesome550 extends Toolkit {
      net.liftmodules.fobofa.Toolkit.FontAwesome550
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;7&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.7.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome470
      * }}}
      */
    case object FontAwesome470 extends Toolkit {
      net.liftmodules.fobofa.Toolkit.FontAwesome470
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;6&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.6.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome463
      * }}}
      */
    case object FontAwesome463 extends Toolkit {
      net.liftmodules.fobofa.Toolkit.FontAwesome463
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.3.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome430
      * }}}
      */
    case object FontAwesome430 extends Toolkit {
      net.liftmodules.fobofa.Toolkit.FontAwesome430
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.1.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome410
      * }}}
      */
    case object FontAwesome410 extends Toolkit {
      net.liftmodules.fobofa.Toolkit.FontAwesome410
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.0.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome403
      * }}}
      */
    case object FontAwesome403 extends Toolkit {
      net.liftmodules.fobofa.Toolkit.FontAwesome403
    }

    /**
      * Enable usage of FoBo's FontAwesome resources and API version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.2.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.FontAwesome321
      * }}}
      */
    case object FontAwesome321 extends Toolkit {
      net.liftmodules.fobofa.Toolkit.FontAwesome321
    }

    /*===Google Code Prettify Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's Google Code Prettify API and resources version Jun2011 in your bootstrap liftweb Boot.
      * @version Jun2011
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.PrettifyJun2011
      * }}}
      */
    case object PrettifyJun2011 extends Toolkit {
      net.liftmodules.fobogcp.Toolkit.PrettifyJun2011
    }

    /*===JQuery Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's JQuery API and resources version 3&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.4.1
      * OBS! JQuery 3.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery341
      * }}}
      * @since v2.12
      */
    case object JQuery341 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery341
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 3&#8228;3&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.3.1
      * OBS! JQuery 3.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery331
      * }}}
      * @since v2.12
      */
    case object JQuery331 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery331
    }
    
    /**
      * Enable usage of FoBo's JQuery API and resources version 3&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.1.0
      * OBS! JQuery 3.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery310
      * }}}
      * @since v2.10
      */
    case object JQuery310 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery310
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate API and resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQueryMigrate300
      * }}}
      * @since v2.10
      */
    case object JQueryMigrate300 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQueryMigrate300
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      * OBS! JQuery 3.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery300
      * }}}
      * @since v2.10
      */
    case object JQuery300 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery300
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 2&#8228;2&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.2.4
      * OBS! JQuery 2.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery224
      * }}}
      * @since v2.10
      */
    case object JQuery224 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery224
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate API and resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQueryMigrate141
      * }}}
      * @since v2.10
      */
    case object JQueryMigrate141 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQueryMigrate141
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate API and resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.2.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQueryMigrate121
      * }}}
      */
    case object JQueryMigrate121 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQueryMigrate121
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.1.4
      * OBS! JQuery 2.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery214
      * }}}
      */
    case object JQuery214 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery214
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 2.1.1
      * OBS! JQuery 2.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery211
      * }}}
      */
    case object JQuery211 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery211
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
      * @version 1.11.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery1113
      * }}}
      */
    case object JQuery1113 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery1113
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.10.2
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery1102
      * }}}
      */
    case object JQuery1102 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery1102
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.9.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery191
      * }}}
      */
    case object JQuery191 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery191
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.8.2
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery182
      * }}}
      */
    case object JQuery182 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery182
    }

    /**
      * Enable usage of FoBo's JQuery API and resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.7.2
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.JQuery172
      * }}}
      */
    case object JQuery172 extends Toolkit {
      net.liftmodules.fobojq.Toolkit.JQuery172
    }

    /*===Pace Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's Pace API and resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.0.2
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolki  t.init=fobo.Toolkit.Pace102
      * }}}
      */
    case object Pace102 extends Toolkit {
      net.liftmodules.fobopa.Toolkit.Pace102
    }

    /**
      * Enable usage of FoBo's Pace API and resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
      * @version 0.4.15
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Pace0415
      * }}}
      */
    case object Pace0415 extends Toolkit {
      net.liftmodules.fobopa.Toolkit.Pace0415
    }

    /*===Bootstrap4 Toolkit===============================================================*/
    /**
      * Enable usage of Bootstrap API and resources version 4&#8228;1&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.1.3
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Bootstrap413
      * }}}
      * @since v2.1.0
      */
    case object Bootstrap413 extends Toolkit {
      net.liftmodules.fobobs4.Toolkit.Bootstrap413
    }

    /**
      * Enable usage of Bootstrap API and resources version 4&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.0.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Bootstrap400
      * }}}
      * @since v2.0
      */
    case object Bootstrap400 extends Toolkit {
      net.liftmodules.fobobs4.Toolkit.Bootstrap400
    }

    /*===Bootstrap3 Toolkit===============================================================*/

    /**
      * Enable usage of Bootstrap API and resources version 3&#8228;3&#8228;7 in your bootstrap liftweb Boot.
      * @version 3.3.7
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Bootstrap337
      * }}}
      * @since v1.7
      */
    case object Bootstrap337 extends Toolkit {
      net.liftmodules.fobobs.Toolkit.Bootstrap337
    }

    /**
      * Enable usage of Bootstrap API and resources version 3&#8228;2&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.2.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Bootstrap320
      * }}}
      *
      */
    case object Bootstrap320 extends Toolkit {
      net.liftmodules.fobobs.Toolkit.Bootstrap320
    }

    /**
      * Enable usage of Bootstrap API and resources version 3&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.1.1
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Bootstrap311
      * }}}
      *
      */
    case object Bootstrap311 extends Toolkit {
      net.liftmodules.fobobs.Toolkit.Bootstrap311
    }

    /**
      * Enable usage of Bootstrap API and resources version 3&#8228;0&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.0.1
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Bootstrap301
      * }}}
      *
      */
    case object Bootstrap301 extends Toolkit {
      net.liftmodules.fobobs.Toolkit.Bootstrap301
    }

    /*===Bootstrap2 Toolkit===============================================================*/

    /**
      * Enable usage of Bootstrap API and resources version 2&#8228;3&#8228;2 in your bootstrap liftweb Boot.
      * @version 2.3.2
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Bootstrap232
      * }}}
      *
      */
    case object Bootstrap232 extends Toolkit {
      net.liftmodules.fobotb.Toolkit.Bootstrap232
    }

    /*===Highlight Toolkit===============================================================*/

    /**
      * Enable usage of FoBo's Highlight JS API and resources version 9&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version v9.3.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.HighlightJS930
      * }}}
      */
    case object HighlightJS930 extends Toolkit {
      net.liftmodules.fobohl.Toolkit.HighlightJS930
    }

    /*===Popper Toolkit===============================================================*/

    /**
      * Enable usage FoBo's Popper API and resources version 1&#8228;12&#8228;9 in your bootstrap liftweb Boot.
      * @version 1.12.9
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{FoBoPop => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Popper1129
      * }}}
      * @since v2.0
      */
    case object Popper1129 extends Toolkit {
      net.liftmodules.fobopop.Toolkit.Popper1129
    }

    /*===Tooltip Toolkit===============================================================*/

    /**
      * Enable usage FoBo's Tooltip API and resources version 1&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 1.1.4
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{FoBoToo => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Tooltip114
      * }}}
      * @since v2.0
      */
    case object Tooltip114 extends Toolkit {
      net.liftmodules.fobotoo.Toolkit.Tooltip114
    }

  } //end Toolkit

  /*=== Resource ============================================*/

  object Resource extends Resource {
    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store: Store = List()
    def init: Store          = store
    def init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobo.Resource = " + store.toString()

    /*===Angular Resource===============================================================*/

    /**
      * Enable usage of FoBo's AngularJS version 1&#8228;5&#8228;3 resources files in your bootstrap liftweb Boot.
      * @version 1.5.3
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AngularJS153
      * }}}
      *
      */
    case object AngularJS153 extends Resource {
      net.liftmodules.foboajs.Resource.AngularJS153
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.5.3 i18n
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AngularJS153i18n
      * }}}
      *
      */
    case object AngularJS153i18n extends Resource {
      net.liftmodules.foboajs.Resource.AngularJS153i18n
    }

    /**
      * Enable usage of FoBo's AngularJS version 1&#8228;4&#8228;8 resources files in your bootstrap liftweb Boot.
      * @version 1.4.8
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AngularJS148
      * }}}
      *
      */
    case object AngularJS148 extends Resource {
      net.liftmodules.foboajs.Resource.AngularJS148
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.8 i18n
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AngularJS148i18n
      * }}}
      *
      */
    case object AngularJS148i18n extends Resource {
      net.liftmodules.foboajs.Resource.AngularJS148i18n
    }

    /**
      * Enable usage of AngularJS version 1&#8228;4&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resources.init=fobo.Resouces.AngularJS148
      * }}}
      *
      */
    case object AngularJS141 extends Resource {
      net.liftmodules.foboajs.Resource.AngularJS141
    }

    /**
      * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
      * @version 1.4.1 i18n
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resources.init=fobo.Resources.AngularJS141i18n
      * }}}
      *
      */
    case object AngularJS141i18n extends Resource {
      net.liftmodules.foboajs.Resource.AngularJS141i18n
    }

    /**
      * Enable usage of AngularJS version 1&#8228;3&#8228;15 resource files in your bootstrap liftweb Boot.
      * @version 1.3.15
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resources.init=fobo.Resources.AngularJS1315
      * }}}
      *
      */
    case object AngularJS1315 extends Resource {
      net.liftmodules.foboajs.Resource.AngularJS1315
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.3.15 i18n
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resources.init=fobo.Resources.AngularJS1315i18n
      * }}}
      *
      */
    case object AngularJS1315i18n extends Resource {
      net.liftmodules.foboajs.Resource.AngularJS1315i18n
    }

    /**
      * Enable usage of AngularJS version 1&#8228;2&#8228;19 resource files in your bootstrap liftweb Boot.
      * @version 1.2.19
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AngularJS1219
      * }}}
      *
      */
    case object AngularJS1219 extends Resource {
      net.liftmodules.foboajs.Resource.AngularJS1219
    }

    /**
      * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
      * @version 1.2.19 i18n
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AngularJS1219i18n
      * }}}
      *
      */
    case object AngularJS1219i18n extends Resource {
      net.liftmodules.foboajs.Resource.AngularJS1219i18n
    }

    /**
      * Enable usage of Angular Material version 1&#8228;0&#8228;8 resource files in your bootstrap liftweb Boot.
      * @version 1.0.8
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AJMaterial108
      * }}}
      *
      */
    @deprecated("Use AJMaterial111 or later", "2.0.0")
    case object AJMaterial108 extends Resource {
      net.liftmodules.foboajs.Resource.AJMaterial108
    }

    /**
      * Enable usage of Angular Material version 1&#8228;1&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 1.1.1
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AJMaterial111
      * }}}
      * @since v1.7
      */
    case object AJMaterial111 extends Resource {
      net.liftmodules.foboajs.Resource.AJMaterial111
    }

    /**
      * Enable usage of Angular Material version 1&#8228;1&#8228;4 resource files in your bootstrap liftweb Boot.
      * @version 1.1.4
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AJMaterial114
      * }}}
      * @since v2.0
      */
    case object AJMaterial114 extends Resource {
      net.liftmodules.foboajs.Resource.AJMaterial114
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 2&#8228;5&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 2.5.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AJSUIBootstrap250
      * }}}
      *
      */
    case object AJSUIBootstrap250 extends Resource {
      net.liftmodules.foboajs.Resource.AJSUIBootstrap250
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;10&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.10.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AJSUIBootstrap0100
      * }}}
      *
      */
    case object AJSUIBootstrap0100 extends Resource {
      net.liftmodules.foboajs.Resource.AJSUIBootstrap0100
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;7&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.7.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AJSUIBootstrap070
      * }}}
      *
      */
    case object AJSUIBootstrap070 extends Resource {
      net.liftmodules.foboajs.Resource.AJSUIBootstrap070
    }

    /**
      * Enable usage of AngularUI-Bootstrap version 0&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 0.2.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AJSUIBootstrap020
      * }}}
      *
      */
    case object AJSUIBootstrap020 extends Resource {
      net.liftmodules.foboajs.Resource.AJSUIBootstrap020
    }

    /**
      * Enable usage of NG-Grid version 2&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
      * @version 2.0.7
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AJSNGGrid207
      * }}}
      *
      */
    case object AJSNGGrid207 extends Resource {
      net.liftmodules.foboajs.Resource.AJSNGGrid207
    }

    /**
      * Enable usage of UI-Grid version 3&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
      * @version 3.0.7
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.AJSUIGrid307
      * }}}
      *
      */
    case object AJSUIGrid307 extends Resource {
      net.liftmodules.foboajs.Resource.AJSUIGrid307
    }

    /*===Font Awesome Resource===============================================================*/

    /**
      * Enable usage of FoBo's FontAwesome resources version 5&#8228;5&#8228;0 in your bootstrap liftweb Boot.
      * @version 5.5.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome550
      * }}}
      * @since v2.1.0
      */
    case object FontAwesome550 extends Resource {
      net.liftmodules.fobofa.Resource.FontAwesome550
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;7&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.7.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome470
      * }}}
      */
    case object FontAwesome470 extends Resource {
      net.liftmodules.fobofa.Resource.FontAwesome470
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;6&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.6.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome463
      * }}}
      */
    case object FontAwesome463 extends Resource {
      net.liftmodules.fobofa.Resource.FontAwesome463
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.3.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome430
      * }}}
      */
    case object FontAwesome430 extends Resource {
      net.liftmodules.fobofa.Resource.FontAwesome430
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.1.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome410
      * }}}
      */
    case object FontAwesome410 extends Resource {
      net.liftmodules.fobofa.Resource.FontAwesome410
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.0.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome403
      * }}}
      */
    case object FontAwesome403 extends Resource {
      net.liftmodules.fobofa.Resource.FontAwesome403
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.2.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome321
      * }}}
      */
    case object FontAwesome321 extends Resource {
      net.liftmodules.fobofa.Resource.FontAwesome321
    }

    /*===Google Code Prettify Resource===============================================================*/

    /**
      * Enable usage of FoBo's Google Code Prettify API and resources version Jun2011 in your bootstrap liftweb Boot.
      * @version Jun2011
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.PrettifyJun2011
      * }}}
      */
    case object PrettifyJun2011 extends Resource {
      net.liftmodules.fobogcp.Resource.PrettifyJun2011
    }

    /*===JQuery Resource===============================================================*/

    /**
      * Enable usage of fobo's JQuery resources version 3&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.4.1
      * OBS! JQuery 3.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery341
      * }}}
      * @since v2.12
      */
    case object JQuery341 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery341
    }

    /**
      * Enable usage of fobo's JQuery resources version 3&#8228;3&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.3.1
      * OBS! JQuery 3.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery331
      * }}}
      * @since v2.12
      */
    case object JQuery331 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery331
    }

    /**
      * Enable usage of fobo's JQuery resources version 3&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.1.0
      * OBS! JQuery 3.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery310
      * }}}
      * @since v2.10
      */
    case object JQuery310 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery310
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQueryMigrate300
      * }}}
      * @since v2.10
      */
    case object JQueryMigrate300 extends Resource {
      net.liftmodules.fobojq.Resource.JQueryMigrate300
    }

    /**
      * Enable usage of FoBo's JQuery resources version 3&#8228;0&#8228;0 in your bootstrap liftweb Boot.
      * @version 3.0.0
      * OBS! JQuery 3.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery300
      * }}}
      * @since v2.10
      */
    case object JQuery300 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery300
    }

    /**
      * Enable usage of FoBo's JQuery resources version 2&#8228;2&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.2.4
      * OBS! JQuery 2.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery224
      * }}}
      * @since v2.10
      */
    case object JQuery224 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery224
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.4.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQueryMigrate141
      * }}}
      * @since v2.10
      */
    case object JQueryMigrate141 extends Resource {
      net.liftmodules.fobojq.Resource.JQueryMigrate141
    }

    /**
      * Enable usage of FoBo's JQuery-Migrate resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.2.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQueryMigrate121
      * }}}
      */
    case object JQueryMigrate121 extends Resource {
      net.liftmodules.fobojq.Resource.JQueryMigrate121
    }

    /**
      * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 2.1.4
      * OBS! JQuery 2.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery214
      * }}}
      */
    case object JQuery214 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery214
    }

    /**
      * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
      * @version 2.1.1
      * OBS! JQuery 2.x does not support Internet Explorer 6, 7, or 8.
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery211
      * }}}
      */
    case object JQuery211 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery211
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
      * @version 1.11.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery1113
      * }}}
      */
    case object JQuery1113 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery1113
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.10.2
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery1102
      * }}}
      */
    case object JQuery1102 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery1102
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
      * @version 1.9.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery191
      * }}}
      */
    case object JQuery191 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery191
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.8.2
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery182
      * }}}
      */
    case object JQuery182 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery182
    }

    /**
      * Enable usage of FoBo's JQuery resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.7.2
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.JQuery172
      * }}}
      */
    case object JQuery172 extends Resource {
      net.liftmodules.fobojq.Resource.JQuery172
    }

    /*===Pace Resource===============================================================*/
    /**
      * Enable usage of FoBo's Pace resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.0.2
      *
      * @example
      *
      * {{{
      *   fobo.Resource.init=fobo.Resource.Pace102
      * }}}
      */
    case object Pace102 extends Resource {
      net.liftmodules.fobopa.Resource.Pace102
    }

    /**
      * Enable usage of FoBo's Pace resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
      * @version 0.4.15
      *
      * @example
      *
      * {{{
      *   fobo.Resource.init=fobo.Resource.Pace0415
      * }}}
      */
    case object Pace0415 extends Resource {
      net.liftmodules.fobopa.Resource.Pace0415
    }

    /*===Bootstrap4 Resource===============================================================*/

    /**
      * Enable usage of Bootstrap version 4&#8228;1&#8228;3 resource files in your bootstrap liftweb Boot.
      * @version 4.1.3
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap413
      * }}}
      * @since v2.0.1
      */
    case object Bootstrap413 extends Resource {
      net.liftmodules.fobobs4.Resource.Bootstrap413
    }

    /**
      * Enable usage of Bootstrap version 4&#8228;0&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 4.0.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap400
      * }}}
      * @since v2.0
      */
    case object Bootstrap400 extends Resource {
      net.liftmodules.fobobs4.Resource.Bootstrap400
    }

    /*===Bootstrap3 Resource===============================================================*/

    /**
      * Enable usage of Bootstrap version 3&#8228;3&#8228;7 resource files in your bootstrap liftweb Boot.
      * @version 3.3.7
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap337
      * }}}
      * @since v1.7
      */
    case object Bootstrap337 extends Resource {
      net.liftmodules.fobobs.Resource.Bootstrap337
    }

    /**
      * Enable usage of Bootstrap version 3&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version 3.2.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap320
      * }}}
      *
      */
    case object Bootstrap320 extends Resource {
      net.liftmodules.fobobs.Resource.Bootstrap320
    }

    /**
      * Enable usage of Bootstrap version 3&#8228;1&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 3.1.1
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap311
      * }}}
      *
      */
    case object Bootstrap311 extends Resource {
      net.liftmodules.fobobs.Resource.Bootstrap311
    }

    /**
      * Enable usage of Bootstrap version 3&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 3.0.1
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap301
      * }}}
      *
      */
    case object Bootstrap301 extends Resource {
      net.liftmodules.fobobs.Resource.Bootstrap301
    }

    /*===Bootstrap2 Resource===============================================================*/

    /**
      * Enable usage of Bootstrap version 3&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
      * @version 2.3.2
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap232
      * }}}
      *
      */
    case object Bootstrap232 extends Resource {
      net.liftmodules.fobotb.Resource.Bootstrap232
    }

    /*===Highlight Resource===============================================================*/

    /**
      * Enable usage of FoBo's Highlight JS version 9&#8228;3&#8228;0 resource files in your bootstrap liftweb Boot.
      * @version v9.3.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.HighlightJS930
      * }}}
      */
    case object HighlightJS930 extends Resource {
      net.liftmodules.fobohl.Resource.HighlightJS930
    }

    /*===Popper Resource===============================================================*/

    /**
      * Enable usage of FoBo's Popper version 1&#8228;12&#8228;9 resource files in your bootstrap liftweb Boot.
      * @version v1.12.9
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.Popper1129
      * }}}
      * @since v2.0
      */
    case object Popper1129 extends Resource {
      net.liftmodules.fobopop.Resource.Popper1129
    }

    /*===Tooltip Resource===============================================================*/

    /**
      * Enable usage of FoBo's Popper Tooltip version 1&#8228;1&#8228;4 resource files in your bootstrap liftweb Boot.
      * @version v1.1.4
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.Resource.init=fobo.Resource.Tether140
      * }}}
      * @since v2.0
      */
    case object Tooltip114 extends Resource {
      net.liftmodules.fobotoo.Resource.Tooltip114
    }

  }

  /*=== API ============================================*/

  object API extends API {
    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store: Store = List()
    def init: Store          = store
    def init_=(t: API): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobo.API = " + store.toString()

    /*===Angular API===============================================================*/
    /**
      * Enable usage of FoBo's AngularJS API 1&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 1.4.8
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.API.init=fobo.API.Angular1
      * }}}
      *
      */
    case object Angular1 extends API {
      net.liftmodules.foboajs.API.Angular1
    }

    /*===Bootstrap API===============================================================*/

    /**
      * Enable usage of FoBo's Bootstrap API 4&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 4.x.x
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.API.init=fobo.API.Bootstrap4
      * }}}
      *
      */
    case object Bootstrap4 extends API {
      net.liftmodules.fobobs4.API.Bootstrap4
    }

    /**
      * Enable usage of FoBo's Bootstrap API 3&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 3.x.x
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.API.init=fobo.API.Bootstrap3
      * }}}
      *
      */
    case object Bootstrap3 extends API {
      net.liftmodules.fobobs.API.Bootstrap3
    }

    /**
      * Enable usage of FoBo's Bootstrap API 2&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 2.x.x
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.API.init=fobo.API.Bootstrap2
      * }}}
      *
      */
    case object Bootstrap2 extends API {
      fobotb.API.Bootstrap2
    }

    /*===Font Awesome API===============================================================*/

    /*===Google Code Prettify API===============================================================*/

    /*===Highlight API===============================================================*/

    /**
      * Enable usage of FoBo's Pace API version 9&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 9.X.X
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.API.init=fobo.API.HighlightJS9
      * }}}
      */
    case object HighlightJS9 extends API {
      fobohl.API.HighlightJS9
    }

    /*===Kinetic API===============================================================*/

    /*===Pace API===============================================================*/

    /*===FoBo API ==============================================================*/

    /**
      * Enable usage of FoBo's FoBo API 1&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 1.x.x
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.fobo
      *    :
      *   fobo.API.init=fobo.API.FoBo1
      * }}}
      *
      */
    case object FoBo1 extends API {
      net.liftmodules.foboapi.API.FoBo1
    }

  }

}
