package org.p99.scala.p2x

import org.p99.scala.Medium
import org.p99.scala.p2x.P20.removeAt

import scala.util.Random

object P23 extends Medium {
  /*
  * Extract a given number of randomly selected elements from a list.
  * Hint: Use the solution to problem P20

  * Example:
    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    res0: List[Symbol] = List('e, 'd, 'a)
  * */

  def randomSelect[T](n: Int, list: List[T]): List[T] = (n, list) match {
    case (n, list) if n > list.length => throw new IndexOutOfBoundsException
    case (n, list) if n > 0 =>
      val rand = Random.nextInt(list.length)
      removeAt(rand, list)._2 :: randomSelect(n - 1, list.filter(i => i != list(rand)))
    case _ => Nil
  }

}
