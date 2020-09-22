package org.p99.scala

object P18 {

  def slice[T](i: Int, k: Int, list: List[T]): List[T] = {
    if ((i >= list.length) && (k >= list.length) && (i > k)) throw new IndexOutOfBoundsException
    else list.takeRight(list.length - i).take(k - i)
  }

}
