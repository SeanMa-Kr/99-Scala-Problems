package org.p99.scala

import org.scalatest._

class P04Spec extends UnitSpec {

  it should "return the last element of it." in {
    assert(P04.length(List(1, 1, 2, 3, 5, 8)) == 6)
  }

}

