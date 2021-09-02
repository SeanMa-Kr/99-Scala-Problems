package org.p99.scala.p1x

import org.p99.scala.Medium

object P13 extends Medium {
  /*
  * Run-length encoding of a list (direct solution).
  * Implement the so-called run-length encoding data compression method directly.
  * I.e. don't use other methods you've written (like P09's pack); do all the work directly.

  * Example:
    scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  * */

  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    def innerEncodeDirect(tList: List[(Int, T)]): List[(Int, T)] = tList match {
      case Nil => Nil
      case head :: Nil => head :: Nil
      case head :: tail => if (head._2 == tail.head._2) innerEncodeDirect((head._1 + 1, head._2) :: tail.drop(1)) else head :: innerEncodeDirect(tail)
    }

    innerEncodeDirect(list.map(elem => (1, elem)))
  }

}
