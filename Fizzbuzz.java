public class Fizzbuzz {
    private int upperLimit;

    public Fizzbuzz(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void start() {
        for (int i = 1; i <= upperLimit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Fizzbuzz fb = new Fizzbuzz(100);
        fb.start();
    }
}
