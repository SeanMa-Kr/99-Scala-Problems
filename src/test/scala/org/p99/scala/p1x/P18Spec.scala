package org.p99.scala.p1x

import org.p99.scala.UnitSpec
import org.p99.scala.p1x.P18._

class P18Spec extends UnitSpec {

  it should "extract a slice from a list" in {
    assert(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g))
  }

}

