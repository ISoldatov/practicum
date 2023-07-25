package sprint07.junit.сookieаactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class FortuneCookieControllerTest {

    static List<String> goodFortune = Collections.singletonList("positive!");
    static List<String> badFortune = Collections.singletonList("negative");

    static FortuneCookieController fortuneCookieControllerPositiv;
    static FortuneCookieController fortuneCookieControllerNegativ;

    @BeforeAll
    public static void beforeAll() {
        FortuneConfig configPositiv = new FortuneConfig(true);
        FortuneConfig configNegativ = new FortuneConfig(false);
        FortuneCookieFactory fortuneCookieFactoryPositiv = new FortuneCookieFactory(configPositiv, goodFortune, badFortune);
        FortuneCookieFactory fortuneCookieFactoryNegativ = new FortuneCookieFactory(configNegativ, goodFortune, badFortune);
        fortuneCookieControllerPositiv = new FortuneCookieController(fortuneCookieFactoryPositiv);
        fortuneCookieControllerNegativ = new FortuneCookieController(fortuneCookieFactoryNegativ);
    }

    @Test
    public void shouldReturnPositiveFortune() {
        FortuneCookie fc= fortuneCookieControllerPositiv.tellFortune();
        Assertions.assertEquals("positive!",fc.getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune () {
        FortuneCookie fc= fortuneCookieControllerNegativ.tellFortune();
        Assertions.assertEquals("negative",fc.getFortuneText());
    }

}
