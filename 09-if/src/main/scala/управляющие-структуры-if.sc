import scala.util.Random

/// использование if в императивном стиле:
var result = 0 // var-переменная
if (Random.nextBoolean()) {
  println(1) // побочный эффект - вывод информации в консоль
  result = 1 // побочный эффект - переприсвоение значение переменной
} else {
  println(2)
  result = 2
}

/// использование if в функциональном стиле:
// выражение if возвращает значение
val result2 = if (Random.nextBoolean()) 1 else 2 // нет побочных эффектов (кроме Random.nextBoolean() в условии)
println(result2)

/// автоматический вывод типов:
// тип переменной result2 - Int, т.к. в каждой ветке if возвращается Int
val result3 = if (Random.nextBoolean()) 1 else 100.5 // result3: Double, т.к. сработало неявное приведение типов (Int -> Double)
val result4 = if (Random.nextBoolean()) 1 else "str" // result4: Any, т.к. ближайший общий предок у Int и String - Any
val result5 = if (Random.nextBoolean()) 1 // result5: AnyVal, т.к. отсутствие ветки else эквивалентно ветке else с пустым блоком кода
val result6 = if (Random.nextBoolean()) 1 else {} // result6: AnyVal - пустой блок кода возвращает Unit

/// объединение нескольких выражений if-else:
val result7 =
  if (Random.nextBoolean()) 1
  else if (Random.nextBoolean()) 2
  else if (Random.nextBoolean()) 3
  else -1