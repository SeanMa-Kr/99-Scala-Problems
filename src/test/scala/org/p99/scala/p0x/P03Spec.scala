package org.p99.scala.p0x

import org.p99.scala.UnitSpec
import org.p99.scala.p0x.P03._

class P03Spec extends UnitSpec {

  it should "return Kth element of it." in {
    assert(nth(List(1, 1, 2, 3, 5, 8), 2) == 2)
  }

}

