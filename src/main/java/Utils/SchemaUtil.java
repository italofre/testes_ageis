package Utils;


import java.io.File;

public class SchemaUtil {

    private static final String SCHEMA_BASE_PATH = "src/test/resources/json-schemas/";

    public static File getSchemaFile(String schemaFileName) {
        return new File(SCHEMA_BASE_PATH + schemaFileName);
    }
}

