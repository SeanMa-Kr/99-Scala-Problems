package org.p99.scala.p3x

import org.p99.scala.UnitSpec
import org.p99.scala.p3x.P31._

class P31Spec extends UnitSpec {

  it should "determine whether a given integer number is prime" in {
    assert(isPrime(7))
    assert(!isPrime(124))
    assert(isPrime(953))
    assert(!isPrime(955))
  }

}

