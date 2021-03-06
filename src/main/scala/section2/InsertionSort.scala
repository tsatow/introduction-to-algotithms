package section2

object InsertionSort {
  /** 引数の配列を破壊的に変更し、ソートする。配列外に記憶される要素は高々定数個となる。
    * 
    */
  def apply[T](array: Array[T])(implicit o: Ordering[T]): Array[T] = {
    for (j <- 1 until array.length) {
      val key = array(j)
      var i = j - 1

      while (i >= 0 && o.gt(array(i), key)) {
        array(i + 1) = array(i)
        i = i - 1
      }
      array(i + 1) = key
    }
    array
  }
}
