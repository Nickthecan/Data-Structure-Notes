import java.util.*;

/*  HashTable : A data structure that stores unique keys to values
                each key/value pair is an entry
                Fast insertion: look up, deletion of key/value pairs
                not ideal for small data sets, great with large data sets
 *  Hashing:    Takes a key and computes an integer
 *              Hash % capacity to calculate an index number
 *              
 */             

public class hashTable {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>(10);  //jun 30
        
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        //table.remove("777");

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" +key + "\t" + table.get(key));
        }
    }
}
