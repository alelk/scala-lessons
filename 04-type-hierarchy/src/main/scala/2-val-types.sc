val v1: Char = 'a'
val v2: Double = v1        // работает неявное приведение из Char в Double

//error val v3: Long = v2  // неявное приведение из Double в Long не осуществляется