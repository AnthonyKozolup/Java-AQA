package Lesson6;

public class MyArrayDataException extends java.lang.Exception {
    MyArrayDataException (int row, int col){
        super(String.format("Wrong data in: [%d,%d]\n", row, col));
    }

}
