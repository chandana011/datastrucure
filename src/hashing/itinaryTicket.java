package hashing;

import java.util.*;

public class itinaryTicket {

    public static String getstart(HashMap<String,String> tick){
        HashMap<String,String > revmap= new HashMap<>();

        for(String key:tick.keySet()){
            //key-->key   val-->tick.get(key)
            revmap.put(tick.get(key),key);
        }

        for(String key:tick.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start=getstart(tickets);
        while(tickets.containsKey(start)){
            System.out.print(start+"-->");
            start=tickets.get(start);
        }
        System.out.println(start);

    }
}
