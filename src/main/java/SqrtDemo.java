public class SqrtDemo
{
    public static void printSqrt(double number, int signs) {
        Sqrt sqrt = new Sqrt(number, signs);
<<<<<<< HEAD
        System.out.print("Sqrt of " + number + " (delta = " + sqrt.delta + ") = ");
        System.out.print(String.format("%(."+signs+"f", sqrt.calc()) + ".");
=======
        System.out.println("Sqrt of " + number + " (delta = " + sqrt.delta + ") = " + sqrt.calc());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    public static void main(String[] args) {
        printSqrt(7,15);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
