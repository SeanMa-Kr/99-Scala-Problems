package org.p99.scala.p1x

import org.p99.scala.Easy

object P17 extends Easy {
  /*
  * Split a list into two parts. The length of the first part is given.
  * Use a Tuple for your result.

  * Example:
    scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * */

  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
    if (n >= list.length) throw new IndexOutOfBoundsException
    else (list.take(n), list.takeRight(list.length - n))
  }

}
