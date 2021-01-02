//Given a list of inputs, generate the relevant proverb.
// For example, given the list
// ["nail", "shoe", "horse", "rider", "message", "battle", "kingdom"],
// you will output the full text of this proverbial rhyme:
//
//For want of a nail the shoe was lost.
//For want of a shoe the horse was lost.
//For want of a horse the rider was lost.
//For want of a rider the message was lost.
//For want of a message the battle was lost.
//For want of a battle the kingdom was lost.
//And all for the want of a nail.

//Note that the list of inputs may vary;
// your solution should be able to handle lists of arbitrary length and content.
// No line of the output text should be a static, unchanging string;
// all should vary according to the input given.

class Proverb {

    String[] words = {"nail", "shoe", "horse","rider","message","battle","kingdom"};



    String phrase(){
        if(words.length==0){
            return "";
        }
        StringBuilder result = new StringBuilder();

        for(int i=0; i< words.length - 1; i++){
            result.append("For want of a "+ words[i] +" the "+ words[i+1]+ " was lost.\n");
        }
        result.append("And all for the want of a " +words[0]+".");
        return result.toString();
    }

    public static void main(String[] args) {

       Proverb pr = new Proverb();
        System.out.println(pr.phrase());
    }
}