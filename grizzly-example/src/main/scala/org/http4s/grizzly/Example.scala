package org.http4s
package grizzly

/**
 * @author Bryce Anderson
 * @author ross
 */

object Example extends App {

  import concurrent.ExecutionContext.Implicits.global

  SimpleGrizzlySever(serverRoot = "/http4s/*")(ExampleRoute())

}
