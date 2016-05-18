package electron

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportDescendentObjects

@JSExportDescendentObjects
abstract class ElectronApp(rawElectron: raw.Electron) extends js.JSApp {
  implicit val electron = new Electron(rawElectron)
  lazy val process = js.Dynamic.global.process

  val electronApp = electron.app
}
