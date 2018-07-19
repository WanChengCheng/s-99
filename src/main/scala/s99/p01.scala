package s99

// find the last element of list
object p01 {
  //  scala> last(List(1, 1, 2, 3, 5, 8))
  //  res0: Int = 8
  def last(list: List[Int]): Int = {
    list match {
      case x :: Nil => x
      case Nil => throw new Exception
      case x :: rest => last(rest)
    }
  }
}
