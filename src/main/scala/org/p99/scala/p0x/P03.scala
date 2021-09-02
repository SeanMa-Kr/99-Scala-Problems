package org.p99.scala.p0x

import org.p99.scala.Easy

import scala.annotation.tailrec

object P03 extends Easy {
  /*
  * Find the Kth element of a list.
  * By convention, the first element in the list is element 0.

  * Example:
    scala> nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2
  * */

  @tailrec
  def nth[T](list: List[T], n: Int): T = list match {
    case Nil => throw new NoSuchElementException
    case head :: tail => if (n > 0) nth(tail, n - 1) else head
  }

}
