package org.p99.scala

import org.scalatest._

class P12Spec extends UnitSpec {

  it should "return decoded run-length encoded list." in {
    assert(P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

}

