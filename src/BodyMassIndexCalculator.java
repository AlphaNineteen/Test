import java.io.InputStream;
import java.io.OutputStream;

public class BodyMassIndexCalculator {
    private static final String NORMAL = "Ваши показатели в норме";
    private static final String EXCESS = "У вас избыточный вес";

    public static float calculate(float weight, float height) {
        return weight / (float) Math.pow((height / 100), 2);
    }

    public static String getDiagnosis(float bodyMassIndex) {
        if (bodyMassIndex < 25) {
            return NORMAL;
        } else if (bodyMassIndex < 29.9) {
            return EXCESS;
        } else if (bodyMassIndex < 34.9) {
            return "У вас ожирение I степени";
        } else if (bodyMassIndex < 39.9) {
            return "У вас ожирение II степени";
        } else {
            return "У вас ожирение III степени";
        }
    }

}
