package high.score.kit.hash;

import java.util.HashMap;

public class Camouflage {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            String key = clothe[1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (Integer integer : map.values()) {
            answer *= integer.intValue() + 1;
        }

        return answer - 1;
    }
}
