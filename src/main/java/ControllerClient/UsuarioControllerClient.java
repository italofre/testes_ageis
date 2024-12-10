package ControllerClient;

import Base.BaseClient;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

// Classe de Chamada as Endpoints - Aqui deve ser implemetada a requisição (sem fazer validações ainda)
public class UsuarioControllerClient extends BaseClient {

    public ValidatableResponse getUsuario() {
        return given()
                .get("/usuarios")
                .then();

    }

    public ValidatableResponse getUsuarioByName(String name) {
        return given()
                .queryParam("nome",name)
                .get("/usuarios/")
                .then();
    }

    public ValidatableResponse getUsuarioById(String id) {
        return given()
                .pathParams("_id",id)
                .get("/usuarios/{_id}")
                .then();

    }



}
