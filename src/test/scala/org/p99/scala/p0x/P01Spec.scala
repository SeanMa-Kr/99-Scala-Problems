package org.p99.scala.p0x

import org.p99.scala.UnitSpec
import org.p99.scala.p0x.P01._

class P01Spec extends UnitSpec {

  it should "return the last element of it." in {
    assert(last(List(1, 1, 2, 3, 5, 8)) == 8)
  }

}

