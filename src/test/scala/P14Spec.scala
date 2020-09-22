package org.p99.scala

import org.p99.scala.P14.duplicate
import org.scalatest._

class P14Spec extends UnitSpec {

  it should "N times duplicate the elements of a list" in {
    assert(duplicate(List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

}

