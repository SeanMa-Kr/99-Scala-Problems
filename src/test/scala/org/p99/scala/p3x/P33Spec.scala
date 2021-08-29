package org.p99.scala.p3x

import org.p99.scala.UnitSpec
import org.p99.scala.p3x.P33._

class P33Spec extends UnitSpec {

  it should "determine whether two positive integer numbers are coprime" in {
    assert(isCoprimeTo(35, 64))
  }

}

