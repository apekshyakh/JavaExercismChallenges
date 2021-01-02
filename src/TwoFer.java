
//Alice	One for Alice, one for me.
//Bob	One for Bob, one for me.
//One for you, one for me.
//Zaphod	One for Zaphod, one for me.

class TwoFer {

    String twofer(String name){
        if(name==null){
            return "One for you, one for me.";
        }
        return "One for " + name +", one for me";
    }

    public static void main(String[] args) {
        TwoFer person1 = new TwoFer();
        System.out.println(person1.twofer(""));

        TwoFer person2 = new TwoFer();
        System.out.println(person2.twofer("Apekshya"));
    }
}