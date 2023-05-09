package co.develhope.swagger2.entities;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;

public class ArithmeticOperation {
    @Schema(description = "The name of the arithmetic operation", example = "Addition")
    private String name;
    @Schema(description = "Minimum number of operands that are necessary to computer the operation ", example = "2")
    private int minNumberOfOperands;
    @Schema(description = "The description of the operation", example = "addend + addend = sum")
    private String description;
    @Schema(description = "A list of properties of the specific operation", example = "['Anti-commutativity', 'Non-associativity', 'Predecessor']")
    private String[] properties;

    public ArithmeticOperation(String name, int minNumberOfOperands, String description, String[] properties) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.properties = properties;
    }
    public ArithmeticOperation(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public void setMinNumberOfOperands(int minNumberOfOperands) {
        this.minNumberOfOperands = minNumberOfOperands;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ArithmeticOperation{" +
                "name='" + name + '\'' +
                ", minNumberOfOperands=" + minNumberOfOperands +
                ", description='" + description + '\'' +
                ", properties=" + Arrays.toString(properties) +
                '}';
    }
}
