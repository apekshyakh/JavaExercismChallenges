//Convert a resistor band's color to its numeric representation

//Resistors have color coded bands, where each color maps to a number.
// The first 2 bands of a resistor have a simple encoding scheme: each color
// maps to a single number.
//
//These colors are encoded as follows:
//
//Black: 0
//Brown: 1
//Red: 2
//Orange: 3
//Yellow: 4
//Green: 5
//Blue: 6
//Violet: 7
//Grey: 8
//White: 9
//Mnemonics map the colors to the numbers, that, when stored as an
// array, happen to map to their index in the array: Better Be Right Or
// Your Great Big Values Go Wrong.


class ResistorColor {
    private final String[] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

    int resistorColor(String color){
    for(int i=0; i<colors.length; i++){
        if(color.matches(colors[i])){
            return i;
        }

        }
    return -1;
    }

    public static void main(String[] args) {
        ResistorColor clr = new ResistorColor();
        System.out.println(clr.resistorColor("orange"));
    }
}