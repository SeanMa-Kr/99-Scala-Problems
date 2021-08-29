package org.p99.scala.p1x

import org.p99.scala.UnitSpec
import org.p99.scala.p1x.P14._

class P14Spec extends UnitSpec {

  it should "N times duplicate the elements of a list" in {
    assert(duplicate(List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

}

