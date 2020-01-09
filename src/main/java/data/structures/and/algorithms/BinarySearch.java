package data.structures.and.algorithms;

public class BinarySearch {

    //code here
    public static int binarySearch(int [] sortedArray, int lookingFor){
        int beginningIndex = 0;
        int endingIndex = (sortedArray.length - 1);
        int middleIndex = (endingIndex + beginningIndex)/2;
        System.out.println(middleIndex);
        // System.out.println(sortedArray[middleIndex]);

        for (int x = 0; x < sortedArray.length; x++){
            if(middleIndex == 0){ //if array is empty
                return -1;
            }
            if(lookingFor > sortedArray[middleIndex]){ // if 8 is greater than 5
                beginningIndex = middleIndex++;  //beginning index = previous middle plus 1
            }
            else if (lookingFor == sortedArray[middleIndex]){
                System.out.println("Monsieur, voici votre "+ lookingFor+ " !!!!");
                return middleIndex;
            }
            else{
                endingIndex = middleIndex--;
            }
            middleIndex =(endingIndex + beginningIndex)/2;
        }
        return -1;
    }
}
