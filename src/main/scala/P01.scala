package org.p99.scala

import scala.annotation.tailrec

object P01 {

  @tailrec
  def last[T](list: List[T]): T = list match {
    case Nil => throw new NoSuchElementException
    case head :: tail => if (tail == Nil) head else last(tail)
  }

}
