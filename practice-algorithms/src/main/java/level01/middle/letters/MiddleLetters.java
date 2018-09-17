package level01.middle.letters;

public class MiddleLetters {
    public String solution(String s) {
        return s.substring((s.length()-1)/2, (s.length()/2)+1);
    }
}
