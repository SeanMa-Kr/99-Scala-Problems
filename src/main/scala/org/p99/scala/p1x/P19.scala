package org.p99.scala.p1x

import org.p99.scala.Medium

import scala.annotation.tailrec

object P19 extends Medium{
  /*
  * Rotate a list N places to the left.

  * Examples:
    scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

    scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  * */

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
