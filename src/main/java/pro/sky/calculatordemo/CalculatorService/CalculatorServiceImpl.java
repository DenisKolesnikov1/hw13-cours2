package pro.sky.calculatordemo.CalculatorService;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(int num1, int num5) {
        return num5 + num5;
    }

    @Override
    public int subtract(int num2, int num5) {
        return num2 - num5;
    }

    @Override
    public int multiply(int num1, int num5) {
        return num5 * num5;
    }

    @Override
    public int divide(int num1, int num5) {
        if (num5 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num5;
    }

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
}
