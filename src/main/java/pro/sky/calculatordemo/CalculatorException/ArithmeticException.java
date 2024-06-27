package pro.sky.calculatordemo.CalculatorException;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ArithmeticException extends IllegalArgumentException {

    public ArithmeticException() {
        super("Division by zero");
    }
}
