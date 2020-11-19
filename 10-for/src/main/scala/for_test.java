public class for_test {

    public static void main(String[] args) {

        String[] arr = new String[] {"1", "2", "3"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i++]); // i - мутируемая переменная
            i++;
        }
    }

}
