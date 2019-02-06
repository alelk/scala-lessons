val v3 = {          // v3: Int = 3
  val v1 = 1
  val v2 = v1 + 1
  v2 + 1            // v2 + 1 = 3
}

// println(v1)      // compile error: 'Cannot resolve symbol v1'

val v4 = {          // v4: Unit = ()

}

()                  // (): Unit

v4 == ()            // true
