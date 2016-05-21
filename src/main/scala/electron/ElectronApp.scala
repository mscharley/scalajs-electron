package electron

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportDescendentObjects

@JSExportDescendentObjects
abstract class ElectronApp(require: js.Function1[String, js.Any]) {
  val rawElectron = require("electron").asInstanceOf[raw.Electron]
  implicit val electron = new Electron(rawElectron)
  lazy val process = js.Dynamic.global.process

  val electronApp = electron.app
}
