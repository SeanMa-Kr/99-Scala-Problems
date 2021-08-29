package org.p99.scala.p3x

import org.p99.scala.UnitSpec
import org.p99.scala.p3x.P32._

class P32Spec extends UnitSpec {

  it should "determine the greatest common divisor of two positive integer numbers" in {
    assert(gcd(36, 63) == 9)
  }

}

