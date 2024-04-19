import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите массу тела человека: ");
        float weight = scanner.nextFloat();

        System.out.println("Введите рост человека в сантиметрах: ");
        float height = scanner.nextFloat();

        float bodyMassIndex = BodyMassIndexCalculator.calculate(weight, height);

        System.out.println(BodyMassIndexCalculator.getDiagnosis(bodyMassIndex));
    }
}
