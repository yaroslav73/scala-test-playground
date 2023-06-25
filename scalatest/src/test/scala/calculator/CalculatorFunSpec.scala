package calculator

import org.scalatest.funspec.AnyFunSpec

// Minimal BDD style
class CalculatorFunSpec extends AnyFunSpec:
  val calculator = Calculator()

  describe("multiplication"):
    it("should return 0 if multiplying by 0"):
      assert(calculator.multiply(12345, 0) == 0)
      assert(calculator.multiply(-12345, 0) == 0)
      assert(calculator.multiply(0, 0) == 0)

  describe("division"):
    it("should throw a math error if dividing by 0"):
      assertThrows[ArithmeticException](calculator.devide(12345, 0))
