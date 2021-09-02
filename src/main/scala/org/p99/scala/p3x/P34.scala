package org.p99.scala.p3x

import org.p99.scala.Medium
import org.p99.scala.p1x.P13.encodeDirect

object P34 extends Medium {
  /*
  * Calculate Euler's totient function phi(m).
  * Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.

  * Example:
    scala> totient(10)
    res0: Int = 4
  * */

  def totient(i: Int): Int = {
    def _totient(i: Int, div: Int): List[Int] =
      if (div > i) Nil else if (i % div == 0) div :: _totient(i / div, div) else _totient(i, div + 1)

    if (i == 1) 1 else encodeDirect(_totient(i, 2)).map(elem => math.pow(elem._2, elem._1) - math.pow(elem._2, elem._1 - 1)).product.toInt
  }

}
