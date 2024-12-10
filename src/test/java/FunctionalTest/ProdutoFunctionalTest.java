package FunctionalTest;

import ControllerClient.ProdutoControllerClient;
import DTO.ProdutoDTO;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class ProdutoFunctionalTest {

    @Test
    public void testGetProductsByNameAndId() {
        ProdutoControllerClient produtoControllerClient = new ProdutoControllerClient();

        produtoControllerClient
                .getProductsByName("Aut test API Java 72")
                .statusCode(HttpStatus.SC_OK)
                .body("produtos[0].nome",equalTo("Aut test API Java 72"));

    }

    @Test
    public void testPostProductsWithValidFields() {
        ProdutoControllerClient produtoControllerClient = new ProdutoControllerClient();
        ProdutoDTO produtoDTO = new ProdutoDTO("Violão 2 ", 800, "Tocar Gitarra", 100);

        produtoControllerClient
                .postProduct(produtoDTO)
                .statusCode(HttpStatus.SC_CREATED)
                .body("message",equalTo("Cadastro realizado com sucesso"));

    }
}
