package org.p99.scala

import scala.annotation.tailrec

object P02 {

  @tailrec
  def penultimate[T](list: List[T]): T = list match {
    case Nil => throw new NoSuchElementException
    case head :: _ :: Nil => head
    case _ :: tail => penultimate(tail)
  }

}
