// Load the plugin from Maven Central via ivy/coursier
import $ivy.`de.tototec::de.tobiasroeser.mill.kotlin_mill0.9:0.2.0`

import mill._
import mill.scalalib._
import mill.define._

import de.tobiasroeser.mill.kotlin._

object HelloWorld extends KotlinModule {

  // Select the Kotlin version
  def kotlinVersion = T{ "1.4.21" }

  // Set additional Kotlin compiler options, e.g. the language level and annotation processor
  // Run `mill main.kotlincHelp` to get a list of supported options
  def kotlincOptions = super.kotlincOptions() ++ Seq("-verbose")

  def mainClass = Some("hello.MainKt") 

}
