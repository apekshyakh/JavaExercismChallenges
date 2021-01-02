//Output the lyrics to 'The Twelve Days of Christmas'.
/*
On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.

On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.

On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.

On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class TwelveDays {
    StringBuilder result = new StringBuilder();
    List<String> allGifts = new ArrayList<String>();

    private static final Map<Integer,String[]> song = Map.ofEntries(
            Map.entry(1, new String[]{"first", "a Partridge in a Pear Tree."}),
            Map.entry(2, new String[]{"second", "two Turtle Doves, and a Partridge in a Pear Tree."}),
            Map.entry(3, new String[]{"third","three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."}),
            Map.entry(4, new String[]{"fourth","four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."}),
            Map.entry(5, new String[]{"fifth","five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."}),
            Map.entry(6, new String[]{"sixth","six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."}),
            Map.entry(7, new String[]{"seventh","seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."}),
            Map.entry(8, new String[]{"eighth","eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."}),
            Map.entry(9, new String[]{"ninth","nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."}),
            Map.entry(10,new String[]{"tenth","ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."}),
            Map.entry(11,new String[]{"eleventh","eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."}),
            Map.entry(12,new String[]{"twelfth","twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."})
    );

    String verse(int verseNumber){


        result = new StringBuilder("On the " + song.get(verseNumber)[0] + " day of Christmas my true love gave to me: " + song.get(verseNumber)[1] + "\n");
        return result.toString();
    }

    public String verses(int startVerse, int endVerse) {
        result = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            if(i != startVerse) result.append("\n");

            result.append("On the " + song.get(i)[0] + " day of Christmas my true love gave to me: " + song.get(i)[1] + "\n");
        }
        return result.toString();
    }

    public String sing(){
        result = new StringBuilder();
        for (int i = 1; i <= song.size(); i++) {
            if(i != 1) result.append("\n");

            result.append("On the " + song.get(i)[0] + " day of Christmas my true love gave to me: " + song.get(i)[1] + "\n");
        }

        return result.toString();
    }
//    public static void main(String[] args) {
//            TwelveDays t = new TwelveDays();
//            t.verse(1);
//
//        }


    }