package ControllerClient;

import Base.BaseClient;
import DTO.ProdutoDTO;
import io.restassured.response.ValidatableResponse;

public class ProdutoControllerClient extends BaseClient {

    public ValidatableResponse getProducts(){
        return given()
                .get("/produtos")
                .then();
    }

    public ValidatableResponse getProductsByName(String name){
        return given()
                .queryParam("nome", name)
                .get("/produtos")
                .then();
    }

    public ValidatableResponse postProduct(ProdutoDTO produtoDTO){

        return given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImZ1bGFub0BxYS5jb20iLCJwYXNzd29yZCI6InRlc3RlIiwiaWF0IjoxNzMyMjMyNTEzLCJleHAiOjE3MzIyMzMxMTN9.f8aBKIn0DfysMda5LxrWR-BidYgabVRylVIZIotg2r8")
                .body(produtoDTO)
                .post("produtos")
                .then();

    }


}
