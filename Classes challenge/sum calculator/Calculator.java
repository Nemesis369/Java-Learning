public class Calculator {
    private int firstNum;
    private int secondNum;

    // getter methods
    public int getFirstNum() {
        return this.firstNum;
    }
    public int getSecondNum() {
        return this.secondNum;
    }

    // setter methods
    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }
    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    // calculation methods
    public int addition() {
        return this.firstNum + this.secondNum;
    }
    public int subtraction() {
        return this.firstNum - this.secondNum;
    }
    public int division() {
        try {
            if (this.secondNum == 0) {
                throw new DivisionByZero("Division by 0");
            }
            return this.firstNum / this.secondNum;
        } catch (DivisionByZero e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public int multiplication() {
        return this.firstNum * this.secondNum;
    }

    // custom expection handler
    public static class DivisionByZero extends Exception {
        public DivisionByZero(String message) {
            super(message);
        }
    }
}