package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int i=4;
        int sum=0;
        while (i>0){
            int x=number%10;
            sum=sum+x;
            number=number/10;
            i--;
        }
        System.out.println(sum);
    }
}
