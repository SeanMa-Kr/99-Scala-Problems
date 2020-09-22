package org.p99.scala

import org.p99.scala.P26.combinations
import org.scalatest._

class P26Spec extends UnitSpec {

  it should "generate a random permutation of the elements of a list" in {
    assert(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)).length == 20)
  }


}

