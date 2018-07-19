package s99

import scala.annotation.tailrec

//P07 (**) Flatten a nested list structure.
//Example:
//scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//res0: List[Any] = List(1, 1, 2, 3, 5, 8)
object P07 {
  def flatten(list: List[Any]): List[Any] = {
    list flatMap {
      case ms: List[_] => flatten(ms)
      case e => List(e)
      case _ => Some(1)
    }
  }

  def testFlatten() = {
    None
  }
}
