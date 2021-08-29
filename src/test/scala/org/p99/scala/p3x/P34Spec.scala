package org.p99.scala.p3x

import org.p99.scala.UnitSpec
import org.p99.scala.p3x.P34._

class P34Spec extends UnitSpec {

  it should "calculate Euler's totient function phi(m)" in {
    assert(totient(10) == 4)
    assert(totient(28) == 12)
    assert(totient(65) == 48)
    assert(totient(79) == 78)
  }

}

