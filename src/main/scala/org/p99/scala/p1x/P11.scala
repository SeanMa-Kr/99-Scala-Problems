package org.p99.scala.p1x

object P11 {

  def encodeModified[T](list: List[T]): List[Any] = {
    def innerEncodeModified[T](pList: List[List[T]]): List[Any] = pList match {
      case Nil => Nil
      case head :: tail => (if (head.length > 1) (head.length, head.head) else head.head) :: innerEncodeModified(tail)
    }

    innerEncodeModified(pack(list))
  }

}
