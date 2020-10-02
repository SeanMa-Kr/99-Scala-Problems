package org.p99.scala

import org.p99.scala.P31.isPrime
import org.scalatest._

class P31Spec extends UnitSpec {

  it should "determine whether a given integer number is prime" in {
    assert(isPrime(7))
    assert(!isPrime(124))
    assert(isPrime(953))
    assert(!isPrime(955))
  }

}

