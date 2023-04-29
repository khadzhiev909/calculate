package proskydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    private final CalculatorServise calculatorServise;

    public CalculateController(CalculatorServise calculatorServise) {
        this.calculatorServise = calculatorServise;
    }

    @GetMapping
    public String welcome() {
        return calculatorServise.sayHello();
    }

    @GetMapping("/plus")
    public String sum(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorServise.sum(number1, number2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorServise.minus(number1, number2);
    }

    @GetMapping("multiply")
    public String multiplay(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorServise.multiplay(number1, number2);
    }

    @GetMapping("/divide")
    public String devide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorServise.devide(number1, number2);
    }

}
