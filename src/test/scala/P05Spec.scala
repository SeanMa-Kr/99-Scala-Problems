package org.p99.scala

import org.scalatest._

class P05Spec extends UnitSpec {

  it should "return the reversed list of it." in {
    assert(P05.reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  }

}

