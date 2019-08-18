import scala.io.Source


object fileCapitelizer extends App {
val rawlines = for(lines <- Source.fromFile("/home/khan/workspace/ScalaProject2/src/fileCapitelizer.scala").getLines()) yield lines
val arrayOfLines= rawlines.toArray
val arrayOfLinesUpperCase = arrayOfLines.map{line => 
    line.split(" ").map(_.capitalize).mkString(" ") 
}
arrayOfLinesUpperCase.foreach(println)

}