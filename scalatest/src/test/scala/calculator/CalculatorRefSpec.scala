package calculator

import org.scalatest.refspec.RefSpec

// Based on reflection
class CalculatorRefSpec extends RefSpec:
  object `A Caclulator`:
    val calculator = Calculator()

    def `myltiply by 0 should be 0`: Unit =
      assert(calculator.multiply(12345, 0) == 0)
      assert(calculator.multiply(-12345, 0) == 0)
      assert(calculator.multiply(0, 0) == 0)

    def `should throw a math error when divide by 0`: Unit =
      assertThrows[ArithmeticException](calculator.devide(12345, 0))
