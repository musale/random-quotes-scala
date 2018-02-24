package controllers

import javax.inject.Inject

import play.api.mvc._
import play.api.libs.json._

// Quotes contoller
class QuotesController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def fetch = Action { implicit request =>
    Ok(Json.obj("status"-> "OK"))
  }

  def add = Action {implicit request =>
    Ok(Json.obj("status"-> "OK"))
  }
}
