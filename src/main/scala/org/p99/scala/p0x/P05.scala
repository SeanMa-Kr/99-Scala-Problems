package org.p99.scala.p0x

import org.p99.scala.Easy

object P05 extends Easy {
  /*
  * Reverse a list.

  * Example:
    scala> reverse(List(1, 1, 2, 3, 5, 8))
    res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  * */

  def reverse[T](list: List[T]): List[T] = list match {
    case Nil => list
    case head :: tail => reverse(tail) :+ head
  }

}
