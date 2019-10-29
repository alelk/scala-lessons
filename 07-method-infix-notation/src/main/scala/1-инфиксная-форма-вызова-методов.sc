
/** Value-класс: после компиляции его экземпляр становится примитивным значением типа int
  *
  * @param value у value-класса должно быть одно неприватное поле value-типа
  */
class MyInt(val value: Int) extends AnyVal {

  def add(other: MyInt) = new MyInt(value + other.value)

  def subtract(other: MyInt) = new MyInt(value - other.value)

  def multiply(other: MyInt) = new MyInt(value * other.value)

  def divide(other: MyInt) = new MyInt(value / other.value)

  override def toString: String = s"MyInt($value)"
}

val a = new MyInt(10)
val b = new MyInt(20)
val c = new MyInt(2)

1 + 2
1.+(2) // вызов метода + на объекте 1 с аргументом 2
1 + (2) // правило 1: если явно задан получатель вызова метода (объект 1), то метод можно вызвать без точки
1 + 2 // правило 2: если метод принимает только 1 аргумент - скобки можно упустить

// println "Hi" // ошибка, т.к. получатель вызова метода не задан
Console println "Hi" // ОК, т.к. Console - получатель вызова метода, и у println есть перегрузка, принимающая ровно 1 аргумент

// лево-ассоциативная свертка
a add b multiply c // 60
a add (b multiply c) // 50

10 + 20 * 2 // 50
10.+(20 * 2) // 50

10 * 20 + 2 // 202
10.*(20).+(2) // 202