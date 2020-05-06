import scala.io.Source

if (args.length > 0){
  val lines = Source.fromFile(args(0)).getLines().toList
  val longestLine = lines.reduceLeft((a, b) => if (a.length>b.length) a else b)
  val maxWidth = longestLine.length.toString.length
  lines.foreach(line => println(" "*(maxWidth-line.length.toString.length)+line.length+"|"+line))
}
else
  Console.err.println("Please Enter Filename!")
