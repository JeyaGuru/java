import java.util.*;

class GFG {
    
    public static int[] SortInAsc(int[] arr)
    {
        	for(int i=0;i<arr.length-1;i++){
		for(int j=i+1;j<arr.length;j++){		        
		        if(arr[i]>arr[j]) {
		            int t=arr[i];
		            arr[i]=arr[j];
		            arr[j]=t;
		        }
		    }
		}
		return arr;
    }
    
    public static void PrintArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
	 System.out.println(arr[i]);
	}
    }   
	public static void main (String[] args) {
		int[] array=new int[]{2,1,3,0};
	        array=SortInAsc(array);
		PrintArray(array);
	}
}
