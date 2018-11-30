import scala.io.StdIn

object HelloWorldApp extends App {

  val name = StdIn.readLine("Hi! Enter your name: ")

  println(s"Hello $name!")
}
