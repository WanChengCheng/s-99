import org.scalatest._
import s99.p02


class p02test extends FlatSpec {
  it should "return the last but one int in list" in {
    assert(4 == p02.penultimate(List(1, 2, 3, 4, 5)))
  }

  it should "throw NoSuchElementException when condition not meet" in {
    assertThrows[NoSuchElementException] {
      p02.penultimate(List(1))
    }
  }

  it should "return the correct element in List" in {
    assert("A" == p02.penultimate(List("A", "B")))
  }
}
