package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int num1 = number % 10;
        number /= 10;
        int num2 = number % 10;
        number /= 10;
        System.out.println(num1 * 100 + num2 * 10 + number);
    }
}
