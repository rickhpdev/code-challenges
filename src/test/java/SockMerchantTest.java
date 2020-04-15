import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SockMerchantTest {

    @InjectMocks
    SockMerchant sockMerchant;

    @Test
    public void testMainScenario() {

       int result =  SockMerchant.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
       assertEquals(3, result);
    }
}
