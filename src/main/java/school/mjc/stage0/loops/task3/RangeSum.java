package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = firstBoarder;
        for (int i=firstBoarder+1;i<=secondBoarder;i++)
            result = result+i;
        System.out.println(result);
    }
}
