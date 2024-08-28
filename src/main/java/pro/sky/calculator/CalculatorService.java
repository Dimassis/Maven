package pro.sky.calculator;

import org.springframework.stereotype.Service;
@Service
public class CalculatorService {

    public String welcome() {
        return "Welcome to Calculator";
    }

    public String plus(Integer a, Integer b) {
       if(testEmpty(a,b)) {
           return "<b>Не все значения введены</b>";
       } else {
           return a + " + " + b + " = " + (a + b);
       }
    }

    public String minus(Integer a, Integer b) {
        if(testEmpty(a,b)) {
            return "<b>Не все значения введены</b>";
        } else {
            return a + " - " + b + " = " + (a - b);
        }

    }

    public String multiply(Integer a, Integer b) {
        if(testEmpty(a,b)) {
            return "<b>Не все значения введены</b>";
        } else {
            return a + " * " + b + " = " + (a * b);
        }

    }

    public String divide(Integer a, Integer b) {
        if (b == 0) {
            return "Деление на ноль";
        }
        else if(testEmpty(a,b)) {
            return "<b>Не все значения введены</b>";
        } else {
            return a + " / " + b + " = " + (a / b);
        }
    }
    public boolean testEmpty(Integer a, Integer b) {
        return a == null || b == null;
    }
}
