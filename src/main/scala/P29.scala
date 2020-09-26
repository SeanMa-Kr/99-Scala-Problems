package org.p99.scala

object P29 {

  def lsort[T](list: List[List[T]]): List[List[T]] = list sortBy (_.length)

}
