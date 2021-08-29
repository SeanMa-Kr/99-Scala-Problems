package org.p99.scala.p2x

object P26 {

  def combinations[T](n: Int, list: List[T]): List[List[T]] = (n, list) match {
    case (n, Nil) => Nil
    case (n, list) if n == 1 => list map (item => List(item))
    case (n, head :: tail) if n > 0 => combinations(n - 1, tail).map(lst => head :: lst) ::: combinations(n, tail)
  }

}
