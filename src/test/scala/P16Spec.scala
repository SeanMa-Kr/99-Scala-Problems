package org.p99.scala

import org.p99.scala.P16.drop
import org.scalatest._

class P16Spec extends UnitSpec {

  it should "drop every Nth element from a list" in {
    assert(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }

}

