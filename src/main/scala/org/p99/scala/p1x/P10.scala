package org.p99.scala.p1x

import org.p99.scala.Easy
import org.p99.scala.p0x.P09.pack

object P10 extends Easy {
  /*
  * Run-length encoding of a list.
  * Use the result of problem P09 to implement the so-called run-length encoding data compression method.
  * Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.

  * Example:
    scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  * */

  def encode[T](list: List[T]): List[(Int, T)] = {
    def innerEncode[T](pList: List[List[T]]): List[(Int, T)] = pList match {
      case Nil => Nil
      case head :: tail => (head.length, head.head) :: innerEncode(tail)
    }

    innerEncode(pack(list))
  }

}
