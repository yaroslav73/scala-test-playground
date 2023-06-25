package calculator

import org.scalatest.freespec.AnyFreeSpec

// One more BDD style - tests can be read like natural language
class CalculatorFreeSpec extends AnyFreeSpec:
  val calculator = Calculator()

  "A calculator" - { 
    "return 0 if multiplying by 0" in:
      assert(calculator.multiply(12345, 0) == 0)
      assert(calculator.multiply(-12345, 0) == 0)
      assert(calculator.multiply(0, 0) == 0)

    "throw a math error if dividing by 0" in:
      assertThrows[ArithmeticException](calculator.devide(12345, 0))
  }