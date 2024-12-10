package ContractTest;

import ControllerClient.ProdutoControllerClient;
import Utils.SchemaUtil;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class ProdutosContractTest {

    @Test
    public void testGetProductsContract(){
        ProdutoControllerClient produtoControllerClient = new ProdutoControllerClient();
        produtoControllerClient
                .getProducts().statusCode(HttpStatus.SC_OK)
                .body(JsonSchemaValidator.matchesJsonSchema(SchemaUtil.getSchemaFile("produtos.json")));

    }
}
