package demo.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
//        Raw types / K & V as Objects
        Map countryCodesMap = new HashMap();
        Float floatVar = 52.55f;
        countryCodesMap.put(floatVar, "Mexico");
        countryCodesMap.put("Mexico", 52);
        System.out.println(countryCodesMap);

        //        Generics / Type Safe / JDK 1.5 onwards
//        Map<Integer, String> countryCodesMap1 = new HashMap<Integer, String>();
        Map<Integer, String> countryCodesMap1 = new HashMap<>();
//        'put(java.lang.Integer, java.lang.String)' in 'java.util.Map'
//        cannot be applied to '(java.lang.Float, java.lang.String)'
//        countryCodesMap1.put(floatVar, "Mexico");
//        countryCodesMap1.put("Mexico", 52);
        countryCodesMap1.put(52, "Mexico");
        countryCodesMap1.put(91, "India");
        countryCodesMap1.put(81, "Japan");
        System.out.println(countryCodesMap1);
        System.out.println(countryCodesMap1.size());
        // search
        String country = countryCodesMap1.get(52);
        System.out.println(country);
        System.out.println(countryCodesMap1.get(53));
        if(countryCodesMap1.containsKey(91)) {
            System.out.println("91 Found");
        }
        if(countryCodesMap1.containsValue("Japan")) {
            System.out.println("Japan Found");
        }
        countryCodesMap1.clear();
        System.out.println(countryCodesMap1);
    }
}
