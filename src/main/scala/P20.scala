package org.p99.scala

object P20 {

  def removeAt[T](n: Int, list: List[T]): (List[T], T) =
    if (n >= list.length) throw new IndexOutOfBoundsException
    else (list.take(n) ::: list.takeRight(list.length - (n + 1)), list(n))

}
