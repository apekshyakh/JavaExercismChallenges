//Write a function that returns the earned points in a single toss of a Darts game
// In our particular instance of the game, the target rewards with 4 different
// amounts of points, depending on where the dart lands:
//
//       -> If the dart lands outside the target, player earns no points (0 points).
//       -> If the dart lands in the outer circle of the target, player earns 1 point.
//       -> If the dart lands in the middle circle of the target, player earns 5 points.
//       -> If the dart lands in the inner circle of the target, player earns 10 points.
//        The outer circle has a radius of 10 units (This is equivalent to the total
//        radius for the entire target), the middle circle a radius of 5 units,
//        and the inner circle a radius of 1. Of course, they are all centered to
//        the same point (That is, the circles are concentric) defined by the coordinates (0, 0).
//
//        Write a function that given a point in the target
//        (defined by its real cartesian coordinates x and y),
//        returns the correct amount earned by a dart landing in that point.

class Darts {
    double radius;
    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public int points() {

        //The target is the dart board
        //r = Square root of (x^2 + y^2)
        radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        //outisde target
        if (radius > 10) {
            return 0;
        } else if (radius > 5 && radius < 10) {
            //outer circle
            return 1;
        } else if (radius > 1 && radius < 5) {
            //middle circle
            return 5;
        } else {
            //inner circle
            return 10;
        }

    }

    public static void main(String[] args) {
        Darts play = new Darts(-0.5, -0.5);
        System.out.println(play.points());

    }
}