
/** Возвращает факториал числа n */
def factorial(n: Int) = {
  assert(n >= 0, "ожидается неотрицательное число")
  assert(n < 50000, "слишком большое число")
  if (n == 0) 1
  else {
    var a = 1
    var acc: BigInt = 1
    while (a <= n) {
      acc *= a
      a += 1
    }
    acc
  }
}

val r = factorial(40000)
println(r)
println(r.toString.length) // 166714 цифр
