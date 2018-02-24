// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user0/Projects/random-quote/conf/routes
// @DATE:Mon Mar 12 12:13:13 EAT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseQuotesController QuotesController = new controllers.ReverseQuotesController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseQuotesController QuotesController = new controllers.javascript.ReverseQuotesController(RoutesPrefix.byNamePrefix());
  }

}
