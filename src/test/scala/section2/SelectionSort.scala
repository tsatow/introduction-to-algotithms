package section2

import org.scalatest._

class SelectionSortSpec extends FlatSpec with Matchers {
  "selection sort" should "sort array" in {
    SelectionSort(Array(5, 2, 4, 6, 1, 3)) shouldEqual Array(1, 2, 3, 4, 5, 6)
    SelectionSort(Array(5, 2, 4, 2, 6, 1, 1, 3)) shouldEqual Array(1, 1, 2, 2, 3, 4, 5, 6)
    SelectionSort(Array(1)) shouldEqual Array(1)
    SelectionSort(Array()) shouldEqual Array()
  }
}
