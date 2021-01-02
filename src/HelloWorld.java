//Write a function that returns the string "Hello, World!".
//Run the test suite and make sure that it succeeds.
//Submit your solution and check it at the website.

class HelloWorld {
    String greeting(){
        return "Hello, World!";
    }

    public static void main(String[] args) {
        HelloWorld test = new HelloWorld();
        System.out.println(test.greeting());

    }
}