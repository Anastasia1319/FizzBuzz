public class Main {
    public static void main(String[] args) {
        FizzBuzz theFirst = new FizzBuzz(3,20);
        System.out.println(theFirst);
        theFirst.start();

        FizzBuzz theSecond = new FizzBuzz(1,5);
        System.out.println(theSecond);
        theSecond.start();

    }
}