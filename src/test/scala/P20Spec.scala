package org.p99.scala

import org.p99.scala.P20.removeAt
import org.scalatest._

class P20Spec extends UnitSpec {

  it should "remove the Kth element from a list" in {
    assert(removeAt(1, List('a, 'b, 'c, 'd)) == (List('a, 'c, 'd), 'b))
  }

}

