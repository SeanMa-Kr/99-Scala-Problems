package org.p99.scala.p2x

import org.p99.scala.UnitSpec
import org.p99.scala.p2x.P26._

class P26Spec extends UnitSpec {

  it should "generate a random permutation of the elements of a list" in {
    assert(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)).length == 20)
  }


}

