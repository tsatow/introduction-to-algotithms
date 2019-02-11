package section2

object Practice {

  def practice2_1_3(arr: Array[Int], x: Int): Option[Int] = {
    // 不変条件
    // 0 <= i < arr.length
    // j < iなる全てのjについて、arr(j) != x
    for (i <- arr.indices) {
      if (arr(i) == x)
        return Some(i)
    }

    None
  }

  def practice2_1_4(a: Array[Boolean], b: Array[Boolean]): Array[Boolean] = {
    require(a.length == b.length)

    val c = new Array[Boolean](a.length + 1)

    for (i <- a.indices) {
      if (a(i) && b(i)) {
        c(i + 1) = true
      } else if (a(i) || b(i)) {
        c(i + 1) = c(i)
        c(i) = !c(i)
      }
    }

    c
  }

  def practice2_2_2[T](arr: Array[T])(implicit o: Ordering[T]): Array[T] = {
    SelectionSort(arr)
  }

  /** 2.2.3
    * 平均：Θ(n/2), 最大：Θ(n)
    */

  /** 2.2.4
    * そんなものはない:-)
    */

}
