package s99

import scala.annotation.tailrec

//P03 (*) Find the Kth element of a list.
//By convention, the first element in the list is element 0.
//Example:
//
//scala> nth(2, List(1, 1, 2, 3, 5, 8))
//res0: Int = 2
object P03 {
  //  def nth[A](n: Int, list: List[A]): A = {
  //    list(n)
  //  }

  // with out builtins
  //  def nth[A](n: Int, list: List[A]): A = {
  //    if (n < 0 || n > list.length) {
  //      throw new IndexOutOfBoundsException
  //    }
  //
  //    @tailrec
  //    def loop(i: Int, list: List[A]): A = {
  //      if (i == 0) {
  //        list.head
  //      } else {
  //        loop(i - 1, list.tail)
  //      }
  //    }
  //
  //    loop(n, list)
  //  }

  def nth[A](n: Int, list: List[A]): A = {
    (n, list) match {
      case (0, x :: tail) => x
      case (n, _ :: tail) => nth(n - 1, tail)
      case (_, _) => throw new IndexOutOfBoundsException
    }
  }
}
