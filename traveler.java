import java.io.*;
import java.util.*;

class traveler{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of currency denominations");
		int n = Integer.parseInt(br.readLine().trim());
		List<Integer> l = new ArrayList<>();
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<n;i++){
			l.add(Integer.parseInt(br.readLine().trim()));
		}
		Collections.sort(l,Collections.reverseOrder());
		
		System.out.println("\nEnter the amount you want to pay");
		int amount = Integer.parseInt(br.readLine().trim());
		List<Integer> notes = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			if(amount>0){
				notes.add(amount/l.get(i));
				amount %= l.get(i);
			}
		}
		System.out.println("\nYour payement approach in order to give min no of notes will be");
		for(int i=0;i<notes.size();i++){
			if(notes.get(i)!=0){
				System.out.println(l.get(i)+":"+notes.get(i));
			}
		}
	}
}
