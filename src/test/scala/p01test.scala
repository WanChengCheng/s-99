import org.scalatest._
import s99.p01

class p01test extends FlatSpec {
  "P01 last function" should "return the last element of List" in {
    assert(p01.last(List(1, 2, 3, 4)) == 4)
  }

  it should "throw exception on Nil" in {
    assertThrows[Exception] {
      p01.last(Nil)
    }
  }

  it should "return the last element 2 in List(1,2)" in  {
    assert(2 == p01.last(List(1, 2)))
  }

}
