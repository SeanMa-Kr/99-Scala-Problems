package org.p99.scala

import org.p99.scala.P22.range
import org.p99.scala.P23.randomSelect

object P24 {

  def lotto[T](n:Int, m:Int): List[Int] = randomSelect(n, range(1, m))

}
