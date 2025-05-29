package ie.atu.JDBC;

public class calculator {
    public static int add(int firstNum, int secondNum)
    {
        long result = (long) firstNum + secondNum;
        if(result > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException("The value was too big");
        }
        return (int) result;
    }
    public int subtract(int firstNum, int secondNum)
    {
        if (firstNum - secondNum < 0){
            throw new IllegalStateException("Negative results are not allowed");
        }
        return  firstNum - secondNum;
    }
    public int divide(int firstNum, int secondNum)
    {
        if (secondNum== 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return firstNum / secondNum;
    }
    public int multiply(int firstNum, int secondNum)
    {
        long result = (long) firstNum * secondNum;
        if (result > Integer.MAX_VALUE)
        {
            throw new UnsupportedOperationException("Overflow");
        }
        return (int) result;
    }
}
