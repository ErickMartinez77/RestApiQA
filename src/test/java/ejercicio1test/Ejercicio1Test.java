package ejercicio1test;

import ejercicio1.Ejercicio1;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    JSONObject actualJson;
    JSONObject expectedJson;

    @BeforeEach
    public void json() {
        actualJson = new JSONObject();
        expectedJson = new JSONObject();
    }

    @Test
    public void testEquals() {
        actualJson.put("Nombre", "Erick");
        actualJson.put("Apellido", "Martinez");
        actualJson.put("Edad", 20);
        expectedJson.put("Nombre", "Erick");
        expectedJson.put("Apellido", "Martinez");
        expectedJson.put("Edad", 20);

        boolean expectedResult = true;
        boolean actualResult = Ejercicio1.compareJson(actualJson.toString(), expectedJson.toString());
        Assertions.assertEquals(expectedResult, actualResult,"Mal");
    }

    @Test
    public void testNotEquals() {
        actualJson.put("Nombre", "Erick");
        actualJson.put("Apellido", "Martinez");
        actualJson.put("Edad", 20);
        expectedJson.put("Nombre", "Erick");
        expectedJson.put("Apellido", "Martinez");
        expectedJson.put("Edad", 30);

        boolean expectedResult = false;
        boolean actualResult = Ejercicio1.compareJson(actualJson.toString(), expectedJson.toString());
        Assertions.assertEquals(expectedResult, actualResult,"ERROR");
    }

    @Test
    public void testIgnore() {
        actualJson.put("Nombre", "Erick");
        actualJson.put("Apellido", "Martinez");
        actualJson.put("Edad", 20);
        expectedJson.put("Nombre", "Erick");
        expectedJson.put("Apellido", "IGNORE");
        expectedJson.put("Edad", 20);

        boolean expectedResult = true;
        boolean actualResult = Ejercicio1.compareJson(actualJson.toString(), expectedJson.toString());
        Assertions.assertEquals(expectedResult, actualResult,"ERROR");
    }

}
