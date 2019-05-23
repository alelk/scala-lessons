(x: Int) => x * x                                          // Int => Int
(x: Int, y: Int) => x + y                                  // (Int, Int) => Int

res0(2)                                                    // 4
res1(2, 3)                                                 // 5

val sqr = (x: Int) => x * x
val add = (x: Int, y: Int) => x + y

sqr(3)
add(2, 4)

sqr.isInstanceOf[Any]                                      // true
sqr.isInstanceOf[AnyRef]                                   // true

val sqr1 = new Function1[Int, Int] {                       // sqr1: Int => Int
  override def apply(v1: Int) = v1 * v1
}
sqr1(3)

val add1 = new Function2[Int, Int, Int] {                  // add1: (Int, Int) => Int
  override def apply(v1: Int, v2: Int) = v1 + v2
}
add1(2, 4)                                                 // 6
add1.apply(2, 4)                                           // 6