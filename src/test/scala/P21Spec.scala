package org.p99.scala

import org.p99.scala.P21.insertAt
import org.scalatest._

class P21Spec extends UnitSpec {

  it should "insert an element at a given position into a list" in {
    assert(insertAt('new, 1, List('a, 'b, 'c, 'd)) == List('a, 'new, 'b, 'c, 'd))
  }

}

