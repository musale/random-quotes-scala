package models

import play.api.libs.json._

case class QuoteModel(text: String, author: String)

object QuoteModel {
  implicit val implicitWrites = new Writes[QuoteModel] {
    def writes(quote: QuoteModel): JsValue = {
      Json.obj(
        "text" -> quote.text,
        "author" -> quote.author
      )
    }
  }
}
