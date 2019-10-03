// код не скомпилируется - аргументу метода невозможно переприсвоить значение
//
//def sumSqr(a: Int, b: Int): Int = {
//  a = a * a
//  b = b * b
//  a + b
//}

def sumSqr(a: Int, b: Int): Int = {
  val a2 = a * a // для нового значения - новая переменная - это хорошая практика (см. JavaMethodFinalArgs)
  val b2 = b * b
  a2 + b2
}

sumSqr(2, 3)