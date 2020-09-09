package org.p99.scala

import org.scalatest._

class P02Spec extends UnitSpec {

  it should "return the last but one element of it." in {
    assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }

}

