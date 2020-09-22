package org.p99.scala

import org.p99.scala.P23.randomSelect

object P25 {

  def randomPermute[T](list:List[T]): List[T] = randomSelect(list.length, list)

}
