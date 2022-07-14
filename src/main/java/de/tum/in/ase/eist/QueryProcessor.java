package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else { // TODO extend the programm here

            // Beispiel: what is 18 plus 12


            int summand1 = Integer.parseInt(query.substring(8,10));
            int summand2 = Integer.parseInt(query.substring(16,18));

//            String[] stringArray = query.split(" ");
//            int summand1 = Integer.parseInt(stringArray[2]);
//            int summand2 = Integer.parseInt(stringArray[4]);
//
//
//
            int intResult = summand1 + summand2;
            String stringResult = String.valueOf(intResult);
            return stringResult;

//            return "";
        }
    }
}
