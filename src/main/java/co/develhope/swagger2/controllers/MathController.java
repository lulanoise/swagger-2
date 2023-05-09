package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    @Operation(summary = "Welcome message for Math API")
    public String welcomeMathMsg() {
        return "Welcome to the Math API!";
    }

    @GetMapping("/division-info")
    @Operation(summary = "Get information about division")
    public ArithmeticOperation getDivisionInfo() {
        return new ArithmeticOperation(
                "division",
                2,
                "Divide one operand by another",
                new String[]{"operand1", "operand2"});
    }

    @GetMapping("/multiplication")
    @Operation(summary = "Multiply two numbers")
    public int multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 * num2;
    }

    @GetMapping("/square/{n}")
    @Operation(summary = "Calculate the square of a number")
    public int square(@PathVariable int n) {
        return n * n;
    }
}
