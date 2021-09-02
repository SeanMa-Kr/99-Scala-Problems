package org.p99.scala.p0x

import org.p99.scala.Easy

object P04 extends Easy {
  /*
  * Find the number of elements of a list.

  * Example:
    scala> length(List(1, 1, 2, 3, 5, 8))
    res0: Int = 6
  * */

  def length[T](list: List[T]): Int = list match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)
  }

}
