package Lesson06.Task01;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
    private int number;

    public FactorialTask(int number){
        super();
        this.number = number;
    }

    public FactorialTask(){
        super();
    }

    public BigInteger calculateFactorial(int n){
        BigInteger factor = new BigInteger("1");
        for (int i = 1; i <= n; i++){
            factor = factor.multiply(new BigInteger(Integer.toString(i)));
        }

        return factor;
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        for (int i = 1; i <= number; i++){
            if (thr.isInterrupted()){
                return;
            }
            System.out.println(thr.getName() + " " + i + " ! = " + calculateFactorial(i));
        }
    }
}
