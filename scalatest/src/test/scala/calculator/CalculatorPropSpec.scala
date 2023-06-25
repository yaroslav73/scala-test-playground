package calculator

import org.scalatest.propspec.AnyPropSpec

// BDD, but in the style of properties
class CalculatorPropSpec extends AnyPropSpec:
  val calculator = Calculator()

  val multiplyByZeroExamples = List((12345, 0), (-12345, 0), (0, 0))

  property("Calculator myltiply by 0 should be 0"):
    assert(multiplyByZeroExamples.forall((a, b) => calculator.multiply(a, b) == 0))

  property("Calculator devide by 0 should throw a math error"):
    assertThrows[ArithmeticException](calculator.devide(12345, 0))
