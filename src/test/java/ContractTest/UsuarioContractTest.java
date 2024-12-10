package ContractTest;

import ControllerClient.UsuarioControllerClient;
import Utils.SchemaUtil;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;


    public class UsuarioContractTest {

        @Test
        public void testGetUsuarioContract() {
            UsuarioControllerClient usuarioControllerClient = new UsuarioControllerClient();

            usuarioControllerClient
                    .getUsuario()
                    .statusCode(HttpStatus.SC_OK)
                    .body(JsonSchemaValidator.matchesJsonSchema(SchemaUtil.getSchemaFile("usuarios.json")));


        }

}
