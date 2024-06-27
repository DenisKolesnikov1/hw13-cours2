package pro.sky.calculatordemo.CalculatorController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculatordemo.CalculatorService.CalculatorService;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {


    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String calculatePlus(@RequestParam ("num5") Integer a, @RequestParam("num5") Integer b) {
        return a + " + " + b + " = " + calculatorService.sum(a, b);
    }

    @GetMapping("/minus")
    public String calculateMinus(@RequestParam ("num5") Integer a, @RequestParam("num5") Integer b) {
        return a + " - " + b + " = " + calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public String calculateMultiply(@RequestParam ("num5") Integer a, @RequestParam("num5") Integer b) {
        return a + " * " + b + " = " + calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public String calculateDivide(@RequestParam ("num5") Integer a, @RequestParam("num5") Integer b) {
        return a + " / " + b + " = " + calculatorService.divide(a, b);
    }
}
