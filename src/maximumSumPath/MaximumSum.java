package maximumSumPath;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 06-03-2021
 * Time: 22:02
 */

public class MaximumSum {


    public static int maximumPathSum(int [] arr1, int [] arr2) {
        int size1, size2, index_arr1 = 0, index_arr2 = 0, final_sum = 0, sum1 = 0, sum2 = 0;

        size1  = arr1.length;
        size2 = arr2.length;


        while (index_arr1 < size1 && index_arr2 < size2){
            if (arr1[index_arr1] < arr2[index_arr2]) {
                sum1 += arr1[index_arr1++];
            }

            else if (arr1[index_arr1] > arr2[index_arr2]) {
                sum2 += arr2[index_arr2++];
            }

            else {      // if elements of both array at this index are same.

                // Adding bigger sum to final_sum
                if(sum1 >= sum2) {
                    final_sum += sum1;
                }
                else {
                    final_sum += sum2;
                }

                // reinitializing sum variables of both the arrays after reaching common element.
                sum1 = 0;
                sum2 = 0;

                // updating final_sum value whenever getting same element.
                int temp = index_arr1;
                while (index_arr1 < size1 && arr1[index_arr1] == arr2[index_arr2]) {
                    sum1 += arr1[index_arr1++];
                }

                while (index_arr2 < size2 && arr1[temp] == arr2[index_arr2]) {
                    sum2 += arr2[index_arr2++];
                }

                if(sum1 >= sum2) {
                    final_sum += sum1;
                }
                else {
                    final_sum += sum2;
                }

                sum1 = 0;
                sum2 = 0;
            }
        }

        // adding remaining elements of both arrays in their sum variable for further comparison.
        while (index_arr1 < size1) {
            sum1 += arr1[index_arr1++];
        }
        while (index_arr2 < size2) {
            sum2 += arr2[index_arr2++];
        }


        if(sum1 >= sum2) {
            final_sum += sum1;
        }
        else {
            final_sum += sum2;
        }

        return final_sum;
    }
}
