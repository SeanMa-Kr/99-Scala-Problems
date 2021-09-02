package org.p99.scala.p1x

import org.p99.scala.Easy
import org.p99.scala.p0x.P09.pack

object P11 extends Easy {
  /*
  * Modified run-length encoding.
  * Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list.
  * Only elements with duplicates are transferred as (N, E) terms.

  * Example:
    scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  * */

  def encodeModified[T](list: List[T]): List[Any] = {
    def innerEncodeModified[T](pList: List[List[T]]): List[Any] = pList match {
      case Nil => Nil
      case head :: tail => (if (head.length > 1) (head.length, head.head) else head.head) :: innerEncodeModified(tail)
    }

    innerEncodeModified(pack(list))
  }

}
