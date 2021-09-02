package org.p99.scala.p1x

import org.p99.scala.Easy

object P14 extends Easy {
  /*
  * Duplicate the elements of a list.

  * Example:
    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  * */

  def duplicate[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: tail => head :: head :: duplicate(tail)
  }

}
