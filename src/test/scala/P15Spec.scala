package org.p99.scala

import org.p99.scala.P15.duplicateN
import org.scalatest._

class P15Spec extends UnitSpec {

  it should "N times duplicate the elements of a list" in {
    assert(duplicateN(3, List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

}

