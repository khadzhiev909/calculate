package proskydemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServise implements CalculateServiseI {
    @Override
    public String sayHello() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String sum(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return "Ошибка введенные данные равны null";
        } else if (number1 == 0) {
            return "Первое число меньше 0";
        } else if (number2 == 0) {
            return "Второе число меньше 0";
        }
        return "Сумма равна: " + number1 + number2;
    }
    @Override
    public String minus(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return "Ошибка введенные данные равны null";
        } else if (number1 == 0) {
            return "Первое число меньше 0";
        } else if (number2 == 0) {
            return "Второе число меньше 0";
        } else if (number2 > number1) {
            return "Вычитаемое больше уменьшаемого, вычитание не возможно";
        }
            return "Вычитание равно: " + (number1 - number2);
    }
    @Override
    public String multiplay(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return "Ошибка введенные данные равны null";
        } else if (number1 == 0) {
            return "Первое число меньше 0";
        } else if (number2 == 0) {
            return "Второе число меньше 0";
        }
        return "Деление равно " + number1 * number2;

    }
    @Override
    public String devide(Integer number1, Integer number2) {
        if (number1 == null) {
            return "Ошибка введенные данные равны null";
        } else if (number1 == 0) {
            return "Первое число меньше 0";
        } else if (number2 == 0) {
            return "Второе число меньше 0";
        } else if (number2 > number1) {
            return "Делитель больше делимого, деление не возможно";
        }
        return "Деление равно " + number1 / number2;
    }

}