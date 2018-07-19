import org.scalatest.FlatSpec
import s99.p04


class p04test extends FlatSpec {
  it should "return the length of the list" in {
    val list = List(1, 2, 3)
    assert(list.length == p04.length(list))
  }
  it should "return the correct length" in {
    val list = List(1, 2, 3)
    assert(list.length == p04.lengthFunctional(list))
  }
}
