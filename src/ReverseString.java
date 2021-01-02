class ReverseString {

    String reverse(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) { ReverseString sentence = new ReverseString();

    String result = sentence.reverse("JAVA CHALLENGES!");
    System.out.println(result);

    }

}