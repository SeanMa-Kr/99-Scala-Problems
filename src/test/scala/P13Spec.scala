package org.p99.scala

import org.p99.scala.P13.encodeDirect
import org.scalatest._

class P13Spec extends UnitSpec {

  it should "return decoded run-length encoded list" in {
    assert(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  }

}

