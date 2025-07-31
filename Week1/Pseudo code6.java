public class Main {
    public static int funn(int a, int b, int c) {
        for (c = 5; c <= 9; c++) {
            if ((b + 5) > (a - b)) {
                a = (b + 5) ^ a;
            }
            b = 5 ^ c;
        }
        return a + b;
    }

    public static void main(String[] args) {
        int a = 1, b = 2, c = 9;
        int result = funn(a, b, c);
        System.out.println("Output: " + result); // Should print: 40
    }
}

ANSWER IS 40
  
