public class Math{
    public static void main(String[] args) {
        //Math.abs() - Abszolút érték
        int num1 = -5;
        int absValue = Math.abs(num1);
        System.out.println("Metódus #1: Math.abs()");
        System.out.println("Az abszolút értéke " + num1 + "-nek: " + absValue);
        printSeparator();

        //Math.sqrt() - Gyökvonás
        double num2 = 25.0;
        double sqrtValue = Math.sqrt(num2);
        System.out.println("Metódus #2: Math.sqrt()");
        System.out.println("A(z) " + num2 + " szám négyzetgyöke: " + sqrtValue);
        printSeparator();

        //Math.pow() - Hatványozás
        double base = 2.0;
        double exponent = 3.0;
        double powValue = Math.pow(base, exponent);
        System.out.println("Metódus #3: Math.pow()");
        System.out.println(base + " hatványa " + exponent + " = " + powValue);
        printSeparator();

        //Math.max() - Maximum
        int num3 = 10;
        int num4 = 7;
        int max = Math.max(num3, num4);
        System.out.println("Metódus #4: Math.max()");
        System.out.println("A nagyobb szám " + num3 + " és " + num4 + " között: " + max);
        printSeparator();

        //Math.min() - Minimum
        int num5 = 15;
        int num6 = 20;
        int min = Math.min(num5, num6);
        System.out.println("Metódus #5: Math.min()");
        System.out.println("A kisebb szám " + num5 + " és " + num6 + " között: " + min);
        printSeparator();
    }

    private static void printSeparator() {
        System.out.println("----------------------------------------");
    }
}
