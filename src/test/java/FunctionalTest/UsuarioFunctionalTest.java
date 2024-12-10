package FunctionalTest;

import ControllerClient.UsuarioControllerClient;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;


public class UsuarioFunctionalTest {


    @Test
    public void testGetUsers() {
        UsuarioControllerClient usuarioControllerClient = new UsuarioControllerClient();

        usuarioControllerClient.getUsuario()
                .statusCode(HttpStatus.SC_OK)
                .body("quantidade",equalTo(56));

    }

    @Test
    public void testGetUsersById() {
        UsuarioControllerClient usuarioControllerClient = new UsuarioControllerClient();

        usuarioControllerClient
                .getUsuarioById("0bXd9VvaETB5COOS")
                .statusCode(HttpStatus.SC_OK)
                .body("_id",equalTo("0bXd9VvaETB5COOS"));

    }

    @Test
    public void testGetUsersByName() {
        UsuarioControllerClient usuarioControllerClient = new UsuarioControllerClient();

        usuarioControllerClient
                .getUsuarioByName("Fulano da Silva")
                .statusCode(HttpStatus.SC_OK)
                .body("usuarios[0].nome",equalTo("Fulano da Silva"));


    }



}
