package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int a,b,c;
        a=number/100;
        b=number/10%10;
        c=number%10;
        System.out.println(c*100+b*10+a);
    }
}
