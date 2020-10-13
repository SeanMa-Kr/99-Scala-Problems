package org.p99.scala

import org.p99.scala.P34.totient
import org.scalatest._

class P34Spec extends UnitSpec {

  it should "calculate Euler's totient function phi(m)" in {
    assert(totient(10) == 4)
    assert(totient(28) == 12)
    assert(totient(65) == 48)
    assert(totient(79) == 78)
  }

}

