package homework_lambda;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,3);
        int c = calc.devide.apply(a, b);
        int d = calc.multiply.apply(3, 6);
        int f = calc.abs.apply(c);

        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(f);
    }
}
