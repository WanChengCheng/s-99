package s99

/*
P02 (*) Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
 */
object p02 {
  def penultimate(list: List[Int]): Int = {
    list match {
      case x :: _ :: Nil => x
      case _ :: tail => penultimate(tail)
      case _ => throw new NoSuchElementException
    }
  }

  // polymorphic with type parameter
  def penultimate[T](list: List[T]): T = {
    list match {
      case x :: _ :: Nil => x
      case _ :: tail => penultimate(tail)
      case _ => throw new NoSuchElementException
    }
  }
}
