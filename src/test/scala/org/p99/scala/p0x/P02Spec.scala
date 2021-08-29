package org.p99.scala.p0x

import org.p99.scala.UnitSpec
import org.p99.scala.p0x.P02._

class P02Spec extends UnitSpec {

  it should "return the last but one element of it." in {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }

}

