package Base;


import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.http.ContentType.JSON;

public abstract class BaseClient {

    protected BaseClient() {
        configureRestAssured();
    }

    private void configureRestAssured() {
        // Configurações globais do RestAssured
        RestAssured.baseURI = "https://serverest.dev"; // Usa a URL base da configuração global
        RestAssured.requestSpecification = RestAssured.given()
                .contentType(JSON) // Define globalmente o Content-Type como application/json
                .accept(JSON); // Define globalmente o Accept como application/json

        // Filtros globais de logging -request e response
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    protected RequestSpecification given() {
        return RestAssured.given();
    }

    protected RequestSpecification givenWithAuth(String token) {
        return given().header("Authorization", "Bearer " + token);
    }


}
