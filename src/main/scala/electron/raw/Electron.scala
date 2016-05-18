package electron.raw

import electron.raw

import scala.scalajs.js

@js.native
abstract class Electron extends js.Object {
  val app: raw.Application = js.native
  val BrowserWindow: js.Dynamic = js.native
}
