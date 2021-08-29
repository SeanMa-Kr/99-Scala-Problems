package org.p99.scala.p2x

import org.p99.scala.UnitSpec
import org.p99.scala.p2x.P25._

class P25Spec extends UnitSpec {

  it should "generate a random permutation of the elements of a list" in {
    assert(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)).length == List('b, 'a, 'd, 'c, 'e, 'f).length)
  }

}

