import java.io.*;
import java.util.*;

class payMoney{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of transaction array");
		int n = Integer.parseInt(br.readLine().trim());
		int arr[] = new int[n];
		
		System.out.println("Enter the values of array");
		String s[] = br.readLine().split(" ");
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(s[i]);
		}
		
		System.out.println("Enter the total no of targets that needs to be acheived \n");
		int q = Integer.parseInt(br.readLine().trim());
		
		while(q-->0){
			System.out.println("Enter the value of target");
			int target = Integer.parseInt(br.readLine().trim());
			int count=0,sum=0;
			boolean flag = false;
			for(int i=0;i<n;i++){
				sum += arr[i];
				count++;
				if(sum>=target){
					flag = true;
					break;
				}
			}
			
			if(flag){
				System.out.println("Target acheived after "+count+" transactions \n");
			}
			else{
				System.out.println("Given target is not acheived");
			}
			
		}
	}
}