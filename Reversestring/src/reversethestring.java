import java.util.Scanner;

public class reversethestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner reverse =  new Scanner(System.in);
                String reverse1 = reverse.nextLine();
                if (reverse1 == null || reverse1.isEmpty()) {
                	System.out.println("string is empty");
                	
                }
                String reverse2 = "";
                for (int i = 0; i < reverse1.length(); i++) {
                	
                    reverse2 = reverse2 + reverse1.charAt((reverse1.length()-1)-i);         	
					
				}
                System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);

                Read more: https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz5MxXllPld
                System.out.println(reverse2);
                
	}

}
