package Collections;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();


        //Add key value pairs
        map1.put ("Amna ", 10);
        map1.put("Aqdas", 100);
        map1.put("Bisma", 70);

        System.out.println(" Aqdas's grade is: "+map1.get("Aqdas"));



    }

}
