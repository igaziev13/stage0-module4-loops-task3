package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f1=0,f2=1,result=f1+f2;
        System.out.println(f1+"\n"+f2);
        for (int i = 3; i <= lastFibonacci; i++) {
            System.out.println(result);
            f1 = f2;
            f2 = result;
            result = f1 + f2;
        }
    }
}
