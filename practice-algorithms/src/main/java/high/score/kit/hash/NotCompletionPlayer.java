package high.score.kit.hash;

import java.util.HashMap;

public class NotCompletionPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String p:participant){
            hashMap.put(p, hashMap.getOrDefault(p, 0) + 1);
        }

        for (String c: completion){
            hashMap.put(c, hashMap.get(c) -1);
        }

        for (String k: hashMap.keySet()){
            if(hashMap.get(k) != 0){
                answer = k;
            }
        }

        return answer;
    }
}
