import org.scalatest.FlatSpec
import s99.p05

class p05 extends FlatSpec {
  it should "reverse the list" in {
    assert(2 == p05.reverse(List(1, 2))(0))
  }

  it should "equal to List(3,2,1)" in {
    assert(List(3, 2, 1) == p05.reverse(List(1, 2, 3)))
  }

}
