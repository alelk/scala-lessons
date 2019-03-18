class Any_AnyVal_AnyRef {
  val _ = {


    /** После компиляции:
      *
      * {{{
      *   final int int1 = 1;
      *   final Object int2 = BoxesRunTime.boxToInteger(int1);
      *   final Object int3 = BoxesRunTime.boxToInteger(int1);
      * }}}
      */
    val int1: Int = 1
    val int2: AnyVal = int1
    val int3: Any = int1

    /** После компиляции:
      *
      * {{{
      *   final Object str3;
      *   final Object str2 = str3 = "str";
      * }}}
      */
    val str1: String = "str"
    val str2: AnyRef = str1
    val str3: Any = str1


  }
}
