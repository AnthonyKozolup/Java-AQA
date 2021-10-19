package Lesson6;

public class Converter {
    static int testException(String[][] arr) throws MyArraySizeException,
            MyArrayDataException{
        int count=0;
        if (arr.length !=4) throw new MyArraySizeException("Wrong rows");

        for (int i=0;i<arr.length;i++){
            if (arr[i].length!=4) throw new MyArraySizeException("Wrong columns");

            for (int j=0; j<arr[i].length; j++){
                try {
                    count=count+Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException (i,j);
                }
            }
        }
        return count;
    }
}
