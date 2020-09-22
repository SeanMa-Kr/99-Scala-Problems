package org.p99.scala

import org.p99.scala.P09.pack

object P10 {

  def encode[T](list: List[T]): List[(Int, T)] = {
    def innerEncode[T](pList: List[List[T]]): List[(Int, T)] = pList match {
      case Nil => Nil
      case head :: tail => (head.length, head.head) :: innerEncode(tail)
    }
    innerEncode(pack(list))
  }

}
