package zeus.test.infra.random;

import zeus.infra.rand.IdGenerator;

/**
 * Created by KG on 2017/4/25.
 */
public class getRandomStringTest {
    public static void main(String args[]) {
        String randString = IdGenerator.getRandomString(16);
        System.out.println("Random String: " + randString);
    }
}

