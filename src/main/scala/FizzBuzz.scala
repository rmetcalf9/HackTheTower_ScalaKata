/**
  * Created by robert on 13/05/17.
  */
object FizzBuzz {
  def getResult(inputNumber: Int) = {
    // Must check 15 before 5 otherwise 15 will never fire as 15 is also divisible by 5
    ( inputNumber % 15 ) match {
      case 0 => "fizzbuzz"
      case 5 | 10 => "buzz"
      case 3 | 6 | 9 | 12 => "fizz"
      case _ => inputNumber
    }
  }

}
