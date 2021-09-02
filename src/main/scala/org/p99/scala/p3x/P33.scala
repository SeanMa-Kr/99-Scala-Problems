package org.p99.scala.p3x

import org.p99.scala.Easy
import org.p99.scala.p3x.P32.gcd

object P33 extends Easy {
  /*
  * Determine whether two positive integer numbers are coprime.
  * Two numbers are coprime if their greatest common divisor equals 1.

  * Example:
    scala> isCoprimeTo(35, 64)
    res0: Boolean = true
  * */

  def isCoprimeTo(i: Int, j: Int): Boolean = gcd(i, j) == 1

}
