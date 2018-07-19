import org.scalatest.FlatSpec
import s99.P07

class P07 extends FlatSpec {
  it should "flatten List(List(1,2) 1,2) as expected" in {
    assert(List(1, 2, 3, 4, 5) == P07.flatten(List(List(1, 2, 3), 4, List(5))))
  }
}
