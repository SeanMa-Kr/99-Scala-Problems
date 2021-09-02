package org.p99.scala.p2x

import org.p99.scala.Easy
import org.p99.scala.p2x.P23.randomSelect

object P25 extends Easy {
  /*
  * Generate a random permutation of the elements of a list.
  * Hint: Use the solution of problem P23.

  * Example:
    scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  * */

  def randomPermute[T](list: List[T]): List[T] = randomSelect(list.length, list)

}
