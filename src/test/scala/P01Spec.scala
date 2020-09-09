package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec {

  it should "return the last element of it." in {
    assert(P01.last(List(1, 1, 2, 3, 5, 8)) == 8)
  }

}

