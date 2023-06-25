package calculator

import org.scalatest.wordspec.AnyWordSpec

// Better BDD style with using natural language words
class CalculatorWordSpec extends AnyWordSpec:
  val calculator = Calculator()

  "A calculator" should: 
    "return 0 if multiplying by 0" in:
      assert(calculator.multiply(12345, 0) == 0)
      assert(calculator.multiply(-12345, 0) == 0)
      assert(calculator.multiply(0, 0) == 0)

    "throw a math error if dividing by 0" in:
      assertThrows[ArithmeticException](calculator.devide(12345, 0))