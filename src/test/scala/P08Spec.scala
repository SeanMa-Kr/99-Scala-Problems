package org.p99.scala

import org.scalatest._

class P08Spec extends UnitSpec {

  it should "return list which eliminated consecutive duplicates of its elements." in {
    assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }

}

