package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int length = String.valueOf(t).length();
        int result=0;
        int tmp=t>=0?t:-t;
        for (int i=1;i<=length;i++)
        {
            result = result + (tmp % 10);
            tmp = tmp/10;
        }
        System.out.println(result);
    }
}
