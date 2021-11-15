import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RTSPrograms {

    public Map<String, Integer> aboveBelow(List<Integer> values, int compare) {
        Map<String, Integer> result = new HashMap<>();
        result.put("above", 0);
        result.put("below", 0);

        for (int value : values) {
            if (value > compare) {
                result.replace("above", result.get("above") + 1);
            } else if (value < compare) {
                result.replace("below", result.get("below") + 1);
            }
        }

        return result;
    }

    public String stringRotation(String original, int rotAmount) {
        if (original.isEmpty()) return "";
        // modulo the rotation since it repeats the rotation per ever length of the string
        rotAmount %= original.length();
        String back = original.substring(original.length() - rotAmount);
        String front = original.substring(0, original.length() - rotAmount);
        return back + front;
    }
}
