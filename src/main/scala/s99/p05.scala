package s99

object p05 {
  //  def reverse[A](list: List[A]): List[A] = {
  //    list match {
  //      case Nil => Nil
  //      case x :: tail => reverse(tail) ::: List(x)
  //    }
  //  }

  def reverse[A](list: List[A]): List[A] = {
    list.foldLeft(List[A]()) {
      (r, h) => h :: r
    }
  }
}
