import java.util.Scanner;
class Array {
	
    public void reverseArray() { 
	Scanner scan = new Scanner(System.in);
	System.out.println("Eneter number of Array");
	int num = scan.nextInt();
	
	int a[] = new int[num];
	
	System.out.println("Enter Array Elements:");
	for(int i=0;i<num; i++) {
		a[i] = scan.nextInt();
}

       System.out.println("Reversed Array Elements:");
        for(int i = a.length-1; i>=0; i--) {
	System.out.print(a[i]+ " ");
}
scan.close();
}
}
   public class ReverseArrElements extends Array {
    public static void main(String[] args) {
    	
    	Array a = new Array();
    	a.reverseArray();
    }
    }
    	