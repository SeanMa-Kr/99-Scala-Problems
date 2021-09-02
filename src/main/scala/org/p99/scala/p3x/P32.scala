package org.p99.scala.p3x

import scala.annotation.tailrec

object P32 {
  /*
  * Determine the greatest common divisor of two positive integer numbers.
  * Use Euclid's algorithm.

  * Example:
    scala> gcd(36, 63)
    res0: Int = 9
  * */

  @tailrec
  def gcd(i: Int, j: Int): Int = (math.max(i, j), math.min(i, j)) match {
    case (a, b) if a % b == 0 => b
    case (a, b) => gcd(b, a % b)
  }

}
