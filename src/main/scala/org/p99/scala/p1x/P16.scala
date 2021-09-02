package org.p99.scala.p1x

import org.p99.scala.Medium

object P16 extends Medium {
  /*
  * Drop every Nth element from a list.

  * Example:
    scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  * */

  def drop[T](n: Int, list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: tail => if (n > 1) head :: tail.take(n - 2) ::: drop(n, tail.drop(n - 1)) else Nil
  }

}
