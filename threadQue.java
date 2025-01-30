class SumThread extends Thread {
    private int[] array;
    private boolean sumOdd;
    private int result;

    public SumThread(int[] array, boolean sumOdd) {
        this.array = array;
        this.sumOdd = sumOdd;
        this.result = 0;
    }

    @Override
    public void run() {
        if (sumOdd) {
            result = sumOddNumbers();
        } else {
            result = sumEvenNumbers();
        }
    }

    public int getResult() {
        return result;
    }

    private int sumOddNumbers() {
        int sum = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }

    private int sumEvenNumbers() {
        int sum = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}

public class threadQue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        SumThread thread1 = new SumThread(numbers, true);  // Sum odd numbers
        SumThread thread2 = new SumThread(numbers, false); // Sum even numbers

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sumOfOdd = thread1.getResult();
        int sumOfEven = thread2.getResult();

        System.out.println("Sum of odd numbers: " + sumOfOdd);
        System.out.println("Sum of even numbers: " + sumOfEven);
    }
}
