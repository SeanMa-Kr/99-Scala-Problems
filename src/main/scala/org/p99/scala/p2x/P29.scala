package org.p99.scala.p2x

object P29 {

  def lsort[T](list: List[List[T]]): List[List[T]] = list sortBy (_.length)

}
