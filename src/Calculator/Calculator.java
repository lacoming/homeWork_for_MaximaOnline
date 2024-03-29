package Calculator;

import java.security.InvalidParameterException;

public class Calculator {

    private static double result = 0;

    private final double MAX_VALUE = Double.MAX_VALUE;
    private final double MIN_VALUE = Double.MIN_VALUE;

    public double add(double a, double b){

        if (result == 0) {
            result = a + b;
        }

        else {
            result += a + b;
        }

        if (result > MAX_VALUE){
            throw new ArithmeticException("Слишком большое число");
        }

        return result;
    }

    public double sub(double a, double b){

        if (result == 0) {
            result = a - b;
        }

        else {
            result += a - b;
        }

        // if (result < MIN_VALUE){
        //  throw new ArithmeticException("Слишком маленькое число");
        // }
        // TODO: Разобраться почему не работает

        return result;
    }

    public double mul(double a, double b){

        if (result == 0) {
            result = a * b;
        }

        else {
            result += a * b;
        }

       /* if (result > MAX_VALUE){
            throw new ArithmeticException("Слишком большое число");
        }

        if (result < MIN_VALUE){
            throw new ArithmeticException("Слишком маленькое число");
        }*/

        return result;
    }

    public double div(double a, double b){

        if (b == 0) {
            throw new InvalidParameterException("Error: b == 0");
        }

        if (result == 0) {
            result = a / b;
        }

        else {
            result += a / b;
        }

        return result;
    }

    public double pow(double a, double pow){

        if (result == 0) {
            result = Math.pow(a, pow);
        }

        else {
            result += Math.pow(a, pow);
        }

        if (result > MAX_VALUE){
            throw new ArithmeticException("Слишком большое число");
        }

        return result;
    }

    public double sqr(double a){

        if (a < 0){
            throw new ArithmeticException("Число меньше нуля");
        }

        if (result == 0) {
            result = Math.sqrt(a);
        }

        else {
            result += Math.sqrt(a);
        }

        return result;
    }

    public void resetCalculation(){
        result = 0;
    }


}
