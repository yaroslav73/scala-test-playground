package calculator

import org.scalatest.funsuite.AnyFunSuite

// Looks like JUnit/MUnit style
class CalculatorFunSuite extends AnyFunSuite:
  val calculator = Calculator()

  test("multiplication with 0 should always return 0"):
    assert(calculator.multiply(12345, 0) == 0)
    assert(calculator.multiply(-12345, 0) == 0)
    assert(calculator.multiply(0, 0) == 0)

  test("dividing by 0 should always throw math error"):
    assertThrows[ArithmeticException](calculator.devide(12345, 0))
