object testApp extends App {

  def factorial2(n: Int): BigInt = {
    assert(n >= 0, "ожидается неотрицательное число")
    assert(n < 50000, "слишком большое число")

    def f(n: Int, acc: BigInt = 1): BigInt =
      if (n > 0) f(n - 1, acc * n)
      else acc

    f(n)
  }

  factorial2(1000)
}
