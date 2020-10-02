package org.p99.scala

import org.p99.scala.P33.isCoprimeTo
import org.scalatest._

class P33Spec extends UnitSpec {

  it should "determine whether two positive integer numbers are coprime" in {
    assert(isCoprimeTo(35, 64))
  }

}

