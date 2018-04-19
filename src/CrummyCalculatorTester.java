public class CrummyCalculatorTester {
    public static void main(String[] args) {
        CrummyCalculator calc = new CrummyCalculator();
        calc.setAdd(750);
        calc.setSubtract(420);
        calc.setMultiply(13);
        calc.setDivide(30);
        System.out.println(calc.getAnswer());
    }
}