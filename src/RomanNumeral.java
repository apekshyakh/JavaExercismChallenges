//I, V, X, L, C, D, M.

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class RomanNumeral {
    String number;

    //Treemap is ordered
    private static final TreeMap<Integer, String> romanNum = new TreeMap<>(
       Map.ofEntries(
               Map.entry(1,"I"),
               Map.entry(4,"IV"),
               Map.entry(5,"V"),
               Map.entry(9,"IX"),
               Map.entry(10,"X"),
               Map.entry(40,"XL"),
               Map.entry(50,"L"),
               Map.entry(90,"XC"),
               Map.entry(100,"C"),
               Map.entry(400,"CD"),
               Map.entry(500,"D"),
               Map.entry(900,"CM"),
               Map.entry(1000,"M")
       )
    );


    RomanNumeral(int number){
    this.number = numberToRoman(number);
    }

    String getRomanNumeral() {
    return number;
    }

        //e.g: number = 43;
    String numberToRoman(int number){
        //e.g: upperNum = 40
       int upperNum = romanNum.floorKey(number);

       if(number == upperNum) return romanNum.get(number);
       return romanNum.get(upperNum).concat(numberToRoman(number - upperNum));

    }

}
