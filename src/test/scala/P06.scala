import org.scalatest.FlatSpec
import s99.P06

class P06 extends FlatSpec {
  it should "return true for List(1,2,1)" in {
    assert(true == P06.isPalindrome(List(1, 2, 1)))
  }
}

