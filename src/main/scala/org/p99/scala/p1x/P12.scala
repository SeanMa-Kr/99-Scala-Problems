package org.p99.scala.p1x

import org.p99.scala.Medium

object P12 extends Medium {
  /*
  * Decode a run-length encoded list.
  * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.

  * Example:
    scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  * */

  def decode[T](list: List[(Int, T)]): List[T] = list match {
    case Nil => Nil
    case head :: tail => if (head._1 > 0) head._2 :: decode((head._1 - 1, head._2) :: tail) else decode(tail)
  }

}
