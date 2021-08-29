package org.p99.scala.p0x

import org.p99.scala.UnitSpec
import org.p99.scala.p0x.P08._

class P08Spec extends UnitSpec {

  it should "return list which eliminated consecutive duplicates of its elements." in {
    assert(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }

}

