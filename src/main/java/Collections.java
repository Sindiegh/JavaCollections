/*
 * Name and Surname: Sindiswa Khama
 * Cohort: C20 Java
 * Project description: A Java game that finds the maximum number of
 * unique integers in a sub-array with given size.
 * */
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class Collections {


    public void Collection(int numbers, int size, int... list) {

        int highestUniqueValue = 1;

        Deque<Integer> queue = new LinkedList<>();
        Integer[] subArray;


        // adding elements of the queue to the list
        for (int x = 0; x < numbers; x++) {
            queue.add(list[x]);
        }

        //adding elements of the queue to the list
        Integer[] arrayQueue = new Integer[queue.size()];
        queue.toArray(arrayQueue);

        //the following 3 statements prints out the number of integers, the size and the sample
        System.out.println("The number of integers in the set = " + queue.size());
        System.out.println("Sub-array size = " + size);
        System.out.println("Queue = " + Arrays.toString(arrayQueue) + "\n");

        int start = 0;
        int done = size;

            //copying the integers in the queue into the subArray
        for (int i = 0; i < numbers; i++) {
            subArray = Arrays.copyOfRange(arrayQueue, start, done);
            if (arrayQueue[i].equals(arrayQueue[numbers - done + 2])) {
                continue;
            }
            int uniqueNum = uniqueNumbers(subArray);

            System.out.println(Arrays.toString(subArray) + " has " + uniqueNum + " unique numbers.");
            if (highestUniqueValue <= uniqueNum) {
                highestUniqueValue = uniqueNum;
                start++;
                done++;
            }
        }
        System.out.println("Highest number of a unique values in SubArray: " + highestUniqueValue);

    }

    //this function is used to find the number of unique integers and returns it.
    public int uniqueNumbers(Integer[] uniqueArray) {
        int totalUnique;
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(uniqueArray));
        totalUnique = hashSet.size();
        return totalUnique;
    }//end of
}
