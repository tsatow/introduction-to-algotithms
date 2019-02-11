package section2

import scala.reflect._

object MergeSort {
  def merge[T](arr: Array[T], p: Int, q: Int, r: Int)(implicit o: Ordering[T], ct: ClassTag[T]) = {
    // 注意。教科書のアルゴリズムと違い、最大値が不明なので番兵を用いない
    val n1 = q - p + 1
    val n2 = r - q

    val left  = new Array(n1 + 1)
    val right = new Array(n2 + 1)

    for (i <- 0 until n1) {
      left(i) = arr(p + i - 1)
    }

    for (j <- 0 until n1) {
      right(j) = arr(q + j)
    }

    var i = 0
    var j = 0
    // while ((p to r).ha)
  }
}
