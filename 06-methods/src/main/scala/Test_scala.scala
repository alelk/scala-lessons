class Test_scala {

  def sumSqr(a: Int, b: Int): Int = {
    def sqr(x: Int) = x * x // вложенный метод - после компиляции превратится в статический метод в этом же классе (см. Test_java)
    sqr(a) + sqr(b)
  }

}
