package org.p99.scala.p3x

import org.p99.scala.Medium

object P31 extends Medium {
  /*
  * Determine whether a given integer number is prime.

  * Example:
    scala> isPrime(7)
    res0: Boolean = true
  * */

  def isPrime(n: Int): Boolean =
    if (n % 2 != 0 || n == 2) !(math.sqrt(n).toInt until 1 by -1).exists(i => i % 2 != 0 && n % i == 0) else false

}
