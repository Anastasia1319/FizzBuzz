public class FizzBuzz {
    private int begin;
    private int end;

    public FizzBuzz (int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getBegin() {
        return begin;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Begin from " + begin + " to " + end + ":";
    }

    public void start () {
        for (int i = begin; i <= end; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
