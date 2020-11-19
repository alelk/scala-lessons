for (i <- 0 until 10) {
  println(i)
  // i = 2 // ошибка: i - val-переменная (неизменяемая)
}

0 until 10 // возвращает объект Range (коллекция) - со значениями от 0 до 9
0 to 10 // Range от 0 до 10
0.to(10, 2) // Range от 0 до 10 с шагом 2

// если в блоке кода 1 выражение, то блок можно заменить на выражение
// вывод в консоль - это побочный эффект
for (i <- 0 until 10) println(i)

val r: Unit = for (i <- 0 until 10) println(i) // цикл for возвращает Unit
println(r) // ()

// на входе - коллекция чисел, на выходе - коллекция строк
val r2: List[String] =
  for (i <- List(1, 2, 3, 4, 5)) yield { // yield позволяет сгенерировать новую коллекцию
    val v = s"val - $i"
    v
  }

// то же самое можно записать лаконичнее:
val r2: List[String] = for (i <- List(1, 2, 3, 4, 5)) yield s"val - $i"

val col1 = List('a', 'b', 'c')
val col2 = Array(1, 2, 3, 4)

// вложенные циклы (нужно пробежать по 2 коллекциям и сформировать пары из всевозможных сочетаний элементов)
for (v1 <- col1) {
  for (v2 <- col2) {
    println(s"$v1 - $v2")
  }
}

// попробуем написать в функциональном стиле (без побочных эффектов)
val r3: List[Array[String]] = // список массивов строк
  for (v1 <- col1) yield {
    val result1: Array[String] = for (v2 <- col2) yield {
      val result2: String = s"$v1 - $v2"
      result2 // строка
    }
    result1 // массив строк
  }

// можно преобразовать коллекцию коллекций в плоскую коллекцию с помощью метода .flatten
val r4: List[String] = r3.flatten

// в Scala вложенные циклы можно объединять:
for (v1 <- col1; v2 <- col2) {
  println(s"$v1 - $v2")
}

// можно записать лаконичней (заменить блок кода из 1 выражения на это выражение):
for (v1 <- col1; v2 <- col2) println(s"$v1 - $v2")

// а можно так:
for (
  v1 <- col1;
  v2 <- col2
) println(s"$v1 - $v2")

// круглые скобки можно заменить на фигурные:
for {
  v1 <- col1
  v2 <- col2
} println(s"$v1 - $v2")

// в выражении for можно использовать фильтры и промежуточные переменные:
val result = for {
  v1 <- col1 if v1 > 'a' if v1 < 'd'
  v = v1.toInt
  col3 = col2 map (_ * v)
  v2 <- col3 if v2 < v * 3
} yield s"$v1 - $v2"

