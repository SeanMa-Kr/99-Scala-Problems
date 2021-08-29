package org.p99.scala.p3x

object P34 {

  def totient(i: Int) = {
    def _totient(i: Int, div: Int): List[Int] =
      if (div > i) Nil else if (i % div == 0) div :: _totient(i / div, div) else _totient(i, div + 1)

    if (i == 1) 1 else encodeDirect(_totient(i, 2)).map(elem => math.pow(elem._2, elem._1) - math.pow(elem._2, elem._1 - 1)).product.toInt
  }

}
