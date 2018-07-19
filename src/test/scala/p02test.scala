import org.scalatest._
import s99.P02


class P02test extends FlatSpec {
  it should "return the last but one int in list" in {
    assert(4 == P02.penultimate(List(1, 2, 3, 4, 5)))
  }

  it should "throw NoSuchElementException when condition not meet" in {
    assertThrows[NoSuchElementException] {
      P02.penultimate(List(1))
    }
  }

  it should "return the correct element in List" in {
    assert("A" == P02.penultimate(List("A", "B")))
  }
}
