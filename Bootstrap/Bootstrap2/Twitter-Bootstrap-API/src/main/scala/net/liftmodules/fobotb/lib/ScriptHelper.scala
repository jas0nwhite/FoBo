package net.liftmodules.fobotb.lib

import net.liftweb.http.js._
import net.liftweb.http.js.JE.JsRaw

/**
  * ==Script Helper Bootstrap v2.x==
  * This script helper is a helper class that implements some commonly used script functions.
  * This convenience script functions is used in the FoBo.ScriptHelper snippet but
  * can also be used as a convenience helper in your own customized snippets.
  *
  * @example If you find that the net.liftmodules.FoBo.snippet.FoBo.ScriptHelper snippet dose not fit you exact needs
  * your can still use the ScriptHelper class to customize your own project snippets.
  * {{{
  *   import net.liftmodules.FoBo.lib.{ScriptHelper=>sch}
  *    :
  *   class MySnippet {
  *
  *     lazy val sch = new sch()
  *
  *     def someFunc = {
  *       :
  *       sch.fobohelper(...)
  *       :
  *     }
  *     :
  *   }
  * }}}
  */
class ScriptHelper() {

  /**
    * This function creates a register load event factory function.
    */
  def registerLoadEventFactory() = {
    var sc = JsRaw("""function addLoadEvent(func) {
            var oldonload = window.onload;
            if (typeof window.onload != 'function') {
               window.onload = func;
            } else {
               window.onload = function() {
                  if (oldonload) {
                     oldonload();
                  }
                  func();
               }
            }
         }""").cmd
    JsCmds.Script(sc)
  }

  /**
    * This function adds a specific load event to the load event factory function.
    */
  def addLoadEvent(event: String): scala.xml.Node = {
    var sc = JsRaw("""addLoadEvent(function() { %s });""".format(event)).cmd
    JsCmds.Script(sc)
  }
}
