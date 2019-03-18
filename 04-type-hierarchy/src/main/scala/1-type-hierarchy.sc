import java.time.{DayOfWeek, LocalDateTime}

1.isInstanceOf[Any]          // тип Int - наследник типа Any
"".isInstanceOf[Any]         // тип String - наследник типа Any

class MyClass

val c = new MyClass
c.isInstanceOf[Any]          // тип пользовательского класса - также наследник Any

c.isInstanceOf[AnyRef]       // тип пользовательского класса - наследник AnyRef
"Hello".isInstanceOf[AnyRef] // java.lang.String является наследником java.lang.Object, следовательно и наследником AnyRef
"Hello".getClass             // java.lang.String

val v1: String = null        // Тип Null - наследник любого подтипа AnyRef
val v2: AnyRef = null
val v3: MyClass = null
//error val v4: AnyVal = null  // Null не является наследником AnyVal

def error(message: String): Nothing =   // Nothing т.к. метод никогда нормально не завершается (выбрасывает исключение)
  throw new IllegalStateException(message)

def dayOfWeek: DayOfWeek = {
  val d = LocalDateTime.now().getDayOfWeek
  if (d != DayOfWeek.MONDAY) d          // if (понедельник) :DayOfWeek else :Nothing
  else error("It is Monday!")
}

def dayOfWeekNum: Int = {
  val d = LocalDateTime.now().getDayOfWeek
  if (d != DayOfWeek.MONDAY) d.getValue // if (понедельник) :Int else :Nothing
  else error("It is Monday!")
}

def f(a1: Int, a2: String): String = ??? // метод ??? возвращает Nothing т.к. выбрасывает NotImplementedError

def infiniteLoop(): Nothing = infiniteLoop() // рекурсивная функция, которая никогда не завершается

