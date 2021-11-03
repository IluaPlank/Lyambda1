import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    //складываются 2 числа
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    //минусуются 2 числа
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //умножаются 2 числа
    BinaryOperator<Integer> devide = (x, y) ->  {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        return 0;
    };
    //исправил devide , что б при y < 0 , не появлялась ошибка, теперь всегда будет уведомлять об делении на 0
    //BinaryOperator<Integer> devide = (x, y) -> x / y;
    // делятся 2 числа(выражение до исправления)
    UnaryOperator<Integer> pow = x -> x * x;
    // возводится число в квадрат
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    //х больше нуля,то равно х , меньше равно х*-1

    Predicate<Integer> isPositive = x -> x > 0;
    //больше 0 , тру

    Consumer<Integer> println = System.out::println;
}
