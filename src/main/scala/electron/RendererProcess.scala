package electron

import nodejs.Require
import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportDescendentObjects

@JSExportDescendentObjects
abstract class RendererProcess(require: Require) {
  val rawElectron = require("electron").asInstanceOf[raw.Electron]
  implicit val electron = new Electron(rawElectron)
}
