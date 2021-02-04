
import java.util.*;

class Input {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("yo homie what your status at num 1?");
        int number1 = input.nextInt();
      //  System.out.println(number1);

        
        System.out.println("yo homie what your status at num 2?");
        int number2 = input.nextInt();
      //  System.out.println(number2);
        
        
        int total = number1 + number2;      
        System.out.println("the total is " + total);
        input.close();




        
    }


}
