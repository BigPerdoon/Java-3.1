public class Bmiservice {
	// Метод для расчета BMI
	public int calculate(double weightKg, double heightM) {
		// Рассчитываем BMI: вес (кг) / (рост (м) ^ 2)
		double bmi = weightKg / (heightM * heightM);
		// Возвращаем целое число
		return (int) bmi;
	}
}
