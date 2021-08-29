package org.p99.scala.p2x

object P24 {

  def lotto[T](n: Int, m: Int): List[Int] = randomSelect(n, range(1, m))

}
