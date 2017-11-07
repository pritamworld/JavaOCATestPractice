/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaocatestpractice;

/**
 *
 * @author pritesh.patel
 */
//import org.json.*;

public class _C {
    
    //Instant initializer - Called when EACH TIME Object is created
    {
        System.out.println("Hello World");
        int a=100;
    }

    private static int $;

    public static void main(String[] main) {
        //String a_b;
        //System.out.print($);
        //System.out.print(a_b);
        
        int x = 200;

        _C c1 = new _C();
        _C c2 = new _C();
        
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2); //True
        System.out.println(s1.equals(s2)); //True
        System.out.println(sb1.toString() == s1); //False
        System.out.println(sb1.toString().equals(s1)); //True

      
        //processJSON();
        //System.out.println(main.length);
        //main(null);
        //Finalizer.main(null);
        //main();
        
    }
    
    public static void main(){
         System.out.println("Hello Main()");
    }

    /*
    private static void processJSON() {
        //String jsonString = "{\"message\":\"No Results found!\",\"status\":\"false\"}";
         String jsonString = "[{\"prodictId\":\"P00001\",\"productName\":\"iPhone 6\"},"
                + "{\"prodictId\":\"P00002\",\"productName\":\"iPhone 6 Plus\"},"
                + "{\"prodictId\":\"P00003\",\"productName\":\"iPhone 7\"}]";
         
        JSONArray jsonArrayResponse;
        JSONObject jsonObject;
        try {
            Object json = new JSONTokener(jsonString).nextValue();
            if (json instanceof JSONObject) {
                jsonObject = new JSONObject(jsonString);
                if (jsonObject != null) {
                    System.out.println(jsonObject.toString());
                }
            } else if (json instanceof JSONArray) {
                jsonArrayResponse = new JSONArray(jsonString);
                if (jsonArrayResponse != null && jsonArrayResponse.length() > 0) {
                    System.out.println(jsonArrayResponse.toString());
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
*/
}

//Compilation error on line#19
