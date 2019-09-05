import java.math.BigInteger

fun main() {
    val number = 100
    val first = BigInteger("0")
    val second = BigInteger("1")
    // This avoids the stack overflow error by having the recursive call as the last item in its
    // function and passing in a kinda running total or accumulator. This means that at any
    // given point, we need only one stack frame (for the most recent recursed call) and so
    // the compiler can optimize stuff.
    println(fibonacciTailRecursion(number, firstNumber = first, secondNumber = second))

    // This would cause a StackOverflow error
    println(fibonacciRegularRecursion(BigInteger(number.toString())))
}

tailrec fun fibonacciTailRecursion(number: Int, firstNumber: BigInteger, secondNumber: BigInteger): BigInteger {
    return if (number == 0) secondNumber else fibonacciTailRecursion(number - 1, firstNumber + secondNumber, firstNumber)
}

fun fibonacciRegularRecursion(number: BigInteger): BigInteger {
    if (number.equals(0)) {
        return BigInteger("1");
    } else
        return fibonacciRegularRecursion(number.subtract(BigInteger("2"))) + fibonacciRegularRecursion(number.subtract(
            BigInteger("1")))
}
