//An isogram (also known as a "nonpattern word") is a word or phrase without a repeating letter,
// however spaces and hyphens are allowed to appear multiple times.
//
//Examples of isograms:
//
//lumberjacks
//background

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsogramChecker {


    public boolean isIsogram(String phrase) {

        Set<Character> store = new HashSet<>();

        String lowerCaseLetters = phrase.toLowerCase();

        String result = lowerCaseLetters.replaceAll(" ","").replaceAll("-","");


        for(int i=0; i<result.length(); i++){

            store.add(result.charAt(i));

        }
            return (result.length() == (store.size()));

    }


}
