package org.p99.scala.p1x

import scala.annotation.tailrec

object P19 {

  @tailrec
  def rotate[T](n: Int, list: List[T]): List[T] = list match {
    case Nil => throw new NoSuchElementException
    case head :: tail => n match {
      case n if n > 0 => rotate(n - 1, tail :+ head)
      case n if n < 0 => rotate(n + 1, tail.takeRight(1) ::: head :: tail.dropRight(1))
      case _ => list
    }
  }

}
