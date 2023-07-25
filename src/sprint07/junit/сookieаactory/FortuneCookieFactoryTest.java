package sprint07.junit.сookieаactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class FortuneCookieFactoryTest {

    List<String> goodFortune = Collections.singletonList("Все будет хорошо!");
    List<String> badFortune = Collections.singletonList("Все будет плохо!");
    FortuneConfig fc = new FortuneConfig(true);
    FortuneCookieFactory fcf;

    @BeforeEach
    public void beforeEach() {
        fcf = new FortuneCookieFactory(fc, goodFortune, badFortune);
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        fcf.bakeFortuneCookie();
        Assertions.assertEquals(1,fcf.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked () {
        fcf.bakeFortuneCookie();
        fcf.bakeFortuneCookie();
        Assertions.assertEquals(2,fcf.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        fcf.bakeFortuneCookie();
        fcf.bakeFortuneCookie();
        fcf.resetCookiesCreated();
        Assertions.assertEquals(0,fcf.getCookiesBaked());
    }

}
