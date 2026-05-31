public class TaskThree{
    public static int[] collectZero (int[] numbers){

        int[] result = new int[numbers.length];
        int resultIndex = 0;
        for (int index = 0; index < numbers.length; index++){
            if (numbers[index] != 0){
                result[resultIndex] = numbers[index];
                resultIndex++;
            }
        }
        for (int count = resultIndex; count < numbers.length; count++){
            result[count] = 0;
        }

        return result;
    }
}
