package electron.raw

import nodejs.raw.EventEmitter

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal
private[electron] abstract class Application extends js.Object with EventEmitter {
  def quit(): Unit = js.native
}
