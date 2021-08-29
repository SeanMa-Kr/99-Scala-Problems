package org.p99.scala.p1x

object P17 {

  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
    if (n >= list.length) throw new IndexOutOfBoundsException
    else (list.take(n), list.takeRight(list.length - n))
  }

}
