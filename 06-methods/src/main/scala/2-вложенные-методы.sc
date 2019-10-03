def sumSqr(a: Int, b: Int): Int = {
  def sqr(x: Int) = x * x // вложенное определение с ключевым словом def
  sqr(a) + sqr(b)
}

sumSqr(2, 3)
