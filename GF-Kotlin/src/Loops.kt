fun makeTheNumbersMatch(a: Int, b: Int, x: Int, y: Int) {
    var a = a
    var b = b
    while (a != x || b != y) {
        if (a == x) {
            // do nothing
        } else if (a > x) {
            a--
        } else {
            a++
        }
        if (b == y) {
            // do nothing
        }
        else if (b > y) {
            b--
        } else {
            b++
        }
    }
    println("$a, $b, $x, $y")
}

fun makeTheNumbersMatchFunctional(a: Int, b: Int, x: Int, y: Int) {
    // Not sure if this is even a good comparison...
    var c = a
    var d = b
    while (c != x) {
        when {
            c < x -> c++
            c > x -> c--
        }
    }

    while (d != y) {
        when {
            d < y -> d++
            d > y -> d--
        }
    }
    println("$c, $d, $x, $y")
}

fun main() {
    makeTheNumbersMatch(16, 3, 8,10)
    makeTheNumbersMatchFunctional(16, 3, 8,10)
}
