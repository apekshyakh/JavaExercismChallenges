//1+2+3 = 6
/*
Perfect: aliquot sum = number
6 is a perfect number because (1 + 2 + 3) = 6
28 is a perfect number because (1 + 2 + 4 + 7 + 14) = 28

Abundant: aliquot sum > number
12 is an abundant number because (1 + 2 + 3 + 4 + 6) = 16
24 is an abundant number because (1 + 2 + 3 + 4 + 6 + 8 + 12) = 36

Deficient: aliquot sum < number
8 is a deficient number because (1 + 2 + 4) = 7
Prime numbers are deficient

 */
class PerfectNumber {
int sum=0;

    String perfectNumber(int n){
        if (n < 1) throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        for(int i = n/2; i>0; i--){
            if(n%i == 0){
                sum+=i;
            }
        }
        if(sum == n){
            // c = Classification.PERFECT;
            return "PERFECT";
        }
        else if(sum>n){
            //// c = Classification.ABUNDANT;
           return "ABUNDANT";
        }
        else{
            // c = Classification.DEFICIENT;
           return "DEFICIENT";
        }
    }

    public static void main(String[] args) {
        PerfectNumber num1 = new PerfectNumber();
        System.out.println(num1.perfectNumber(24));

        PerfectNumber num2 = new PerfectNumber();
        System.out.println(num2.perfectNumber(8));

        PerfectNumber num3 = new PerfectNumber();
        System.out.println(num3.perfectNumber(-28));

    }

}