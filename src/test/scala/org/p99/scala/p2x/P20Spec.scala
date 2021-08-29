package org.p99.scala.p2x

import org.p99.scala.UnitSpec
import org.p99.scala.p2x.P20._

class P20Spec extends UnitSpec {

  it should "remove the Kth element from a list" in {
    assert(removeAt(1, List('a, 'b, 'c, 'd)) == (List('a, 'c, 'd), 'b))
  }

}

