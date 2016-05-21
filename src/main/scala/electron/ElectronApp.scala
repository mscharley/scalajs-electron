package electron

import nodejs.Require
import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportDescendentObjects

@JSExportDescendentObjects
abstract class ElectronApp(require: Require) {
  val rawElectron = require("electron").asInstanceOf[raw.Electron]
  implicit val electron = new Electron(rawElectron)
  lazy val process = js.Dynamic.global.process

  val electronApp = electron.app
}
