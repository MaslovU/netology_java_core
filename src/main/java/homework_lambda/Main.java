package homework_lambda;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        Integer c = null, f = null;
        
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        try {
            c = calc.devide.apply(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot execute this operation");
        }
        int d = calc.multiply.apply(3, 6);

        try {
            f = calc.abs.apply(c);
        } catch (NullPointerException e) {
            System.out.println("Cannot execute abs with Null");
        }


        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(f);
    }
}
