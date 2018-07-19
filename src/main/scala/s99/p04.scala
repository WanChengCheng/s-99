package s99

import scala.annotation.tailrec

//P04 (*) Find the number of elements of a list.
//Example:
//scala> length(List(1, 1, 2, 3, 5, 8))
//res0: Int = 6

object p04 {

  @tailrec
  def length[A](list: List[A], start: Int = 0): Int = {
    list match {
      case Nil => start
      case _ :: tail => length(tail, start + 1)
    }
  }

  def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0)((c, _) => c + 1)


}
