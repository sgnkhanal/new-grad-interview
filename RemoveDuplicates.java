import java.util.HashSet;

public class RemoveDuplicates {

    //Note this uses HashSet.
    public static void main (String[] args) {
        String[] names = {"Sam", "Ram", "Ram", "Jason"};

        //use hash set which does not allow for duplicates.
        HashSet<String> myhash = new HashSet<>();
        for(String name: names) {
            myhash.add(name);
        }

        for (String n1: myhash) {
            System.out.println(n1);
        }

    }
}
