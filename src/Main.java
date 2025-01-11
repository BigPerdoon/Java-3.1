public class Main {
    public static void main(String[] args) {
        Bmiservice service = new Bmiservice();
        // Пример использования метода calculate
        int bmiResult = service.calculate(98, 1.87);
        System.out.println("BMI: " + bmiResult);
    }
}
