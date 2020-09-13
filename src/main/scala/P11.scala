package org.p99.scala

object P11 {

  def encodeModified[T](list:List[T]):List[Any] = {
    P10.encode(list).map(i => if (i._1 == 1) i._2 else i)
  }

}
