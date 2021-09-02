package org.p99.scala.p2x

import org.p99.scala.Easy

object P22 extends Easy {
  /*
  * Create a list containing all integers within a given range.

  * Example:
    scala> range(4, 9)
    res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  * */

  def range(i: Int, j: Int): List[Int] = if (i <= j) i :: range(i + 1, j) else Nil

}
