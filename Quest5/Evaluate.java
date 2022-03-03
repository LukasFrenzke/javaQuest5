package Quest5;

public class Evaluate {
    public static void eval(){
        Numeric number = new Numeric(5);
        Numeric numberTwo = new Numeric(10);
        
    System.out.println(number.isOdd());
    System.out.println(numberTwo.isOdd());
    System.out.println(number.isEven());
    System.out.println(numberTwo.isEven());
    System.out.println(number.squareOfInt());
    System.out.println(numberTwo.squareOfInt());
    System.out.println(number.cubeRootOfInt());
    System.out.println(numberTwo.cubeRootOfInt());
    }
}
