package org.p99.scala.p2x

import org.p99.scala.UnitSpec
import org.p99.scala.p2x.P22._

class P22Spec extends UnitSpec {

  it should "create a list containing all integers within a given range" in {
    assert(range(4, 9) == List(4, 5, 6, 7, 8, 9))
  }

}

