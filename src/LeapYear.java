public class LeapYear {

    boolean checkLeapYear(int year){

        if((year%4==0 && (year%100 != 0)||(year%400 == 0)) ){
            return true;
        }
        return false;


    }

    public static void main(String[] args) {
       LeapYear yr = new LeapYear();
        System.out.println(yr.checkLeapYear(2000));

    }

}