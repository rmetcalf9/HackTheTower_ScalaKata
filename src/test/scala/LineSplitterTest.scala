import org.scalatest.{FlatSpec, Matchers}
import org.scalactic.Explicitly._
import org.scalactic.StringNormalizations._

/**
  * Created by robert on 13/05/17.
  */
class LineSplitterTest extends FlatSpec with Matchers {
  "wrap" should "return an empty string if input is empty string" in {
    LineSplitter.wrap("",80) should equal ("")

  }


  "wrap" should "return multiple lines if input is more than columns" in {
    LineSplitter.wrap("Write Word Wrapper", 8) should equal ("Write\nWord\nWrapper")

  }
}
