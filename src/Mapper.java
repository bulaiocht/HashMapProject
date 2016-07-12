import java.util.Hashtable;

/**
 *
 * Created by Kocherha Vitalii on 12.07.2016.
 */
public class Mapper {
    public static void main(String[] args) {
        String name = "Natasha";
        int nameHash = hash(name);
        int bucketSize = 15;
        int index = nameHash&bucketSize;

        print("Hashcode value", nameHash);
        print("Bucket size", bucketSize);
        print("Index value",index);

    }

    static void print (String name, int value) {
        System.out.println(name + ": " + Integer.toBinaryString(value) + " Decimal:" + value);
    }

    static int hash(Object object) {
        return object.hashCode();
    }
}
