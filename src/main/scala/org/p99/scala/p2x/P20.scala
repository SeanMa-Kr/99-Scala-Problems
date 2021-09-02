package org.p99.scala.p2x

import org.p99.scala.Easy

object P20 extends Easy {
  /*
  * Remove the Kth element from a list.
  * Return the list and the removed element in a Tuple.
  * Elements are numbered from 0.

  * Example:
    scala> removeAt(1, List('a, 'b, 'c, 'd))
    res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  * */

  def removeAt[T](n: Int, list: List[T]): (List[T], T) =
    if (n >= list.length) throw new IndexOutOfBoundsException
    else (list.take(n) ::: list.takeRight(list.length - (n + 1)), list(n))

}
