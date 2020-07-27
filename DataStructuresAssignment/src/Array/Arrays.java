package Array;

class Arrays {
	
	static int arr[] = {10, 20,50,40,30}; 
    static int findlargest(){ 
		
	    int i; 
	    int max = arr[0];   
	    for (i = 1; i < arr.length; i++) 
	        if (arr[i] > max) 
	            max = arr[i]; 
	    return max; 
 }
public static class Largest extends Arrays {
	
	public static void main(String[] args)  
    { 
        System.out.println("Largest in given array is " + findlargest()); 
       } 
} 
} 
