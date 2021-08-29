package org.p99.scala.p1x

import org.p99.scala.UnitSpec
import org.p99.scala.p1x.P16._

class P16Spec extends UnitSpec {

  it should "drop every Nth element from a list" in {
    assert(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }

}

