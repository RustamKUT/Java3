public class BmiService {
    public int calculate(int weightInKg, double heightInMeters) {
        // double bmi = weightInKg / Math.pow(heightInMeters, 2); // 1 вариант возвести в степень при помощи функции
        // double bmi = weightInKg / (heightInMeters * heightInMeters); // 2 вариант через умножение
        double bmi = weightInKg / heightInMeters / heightInMeters; // 3 вариант деление
        return (int) bmi;
    }
}
