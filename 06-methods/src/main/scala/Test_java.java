/** Код, полученный после декомпиляции байткода класса Test_scala в Java */
public class Test_java {

    // для вложенного scala метода создается статический метод в том же классе
    private static final int sqr$1(int x) {
        return x * x;
    }

    public int sumSqr(int a, int b) {
        return sqr$1(a) + sqr$1(b);
    }

}