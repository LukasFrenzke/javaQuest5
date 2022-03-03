package Quest5;
import java.lang.Math;

public class Numeric {
    Integer number;

    public Numeric(Integer number) {
        this.number = number;
    }

    public String isOdd() {
        String output = "The number: " + this.number + " is odd.";
        if (this.number % 2 != 0){
            return output;
        }
        else{
            return output = "The number: " + this.number + " is even." ;
        }
        
    }

    public String isEven() {
        String output = "The number: " + this.number + " is even.";
        if (this.number % 2 == 0){
            return output;
        }
        else{
            return output = "The number: " + this.number + " is odd." ;
        }
        
    }

    public String squareOfInt() {
        String output = "The square of: " + this.number + " is " + (this.number * this.number);
            return output;
        
    }
    public String squareRootOfInt() {
        String output = "The square root of: " + this.number + " is " + Math.sqrt(this.number);
            return output;
        
    }

    public String cubeOfInt() {
        String output = "The cube of: " + this.number + " is " + (this.number * this.number * this.number);
            return output;
        
    }

    public String cubeRootOfInt() {
        String output = "The cube root of: " + this.number + " is " + Math.cbrt(this.number);
            return output;
        
    }

}
