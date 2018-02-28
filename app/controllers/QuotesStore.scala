package controllers

import play.api.libs.json._
import play.api.MarkerContext
import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

import akka.actor.ActorSystem
import play.api.libs.functional.syntax._
import play.api._
import scala.concurrent.Future
import scala.io.Source

case class Response(status: String, message: String, code: Int)

object Response {
  implicit val implicitWrites = new Writes[Response] {
    def writes(res: Response): JsValue = {
      Json.obj(
        "status" -> res.status,
        "message" -> res.message,
        "code" -> res.code
      )
    }
  }
}

trait QuoteStore {
  def get_quotes()(implicit mc: MarkerContext): Future[Response]
}

@Singleton
class QuoteStoreImplementation @Inject()(env: Environment)(
    implicit ec: ExecutionContext)
    extends QuoteStore {
  def printFile(): String = {
    println("printFile")
    "hello file"
  }

  override def get_quotes(implicit mc: MarkerContext): Future[Response] = {
    Future {
      printFile()
      Response("OK", "Hello", 200)
    }
  }
}
