package section2

object SelectionSort {
  /** 引数の配列を破壊的に変更し、ソートする。配列外に記憶される要素は高々定数個となる。
    * 最小実行時間はソート済の場合でこのときminIndexの実行回が定数となるためΘ(n)、
    * 最大実行時間は逆順にソートされていた場合で、minIndexの実行回はn回実行した合計でn^2に比例する回数となるから一回の実行につきnに比例すると、Θ(n^2)となる。
    */
  def apply[T](array: Array[T])(implicit o: Ordering[T]): Array[T] = {
    for (j <- 0 until (array.length - 1)) {
      val min = minIndex(array, j)
      val tmp = array(j)
      array(j) = array(min)
      array(min) = tmp
    }
    array
  }

  /** 線形探索で最小値を求める。
    */
  def minIndex[T](array: Array[T], start: Int)(implicit o: Ordering[T]): Int = {
    var min = start

    for (i <- (start + 1) until array.length) {
      if (o.gt(array(min), array(i))) {
        min = i
      }
    }
    min
  }
}
