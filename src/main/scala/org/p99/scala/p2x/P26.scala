package org.p99.scala.p2x

import org.p99.scala.Medium

object P26 extends Medium {
  /*
  * Generate the combinations of K distinct objects chosen from the N elements of a list.
  * In how many ways can a committee of 3 be chosen from a group of 12 people?
  * We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient).
  * For pure mathematicians, this result may be great. But we want to really generate all the possibilities.

  * Example:
    scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
  * */

  def combinations[T](n: Int, list: List[T]): List[List[T]] = (n, list) match {
    case (n, Nil) => Nil
    case (n, list) if n == 1 => list map (item => List(item))
    case (n, head :: tail) if n > 0 => combinations(n - 1, tail).map(lst => head :: lst) ::: combinations(n, tail)
  }

}
