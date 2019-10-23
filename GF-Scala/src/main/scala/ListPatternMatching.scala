object ListPatternMatching {
  def head[T](list: List[T]): T =
    list match {
      case head :: rest => head
    }

  @scala.annotation.tailrec
  // Will not handle nil case! Might need an extra case to handle that and make it an Option[T] instead
  def tail[T](list: List[T]): T =
    list match {
      case head :: Nil => head
      case head :: rest => tail(rest)
    }

  def printValuesFromTuple(tuple: Tuple2[Int, Int]): Unit =
    tuple match {
      case (first, second) => println(s"First in tuple: $first \nSecond in tuple: $second")
    }

  def main(args: Array[String]): Unit = {
    val intList = List(1, 2, 3, 4, 5)
    println("Head: %s".format(head(intList)))
    println("Tail: %s".format(tail(intList)))
    printValuesFromTuple(Tuple2(1,2))
  }
}
