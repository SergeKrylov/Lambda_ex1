import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
    }
}



/* Ошибка заключается в недопустимости деления на 0, которое возможно.
Пути решения:
1. Обработка исключения, как выполнено выше.
2. Обработка внутри лямбда-выражения

BinaryOperator<Integer> devide = (x, y) -> {
    if (y == 0) {
        System.out.println("Ошибка: деление на ноль!");
        return 0;
    } else return x / y;
}
*/

