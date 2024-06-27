package pro.sky.calculatordemo.CalculatorService;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private CalculatorService calculatorService;



    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    void sum() {
        CalculatorService calculatorService = new CalculatorServiceImpl();
        int sum = calculatorService.sum(5, 5);
        Assertions.assertEquals(10, sum);
    }

    @Test
    void subtract() {
        CalculatorService calculatorService = new CalculatorServiceImpl();
        int subtract = calculatorService.subtract(5, 5);
        Assertions.assertEquals(0, subtract);
    }

    @Test
    void multiply() {
        CalculatorService calculatorService = new CalculatorServiceImpl();
        int multiply = calculatorService.multiply(5, 5);
        Assertions.assertEquals(25, multiply);
    }

    @Test
    void divide() {
        CalculatorService calculatorService = new CalculatorServiceImpl();
        int divide = calculatorService.divide(5, 5);
        Assertions.assertEquals(1, divide);
    }

    @Test
    void hello() {
        CalculatorService calculatorService = new CalculatorServiceImpl();
        String hello = calculatorService.hello();
        Assertions.assertEquals("Добро пожаловать в калькулятор", hello);
    }
}