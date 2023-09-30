import com.example.ExternalService;
import org.junit.Test;
import se.distansakademin.MyService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testPerformAction() {
        // Skapa en mock av ExternalService
        ExternalService externalServiceMock = mock(ExternalService.class);

        // Definiera beteendet för mock-objektet
        when(externalServiceMock.execute("input")).thenReturn("exec:input");

        // Använda mock-objektet i MyService
        MyService myService = new MyService(externalServiceMock);

        // Testa metoden och verifiera resultatet
        assertEquals("exec:input", myService.performAction("input"));

        // Verifiera att mock-objektet användes som förväntat
        verify(externalServiceMock).execute("input");
    }
}
