// информация о типах в правой части выражения (справа от символа присвоения)
val sqr = (x: Int) => x * x
val add = (x: Int, y: Int) => x + y

// информация о типах в левой части выражения (слева от символа присвоения)
val sqr1: Int => Int = x => x * x
val add1: (Int, Int) => Int = (x, y) => x + y

// данная запись полностью аналогична предыдущей (add1)
val add2: (Int, Int) => Int = _ + _    // информация о типах слева от "="

val add3 = (_: Int) + (_: Int)         // информация о типах справа от "="

// Ошибка: требуется явно указать тип переменной factorial в случае рекурсии
// val factorial = (n: Int) => if (n == 0) 1 else n * factorial(n - 1)

val factorial: Int => Int =
  n => if (n == 0) 1 else n * factorial(n - 1)

factorial(4) // 24

val addSqr = (x: Int, y: Int) => add(sqr(x), sqr(y))

addSqr(2, 3)

val addSqr2 = (x: Int, y: Int) => {
  val x2 = sqr(x)
  val y2 = sqr(y)
  add(x2, y2) // результат последнего выражения является результатом блока
}

addSqr2(2, 3) // 13

val addSqr3 = (x: Int, y: Int) => {
  val _sqr = (a: Int) => a * a
  val x2 = _sqr(x)
  val y2 = _sqr(y)
  add(x2, y2)
}

addSqr3(2, 3) // 13

// открывающую фигурную скобку можно поставить до списка параметров функции
val addSqr4 = { (x: Int, y: Int) =>
  val _sqr = (a: Int) => a * a
  val x2 = _sqr(x)
  val y2 = _sqr(y)
  add(x2, y2)
}

addSqr4(2, 3) // 13

// информацию о типах можно поместить в левую часть выражения
val addSqr5: (Int, Int) => Int = { (x, y) =>
  val _sqr = (a: Int) => a * a
  val x2 = _sqr(x)
  val y2 = _sqr(y)
  add(x2, y2)
}

addSqr5(2, 3) // 13