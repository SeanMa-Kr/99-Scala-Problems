package org.p99.scala

import org.p99.scala.P32.gcd
import org.scalatest._

class P32Spec extends UnitSpec {

  it should "determine the greatest common divisor of two positive integer numbers" in {
    assert(gcd(36, 63) == 9)
  }

}

