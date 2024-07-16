public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

        long firstIntNumber = (long) (firstNumber * 1000);
        long secondIntNumber = (long) (secondNumber * 1000);

        return firstIntNumber == secondIntNumber;
    }
}
