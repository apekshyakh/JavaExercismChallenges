//Determine if a number is an Armstrong number

class ArmstrongNumber {
    double calc = 0;

   void checkArmstrongCalculation(String x){
       //x = 153
       System.out.println(x);
       char[] y= {1,5,3};

    //TODO: why isnt it converting to char array?
     char[] separatedNum = x.toCharArray();
       System.out.println("same or not"+ (y==separatedNum));
       System.out.println(separatedNum);


     for(int i=0; i<separatedNum.length; i++){
         calc += Math.pow(separatedNum[i],separatedNum.length);
         System.out.println(calc);
     }

//     if(calc == x){
//         return true;
//     }
//     return false;

    }

    public static void main(String[] args) {
        ArmstrongNumber num = new ArmstrongNumber();
        num.checkArmstrongCalculation("153");
    }

}