package electron

import scala.scalajs.js

class Electron private[electron](electron: raw.Electron) {
  val app: Application = new Application(electron.app)
  val BrowserWindow: js.Dynamic = electron.BrowserWindow
}
