package controllers

import javax.inject.Inject

import play.api.mvc._
import play.api.libs.json._

import scala.concurrent.ExecutionContext

import models.QuoteModel

// Quotes controller
class QuotesController @Inject()(
    cc: ControllerComponents,
    storage: QuoteStoreImplementation)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def fetch = Action.async { implicit request =>
    storage.get_quotes.map { response =>
      Ok(Json.toJson(response))
    }
  }

  def add = Action { implicit request =>
    Ok(Json.obj("status" -> "OK"))
  }
}
