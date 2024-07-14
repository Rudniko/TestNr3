package pl.kurs.zad3;


public class FibonacciRunner {
    public static void main(String[] args) {

        int fibonacciIndex = getFibonacciIndex(8);
        System.out.println(fibonacciIndex);


    }


    static int getFibonacciIndex(int number) {
        int firstNumber = 1;
        int secondNumber = 1;
        int index = 1;

        while (secondNumber <= number) {
            if (secondNumber == number) {
                return index;
            }

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            index++;
        }

        return -1;
    }
}
