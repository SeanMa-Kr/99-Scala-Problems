package org.p99.scala.p2x

import org.p99.scala.UnitSpec
import org.p99.scala.p2x.P21._

class P21Spec extends UnitSpec {

  it should "insert an element at a given position into a list" in {
    assert(insertAt('new, 1, List('a, 'b, 'c, 'd)) == List('a, 'new, 'b, 'c, 'd))
  }

}

