package high.score.kit.hash;

import org.junit.Test;

import static org.junit.Assert.*;

public class NotCompletionPlayerTest {
    NotCompletionPlayer notCompletionPlayer = new NotCompletionPlayer();

    @Test
    public void solution() {
        assertEquals(notCompletionPlayer.solution(
                new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}),
                "leo"
        );
        assertEquals(notCompletionPlayer.solution(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}),
                "vinko"
        );
        assertEquals(notCompletionPlayer.solution(
                new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}),
                "mislav"
        );
    }
}