package org.p99.scala.p1x

import org.p99.scala.UnitSpec
import org.p99.scala.p1x.P10._

class P10Spec extends UnitSpec {

  it should "return run-length encoding of it." in {
    assert(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

}

