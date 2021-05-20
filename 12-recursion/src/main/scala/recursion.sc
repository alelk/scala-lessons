import scala.annotation.tailrec

/** Возвращает факториал числа n */
def factorial(n: Int) = {
  assert(n >= 0, "ожидается положительное число")
  assert(n < 50000, "слишком большое число")
  var a = 1
  var acc: BigInt = 1
  while (a <= n) {
    acc *= a
    a += 1
  }
  acc
}

val r = factorial(10)
println(r)
println(r.toString().length)

// --------------------------------------------------------------

def factorial2(n: Int): BigInt = {
  assert(n >= 0, "ожидается неотрицательное число")
  assert(n < 50000, "слишком большое число")

  @tailrec
  def f(n: Int, acc: BigInt = 1): BigInt =
    if (n > 0) f(n - 1, acc * n)
    else acc

  f(n)
}

factorial2(10)

factorial2(40000)

//-----------------------------------------------------------------

def factorial3(n: Int): BigInt = {
  assert(n >= 0, "ожидается неотрицательное число")
  assert(n < 50000, "слишком большое число")
  if (n == 0) 1
  else (1 to n).foldLeft(BigInt(1))(_ * _)
}

factorial3(10)
factorial3(40000)

def factorial4(n: Int): BigInt = {
  assert(n >= 0, "ожидается неотрицательное число")
  assert(n < 50000, "слишком большое число")
  if (n == 0) 1
  else (BigInt(1) to BigInt(n)).product
}

factorial4(1)














































