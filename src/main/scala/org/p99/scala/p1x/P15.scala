package org.p99.scala.p1x

import org.p99.scala.Medium

object P15 extends Medium {
  /*
  * Duplicate the elements of a list a given number of times.

  * Example:
    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  * */

  def duplicateN[T](n: Int, list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: tail => ((0 until n) map (_ => head)).toList ::: duplicateN(n, tail)
  }

}
