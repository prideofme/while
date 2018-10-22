import java.io
import java.io.{BufferedReader, InputStreamReader}

import scala.reflect.io.File

object inputFromPanel {
  def main(args: Array[String]): Unit = {
    println("iiii")
    /*var line = ""
    do{
      line = readLine()
      println(line)
    }while(line != null)*/
    /*var br = new BufferedReader(new InputStreamReader(System.in))
    var x = Integer.parseUnsignedInt(br.readLine())
    var y = Integer.parseUnsignedInt(br.readLine())
    var result = gcd(y,x)
    println(result)*/

  }

  def gcd(x: Int , y: Int): Int ={
    if(y == 0) x else gcd(x,x%y)
  }

  def for_you(file: String): Unit ={
    var file_here = new java.io.File(file).listFiles()
    for(fi <- file_here)
      println(fi)

  }

}
/*
object HelloWorld{
  def main(args : Array[String]){
    println("HelloWorld")
  }
}*/
