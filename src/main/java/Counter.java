import java.util.Arrays;

public class Counter {


    String[] numbersArray = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };

    public double TextToMathWithVariables(String input){

        String noParenthesis = input.replaceAll("[()]", "");
        String[] array = noParenthesis.split(" ");

        for (int i=0; i< array.length; i++) {
            if ((!array[i].matches("[0-9]+") && (i != 1) )) {
                int resNr = Arrays.asList(numbersArray).indexOf(array[i]);

                array[i] = String.valueOf(resNr);
            }
        }

        return Calc(Double.parseDouble(array[0]), Double.parseDouble(array[2]), array[1]);
    }

    public double TextToMath(String input){

        String noParenthesis = input.replaceAll("[()]", "");
        String[] array = noParenthesis.split(" ");

        return Calc(Double.parseDouble(array[0]), Double.parseDouble(array[2]), array[1]);
    }


    public double Calc(double first, double second, String type){
        return switch (type) {
            case "+", "add", "plus" -> add(first, second);
            case "-", "sub", "minus" -> sub(first, second);
            case "*", "multi", "multiply" -> multi(first, second);
            case "/", "div", "divide" -> div(first, second);
            default -> throw new IllegalArgumentException("Error of some sort");
        };
    }

    public double add(double first, double second) {
        return first + second;
    }
    public double sub(double first, double second) {
        return first - second;
    }
    public double multi(double first, double second) {
        return first * second;
    }
    public double div(double first, double second) {
        return first / second;
    }
}
