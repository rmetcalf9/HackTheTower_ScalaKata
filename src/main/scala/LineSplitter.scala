/**
  * Created by robert on 13/05/17.
  */
object LineSplitter {
  def wrap(inputToWrap: String, columns: Int) = {
/*    if (inputToWrap.length < columns) inputToWrap
    else {
      var output = ""
      val words = inputToWrap.split(" ")
      var numWords = words.length
      var charsThisLine = 0
      for ( i <- 0 until words.length) {
        output += words(i)
        charsThisLine += words(i).length
        output = output + (
          if ( i equals (numWords - 1) ) "" else (
            if ( charsThisLine + words(i+1).length > columns ) {
              charsThisLine = 0
              ("\n")
            } else {
              charsThisLine = charsThisLine + 1
              (" ")
            }
          )
        )
      }

      output*/
val s = "fooasdasdasd"

    val res = inputToWrap.toList.foldLeft((0, "" :: List.empty[String])) { (b, c) => b match {
      case (n, xs) => if(n < columns - 2) {
        (n + 1, c + xs.head :: xs.tail)
      } else {
        (0, c.toString :: xs.head.reverse :: xs.tail)
      }
    }}


    res._2.reverse
  }

}
