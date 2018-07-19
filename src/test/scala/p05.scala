import org.scalatest.FlatSpec
import s99.P05

class P05 extends FlatSpec {
  it should "reverse the list" in {
    assert(2 == P05.reverse(List(1, 2))(0))
  }

  it should "equal to List(3,2,1)" in {
    assert(List(3, 2, 1) == P05.reverse(List(1, 2, 3)))
  }

}
