package Lesson6;

import static Lesson6.Converter.testException;

public class Exception {

    public static void main(String[] args){
        String[][] arr= {
            {"1","2","3","4"},
            {"2","2","2","2"},
            {"3","3","3","3"},
            {"2","2","1","1"}
        };
        String[][] arr2 = {
                {"5","5","4","8"},
                {"6","5"},
                {"1","1","1","1"}
        };
        String [][] arr3 = {
                {"1","boom","3","4"},
                {"2","2","2","2"},
                {"3","3","3","3"},
                {"1","1","1","5"}
        };
        try {
            System.out.println("The sum is: " + Converter.testException(arr3) );
        } catch (MyArraySizeException e){
                System.out.println("Array size is wrong");
            }

        catch (MyArrayDataException e){
            System.out.println("Wrong array data. " + e.getMessage());
    }
}


}
