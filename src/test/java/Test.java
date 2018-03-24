import Utils.Math;
import Utils.Math.*;

public class Test {

    public static void main(String[] args){
        /**
         * Test Utils.Math
         */
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(Math.multiple(i, j) + " ");
            }
            System.out.println();
        }
    }
}
