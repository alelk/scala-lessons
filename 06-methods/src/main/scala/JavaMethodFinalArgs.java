public class JavaMethodFinalArgs {

    public static void main(String[] args) {
        System.out.println(sumSqr1(2, 3));
        System.out.println(sumSqr2(2, 3));
    }

    private static int sumSqr1(int a, int b) {
        // много кода
        // много кода
        // много кода
        a = a * a; // в Java, если аргумент функции не помечен final - ему можно переприсваивать значение
        // много кода
        // много кода
        // много кода
        return a * a + b * b; // мы забыли, не заметили, что значение a было переприсвоено
    }

    private static int sumSqr2(final int a, final int b) { // хорошая параметра - final аргументы функции
        // много кода
        // много кода
        // много кода
        final int a2 = a * a; // новая переменная для нового значения - хорошая практика
        // много кода
        // много кода
        // много кода
        return a2 + b * b;
    }
}
