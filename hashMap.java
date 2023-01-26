//hashMap implements the Map Interface (need the import)
//hashMap is similar to ArrayList, but with key-value pairs
//stores objects, need to use Wrapper Classes
//ex: (name, email) (username, userID) (country, capital)
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        //create a HashMap object
        HashMap<String, String> countries = new HashMap<>();

        System.out.println("HashMap Methods\n-----------------");
        //add a key and value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Dehli");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");
        System.out.println(countries);

        //remove a country by passing a key
        countries.remove("USA");

        //return the value of the key
        System.out.println(countries.get("Russia"));

        //clear the entire HashMap
        countries.clear();

        countries.put("USA", "Washington DC");
        countries.put("India", "New Dehli");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");
        System.out.println(countries);

        //check the size of the HashMap
        System.out.println(countries.size());
        
        //replace a key value
        countries.replace("USA", "Detroit");
        System.out.println(countries);

        //checks if the HashMap contains a key : boolean
        System.out.println(countries.containsKey("China"));
        System.out.println(countries.containsKey("England"));

        //checks if the HashMap contains a value : boolean
        System.out.println(countries.containsValue("Beijing"));
        System.out.println(countries.containsValue("Ohio"));

        System.out.println("==============================================");
        System.out.println("-----HashMap-----");
        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }

    }
}
