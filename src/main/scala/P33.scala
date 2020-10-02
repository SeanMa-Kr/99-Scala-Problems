package org.p99.scala

import org.p99.scala.P32.gcd

object P33 {

  def isCoprimeTo(i: Int, j: Int): Boolean = gcd(i, j) == 1

}
