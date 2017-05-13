import org.scalatest._
/**
  * Created by robert on 13/05/17.
  */
class FizzBuzzTest extends FlatSpec with Matchers {
  "FizzBuzz" should "return fizz if the number is dividable by 3" in {
    FizzBuzz.getResult(3) should be ("fizz")
    FizzBuzz.getResult(6) should be  ("fizz")
    FizzBuzz.getResult(18) should be  ("fizz")
  }
  //“buzz” if the number is dividable by 5
  "FizzBuzz" should "return buzz if the number is dividable by 5" in {
    FizzBuzz.getResult(5) should be ("buzz")
    FizzBuzz.getResult(55) should be  ("buzz")
  }
  //"fizzbuzz” if the number is dividable by 15
  "FizzBuzz" should "return fizzbuzz if the number is dividable by 15" in {
    FizzBuzz.getResult(15) should be ("fizzbuzz")
    FizzBuzz.getResult(30) should be  ("fizzbuzz")
  }
  //the same number if no other requirement is fulfilled
  "FizzBuzz" should "otherwise same number" in {
    FizzBuzz.getResult(11) should be (11)
    FizzBuzz.getResult(8) should be  (8)
    FizzBuzz.getResult((34348 * 3) + 2) should be  (((34348 * 3) + 2))
  }
}
