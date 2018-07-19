import org.scalatest._
import s99.P01

class P01test extends FlatSpec {
  "P01 last function" should "return the last element of List" in {
    assert(P01.last(List(1, 2, 3, 4)) == 4)
  }

  it should "throw exception on Nil" in {
    assertThrows[Exception] {
      P01.last(Nil)
    }
  }

  it should "return the last element 2 in List(1,2)" in  {
    assert(2 == P01.last(List(1, 2)))
  }

}
