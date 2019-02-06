class PrimitiveTypeTest {

  /** Java:
    *
    * ```
    * public int max(final int v1, final int v2) {
    *     return (v1 > v2) ? v1 : v2;
    * }
    * ```
    */
  def max(v1: Int, v2: Int): Int = if(v1 > v2) v1 else v2

  def f(v: Any): Unit = println(v)

  max(1, 3)

  /** Java:
    * ```
    *   this.f(BoxesRunTime.boxToInteger(1));
    * ```
    */
  f(1)

  /** Java:
    *
    * ```
    *   this.f(BoxesRunTime.boxToDouble(1.234))
    * ```
    *
    */
  f(1.234)
}
