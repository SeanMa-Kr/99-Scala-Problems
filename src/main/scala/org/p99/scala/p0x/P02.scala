package org.p99.scala.p0x

import org.p99.scala.Easy

import scala.annotation.tailrec

object P02 extends Easy {
  /*
  * Find the last but one element of a list.

  * Example:
    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
  * */

  @tailrec
  def penultimate[T](list: List[T]): T = list match {
    case Nil => throw new NoSuchElementException
    case head :: _ :: Nil => head
    case _ :: tail => penultimate(tail)
  }

}
