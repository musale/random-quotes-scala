// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user0/Projects/random-quote/conf/routes
// @DATE:Mon Mar 12 12:13:13 EAT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseQuotesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def fetch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "quotes")
    }
  
    // @LINE:2
    def add(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "quotes")
    }
  
  }


}
