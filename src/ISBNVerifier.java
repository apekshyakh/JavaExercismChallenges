//The ISBN-10 verification process is used to validate book identification numbers.
// These normally contain dashes and look like: 3-598-21508-8

//Let's take the ISBN-10 3-598-21508-X. We plug it in to the formula, and get:
//
//(3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 * 1) % 11 == 0

class ISBNVerifier {

    boolean isValid(String isbn){
        if(isbn == null){
            return false;
        }

        String is = isbn.replace("-","");
        System.out.println(is);

        if(is.length() != 10){
            return false;
        }

        int total = 0;

        for(int i=0; i<=is.length()-2;i++){
            //3598215088
            if(Character.isDigit(is.charAt(i))){
                total += is.charAt(i)*(10-i);
            }
            else{
                return false;
            }
        }

        if(is.charAt(is.length()-1)=='X'){
            total += 10;
        }
        else if(Character.isDigit(is.charAt(9))){
            total += is.charAt(is.length()-1);
        }
        else{
            return false;
        }

        System.out.println(total);
        if(total%11 ==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ISBNVerifier isbn1 = new ISBNVerifier();
        System.out.println(isbn1.isValid("3-598-21508-8"));
    }


}