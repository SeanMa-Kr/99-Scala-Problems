package org.p99.scala.p3x

object P31 {

  def isPrime(n: Int) =
    if (n % 2 != 0 || n == 2) !(math.sqrt(n).toInt until 1 by -1).exists(i => i % 2 != 0 && n % i == 0) else false

}
