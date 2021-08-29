package org.p99.scala.p0x

import scala.annotation.tailrec

object P03 {

  @tailrec
  def nth[T](list: List[T], n: Int): T = list match {
    case Nil => throw new NoSuchElementException
    case head :: tail => if (n > 0) nth(tail, n - 1) else head
  }

}
