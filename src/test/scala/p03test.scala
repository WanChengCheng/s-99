import org.scalatest.FlatSpec
import s99.p03

class p03test extends FlatSpec {
  it should "return the 2 element in List" in {
    assert(2 == p03.nth(2, List(0, 1, 2)))
  }

  it should "throw IndexOutOfBoundsException" in {
    assertThrows[IndexOutOfBoundsException] {
      p03.nth(-1, List(0, 1, 2, 3))
    }
    assertThrows[IndexOutOfBoundsException] {
      p03.nth(100, List(1))
    }
  }
}
