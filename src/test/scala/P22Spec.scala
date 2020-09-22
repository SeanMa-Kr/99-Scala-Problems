package org.p99.scala

import org.p99.scala.P22.range
import org.scalatest._

class P22Spec extends UnitSpec {

  it should "create a list containing all integers within a given range" in {
    assert(range(4, 9) == List(4, 5, 6, 7, 8, 9))
  }

}

