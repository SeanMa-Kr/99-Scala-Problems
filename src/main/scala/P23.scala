package org.p99.scala

import org.p99.scala.P20.removeAt

import scala.util.Random

object P23 {

  def randomSelect[T](n:Int, list:List[T]): List[T] = (n, list) match {
    case (n, list) if n > list.length => throw new IndexOutOfBoundsException
    case (n, list) if n > 0 =>
      val rand = Random.nextInt(list.length)
      removeAt(rand, list)._2 :: randomSelect(n-1, list.filter(i => i != list(rand)))
    case _ => Nil
  }

}
