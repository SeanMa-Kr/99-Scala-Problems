package org.p99.scala.p0x

import org.p99.scala.UnitSpec
import org.p99.scala.p0x.P07._

class P07Spec extends UnitSpec {

  it should "return flattened list which has a nested structure." in {
    assert(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

}

