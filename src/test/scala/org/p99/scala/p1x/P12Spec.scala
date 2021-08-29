package org.p99.scala.p1x

import org.p99.scala.UnitSpec
import org.p99.scala.p1x.P12._

class P12Spec extends UnitSpec {

  it should "return decoded run-length encoded list." in {
    assert(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

}

