package Healthcheck;

import ControllerClient.UsuarioControllerClient;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class HealthcheckTest {

    @Test
    public void healthcheck() {
        UsuarioControllerClient usuarioControllerClient = new UsuarioControllerClient();

        usuarioControllerClient.getUsuario()
                .statusCode(HttpStatus.SC_OK);
    }

}

