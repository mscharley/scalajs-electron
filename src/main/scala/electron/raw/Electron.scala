package electron.raw

import electron.raw
import electron.ipc

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal
abstract class Electron extends js.Object {
  val app: raw.Application = js.native
  val BrowserWindow: js.Dynamic = js.native
  val ipcMain: nodejs.raw.EventEmitter = js.native
  val ipcRenderer: ipc.IpcRenderer = js.native
}
