// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user0/Projects/random-quote/conf/routes
// @DATE:Mon Mar 12 12:13:13 EAT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  QuotesController_0: controllers.QuotesController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    QuotesController_0: controllers.QuotesController
  ) = this(errorHandler, QuotesController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, QuotesController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """quotes""", """controllers.QuotesController.fetch"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """quotes""", """controllers.QuotesController.add"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_QuotesController_fetch0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("quotes")))
  )
  private[this] lazy val controllers_QuotesController_fetch0_invoker = createInvoker(
    QuotesController_0.fetch,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QuotesController",
      "fetch",
      Nil,
      "GET",
      this.prefix + """quotes""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_QuotesController_add1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("quotes")))
  )
  private[this] lazy val controllers_QuotesController_add1_invoker = createInvoker(
    QuotesController_0.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QuotesController",
      "add",
      Nil,
      "POST",
      this.prefix + """quotes""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_QuotesController_fetch0_route(params@_) =>
      call { 
        controllers_QuotesController_fetch0_invoker.call(QuotesController_0.fetch)
      }
  
    // @LINE:2
    case controllers_QuotesController_add1_route(params@_) =>
      call { 
        controllers_QuotesController_add1_invoker.call(QuotesController_0.add)
      }
  }
}
