package section2

import org.scalatest._

class PracticeSpec extends FlatSpec with Matchers {
  "practice 2.1-3" should "return correct answer." in {
    Practice.practice2_1_3(Array(5, 2, 4, 6, 1, 3), 6) shouldEqual Some(3)
    Practice.practice2_1_3(Array(5, 2, 4, 6, 1, 3), 3) shouldEqual Some(5)
    Practice.practice2_1_3(Array(5, 1, 4, 6, 1, 3), 1) shouldEqual Some(1)
    Practice.practice2_1_3(Array(5, 1, 4, 6, 1, 3), 9) shouldEqual None
    Practice.practice2_1_3(Array(5), 5) shouldEqual Some(0)
    Practice.practice2_1_3(Array(), 6) shouldEqual None
  }

  "practice 2.1-4" should "return correct answer." in {
    Practice.practice2_1_4(Array(false, false), Array(false, false)) shouldEqual Array(false, false, false)
    Practice.practice2_1_4(Array(false, false), Array( true, false)) shouldEqual Array( true, false, false)
    Practice.practice2_1_4(Array( true, false), Array( true, false)) shouldEqual Array(false,  true, false)
    Practice.practice2_1_4(Array( true, false), Array( true,  true)) shouldEqual Array(false, false,  true)
    Practice.practice2_1_4(Array( true,  true), Array( true,  true)) shouldEqual Array(false,  true,  true)
  }
}
