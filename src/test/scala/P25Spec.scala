package org.p99.scala

import org.p99.scala.P25.randomPermute
import org.scalatest._

class P25Spec extends UnitSpec {

  it should "generate a random permutation of the elements of a list" in {
    assert(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)).length == List('b, 'a, 'd, 'c, 'e, 'f).length)
  }

}

