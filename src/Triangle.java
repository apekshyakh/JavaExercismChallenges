class Triangle {
    private double s1;
    private double s2;
    private double s3;

    Triangle(double s1, double s2,double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    boolean isEquilateral(){
        return ((s1==s2)&&(s1==s3));
    }

    boolean isIsosceles(){
        return ((s1==s2) || (s2==s3)||(s1==s3));
    }

    boolean isScalene(){
        return ((!isEquilateral())&& (!isIsosceles()));
    }

    boolean isValidTriangle(){
        return ((s1!=0) &&
                (s2!=0) &&
                (s3!=0) &&
                ((s1+s2)>s3) &&
                ((s2+s3)>s1) &&
                ((s1+s3)>s2));

    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(2,3,2);
        System.out.println("Is t1 an Isosceles triangle? " +t1.isIsosceles());
        System.out.println("Is t1 an Equilateral traingle? " +t1.isEquilateral());

        Triangle t2 = new Triangle(0,9,2);
        System.out.println("Is t2 a valid traingle? " + t2.isValidTriangle());

        Triangle t3 = new Triangle(4,9,2);
        System.out.println("Is t3 a scalene traingle? " + t2.isScalene());

    }
}
