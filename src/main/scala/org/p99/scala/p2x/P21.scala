package org.p99.scala.p2x

import org.p99.scala.Easy

object P21 extends Easy {
  /*
  * Insert an element at a given position into a list.

  * Example:
    scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
    res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  * */

  def insertAt[T](elem: T, n: Int, list: List[T]): List[T] = list match {
    case Nil => if (n == 0) elem :: Nil else throw new IndexOutOfBoundsException
    case head :: tail => if (n > 0) head :: insertAt(elem, n - 1, tail) else elem :: head :: tail
  }

}
