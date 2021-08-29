package org.p99.scala.p3x

object P30 {

  def lsortFreq[T](list: List[List[T]]): List[List[T]] = {
    val freq = (list map (_.length) groupBy (i => i)).values.toList sortBy (_.length) map (_.head)
    list sortWith ((s, t) => freq.indexOf(s.length) < freq.indexOf(t.length))
  }

}
