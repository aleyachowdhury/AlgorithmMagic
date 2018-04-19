public class CrummyCalculator {
    public int add;
    public int subtract;
    public int multiply;
    public int divide;
    public int answer;
    private int clear;

    public int setAdd(int add) {
        this.add = add;
        return add;
    }

    public int setSubtract(int subtract) {
        this.subtract = subtract;
        return subtract;
    }

    public int setMultiply(int multiply) {

        this.multiply = multiply;

        return multiply;
    }


    public int setDivide(int divide) {
        this.divide = divide;
        return divide;
    }
    public void setClear() {
        this.clear = 0;
    }

    public int getAnswer() {

          answer = ((setAdd(add)-setSubtract(subtract))*setMultiply(multiply))/setDivide(divide);
        return answer;
    }
}

