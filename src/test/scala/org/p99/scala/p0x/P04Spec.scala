package org.p99.scala.p0x

import org.p99.scala.UnitSpec
import org.p99.scala.p0x.P04._

class P04Spec extends UnitSpec {

  it should "return the last element of it." in {
    assert(length(List(1, 1, 2, 3, 5, 8)) == 6)
  }

}

