package org.p99.scala.p0x

import org.p99.scala.Medium

object P07 extends Medium {
  /*
  * Flatten a nested list structure.

  * Example:
    scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  * */

  def flatten[T](list: List[Any]): List[T] = list match {
    case Nil => Nil
    case (head: List[T]) :: tail => flatten(head) ::: flatten(tail)
    case (head: T) :: tail => head :: flatten(tail)
  }

}
