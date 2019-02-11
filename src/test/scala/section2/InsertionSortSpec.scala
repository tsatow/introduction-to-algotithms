package section2

import org.scalatest._

class InsertionSortSpec extends FlatSpec with Matchers {
  "insertion sort" should "sort array" in {
    InsertionSort(Array(5, 2, 4, 6, 1, 3)) shouldEqual Array(1, 2, 3, 4, 5, 6)
    InsertionSort(Array(5, 2, 4, 2, 6, 1, 1, 3)) shouldEqual Array(1, 1, 2, 2, 3, 4, 5, 6)
    InsertionSort(Array(1)) shouldEqual Array(1)
    InsertionSort(Array()) shouldEqual Array()
  }
}
