package helpers;

import org.json.JSONObject;

import java.util.Iterator;

public class JsonAssert {
    public static void areEqualJson(String expected, String actual, String msg) throws Exception{
        boolean areEqual = true;
        JSONObject expectedJson = new JSONObject(expected);
        JSONObject actualJson = new JSONObject(actual);

        Iterator<?> attributes = expectedJson.keys();

        while (attributes.hasNext()){
            String attribute = (String) attributes.next();

            if (expectedJson.has(attribute) && actualJson.has(attribute)) {
                String expectedValue = String.valueOf(expectedJson.get(attribute));
                String actualValue = String.valueOf(actualJson.get(attribute));

                if (expectedValue.equals("IGNORE") || actualValue.equals("IGNORE")) {
                    System.out.println("Ignorando atributo: " + attribute);
                } else if (!expectedValue.equals(actualValue)) {
                    System.out.println("ERROR> el atributo: " + attribute + " > actual: " + actualValue + " vs el expected: +" + expectedValue);
                    areEqual = false;
                    msg=msg+"\nERROR> el atributo: " + attribute + " > actual: " + actualValue + " vs el expected: +" + expectedValue;
                }
            }else {
                System.out.println("ERROR> el atributo no existe: "+attribute);
                areEqual=false;
                msg=msg+"\nERROR> el atributo no existe: "+attribute;
            }
        }

        if (!areEqual){
            throw new Exception(msg);
        }
    }
}
