package pro.sky.calculatordemo.CalculatorService;

import org.springframework.stereotype.Service;
import pro.sky.calculatordemo.CalculatorException.ArithmeticException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return num1 / num2;
    }

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

}
