
var v1: Int = 4   // Java: `int v1 = 4`

var v2 = 4        // v2: Int
v2.getClass       // Class[Int] = int

// v2 = true      // compile error: 'Boolean doesn't conform to Int'

var v3 = v1 + v2  // v3: Int = 8
v3 = 9            // v3: Int = 9

val c1 = 5

// c1 = 6         // compile error: 'Reassignment to val'
