package org.p99.scala.p1x

import org.p99.scala.UnitSpec
import org.p99.scala.p1x.P11._

class P11Spec extends UnitSpec {

  it should "return modified run-length encoding of it." in {
    assert(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

}

