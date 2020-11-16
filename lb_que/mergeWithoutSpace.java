package lb_que;

class mergeWithoutSpace
{
    class Solution {
        //util function to swap elements
        public void swap(int a, int b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        public void merge(int arr1[], int arr2[], int n, int m) {
            
           if(arr1[0] > arr2[0])
           {
               swap(arr1[0],arr2[0]);
           }
           for(int i = 1;i<n;i++)
           {
               int min2 = Math.min(arr2);
               int index2 = Arrays.binarySearch(arr2, min2);
               if(arr1[i] > min2)
               {
                   swap(arr1[i],arr2[index]);
               }
               
           }
           Arrays.sort(arr2);
           
        }
    }
    public static void main(String[] args) {
        
    }
}