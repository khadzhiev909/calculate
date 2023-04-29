package proskydemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServise implements CalculateServiseI {
    @Override
    public String sayHello() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String sum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка введите числа больше 0";
        }
        return "Сумма равна: " + num1 + num2;
    }
    @Override
    public String minus(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return "Ошибка введите числа больше 0";
        } else {
            return "Cумма равна: " + (number1 - number2);
        }
    }
    @Override
    public String multiplay(Integer number1, Integer number2) {
        if (number1 == null && number2 == null) {
            return "Ошибка введите числа больше 0";
        }
        return " " + number1 * number2;

    }
    @Override
    public String devide(Integer number1, Integer number2) {
        if (number1 == null && number2 == null) {
            return "Ошибка введите числа больше 0";
        }
        return " " + number1 / number2;
    }

}