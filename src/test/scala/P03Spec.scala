package org.p99.scala

import org.scalatest._

class P03Spec extends UnitSpec {

  it should "return Kth element of it." in {
    assert(P03.nth(List(1, 1, 2, 3, 5, 8), 2) == 2)
  }

}

