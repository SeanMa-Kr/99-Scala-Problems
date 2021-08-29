package org.p99.scala.p2x

import org.p99.scala.UnitSpec
import org.p99.scala.p2x.P24._

class P24Spec extends UnitSpec {

  it should "extract a given number of randomly selected elements from a list" in {
    assert(lotto(6, 49).length == List(23, 1, 17, 33, 21, 37).length)
  }

}

