package org.p99.scala.p0x

import org.p99.scala.Easy

import scala.annotation.tailrec

object P01 extends Easy {
  /*
  * Find the last element of a list.

  * Example:
    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
  * */

  @tailrec
  def last[T](list: List[T]): T = list match {
    case Nil => throw new NoSuchElementException
    case head :: tail => if (tail == Nil) head else last(tail)
  }

}
