public class ArrayOps {
    public static void main(String[] args) {

    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int totalsum = 0; //the the total sum of all the added numbers
        int moa = 0; // the number of array members
        for (int i = 0;i < array.length ;i++ ) {
            totalsum += i;
            moa += array[i];
        }
        totalsum += array.length;           
        return totalsum - moa;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max, seclar; // maximum number and second largest number
        if (array[0] >= array[1]){
            max = array[0];
            seclar = array[1];
        }
        else{
            max = array[1];
            seclar = array[2];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] > max) {
                seclar = max;
                max = array[i];
            }
            else if (array[i] > seclar ) {
                seclar = array[i];
            }   
        }
        return seclar;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean SpecificElementContained;
        boolean SameElementsContained = true;
        
        for (int i = 0; i < array1.length; i++)
        {
            SpecificElementContained = false;
            for (int j = 0; j < array2.length; j++)
            {
                if (array1[i] == array2[j])
                {
                    SpecificElementContained = true;
                }
            }
            
            if (!SpecificElementContained)
            {
                SameElementsContained = false;
            }
        }
        
        return SameElementsContained;
    }

    public static boolean isSorted(int [] array) {
        boolean IsIncreasing = false;
        boolean IsDecreasing = false;
        
        
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] >= array[i - 1])
            {
                IsIncreasing = true;
            }
            if (array[i] <= array[i - 1])
            {
                IsDecreasing = true;
            }
        }
        
        if (IsIncreasing && IsDecreasing)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
