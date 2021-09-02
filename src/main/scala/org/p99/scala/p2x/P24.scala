package org.p99.scala.p2x

import org.p99.scala.Easy
import org.p99.scala.p2x.P22.range
import org.p99.scala.p2x.P23.randomSelect

object P24 extends Easy {
  /*
  * Lotto: Draw N different random numbers from the set 1..M.

  * Example:
    scala> lotto(6, 49)
    res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  * */

  def lotto[T](n: Int, m: Int): List[Int] = randomSelect(n, range(1, m))

}
