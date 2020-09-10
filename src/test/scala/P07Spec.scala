package org.p99.scala

import org.scalatest._

class P07Spec extends UnitSpec {

  it should "return flattened list which has a nested structure." in {
    assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

}

