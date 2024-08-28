package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/calculator")
public class Calculator {
    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path="/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        return calculatorService.plus(a, b);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        return calculatorService.minus(a, b);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        return calculatorService.multiply(a, b);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        return calculatorService.divide(a, b);
    }
}


