
// Build a boolean function with a single parameter (s String) that returns a boolean
// true if open braces "(","[", "{" and close braces ")", "]", "}" are balanced.
//
// Test cases:
//	"((( hello )))" - true
//	"(( hello ])" - false
//	")" - false
//	"(" - false
//	"(a+b)*c+(b)" - true
//  "([ )]" - false
//


import javax.xml.stream.events.Characters;
import java.util.Map;
import java.util.Stack;
import static java.util.Map.entry;

class MatchingBracket{

    private static Map<Character, Character> matchingBracket;

    static {
        matchingBracket = Map.ofEntries(
                entry(']', '['),
                entry('}', '{'),
                entry(')', '(')
        );
    }

    public boolean matchCheck(String s) {

        Stack<Character> stk = new Stack<Character>(); //creating empty stack

        for (char c : s.toCharArray()) { //c (pointer) iterating over all the characters of s and putting in a char array
            //matchingBracket.values = ["[","{","("]
            if (matchingBracket.values().contains(c)) {//if the string has open brackets
                stk.push(c);
            }
            else if (matchingBracket.containsKey(c)){  // closing brackets
                //if top of stack is not value of key, return false
                if(matchingBracket.get(c) != stk.pop()) {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        MatchingBracket m = new MatchingBracket();
        System.out.println(m.matchCheck("(((((Hello)))))"));

    }

}