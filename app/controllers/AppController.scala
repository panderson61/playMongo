package controllers

import javax.inject.Inject
import play.api._
import play.api.libs.json.Json
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future}
import scala.io.Source

class AppController @Inject()(environment: Environment, cc: ControllerComponents)(implicit ec: ExecutionContext) extends AbstractController(cc) {

  def health: Action[AnyContent] = Action.async { request =>
    Future {
      Ok(Json.parse("""{"status":"Ok"}"""))
    }
  }

  def version: Action[AnyContent] = Action.async { request =>
    Future {
      val versionFile = environment.rootPath + "/conf/version.json"
      val jsonVersion = Json.parse(Source.fromFile(versionFile).getLines.mkString)
      Ok(Json.toJson(jsonVersion))
    }
  }
}
