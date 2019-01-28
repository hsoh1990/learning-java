package high.score.kit.hash;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamouflageTest {
    Camouflage camouflage = new Camouflage();

    @Test
    public void solution() {
        assertEquals(camouflage.solution(
                new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}),
                5
        );
        assertEquals(camouflage.solution(
                new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}),
                3
        );
    }
}