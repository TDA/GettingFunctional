package main.scala

object TailRecursion {

  @scala.annotation.tailrec
  def fibonacciTailRecursion(number: Int, firstNumber: BigInt, secondNumber: BigInt): BigInt = {
    if (number == 0) secondNumber else fibonacciTailRecursion(number - 1, firstNumber + secondNumber, firstNumber)
  }

  def main(args: Array[String]): Unit = {
    val number = 100
    val first = BigInt("0")
    val second = BigInt("1")

    println(fibonacciTailRecursion(number, firstNumber = first, secondNumber = second))
  }
}
