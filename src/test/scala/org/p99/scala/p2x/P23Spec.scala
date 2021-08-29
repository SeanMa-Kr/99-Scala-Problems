package org.p99.scala.p2x

import org.p99.scala.UnitSpec
import org.p99.scala.p2x.P23._

class P23Spec extends UnitSpec {

  it should "extract a given number of randomly selected elements from a list" in {
    assert(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)).length == List('e, 'd, 'a).length)
  }

}

