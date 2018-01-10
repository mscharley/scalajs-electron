package electron.raw

import electron.WebContents
import nodejs.raw.EventEmitter

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal
private[electron] abstract class BrowserWindow extends js.Object with EventEmitter {
  def loadURL(url: String): Unit = js.native
  val webContents: WebContents = js.native
}
