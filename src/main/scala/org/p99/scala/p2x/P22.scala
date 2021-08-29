package org.p99.scala.p2x

object P22 {

  def range(i: Int, j: Int): List[Int] = if (i <= j) i :: range(i + 1, j) else Nil

}
