import java.io.*;
import java.util.Scanner;

public class Creator {
	public static void main(String[] args) throws IOException{
		
		File closet = new File("closet.txt");
		Scanner input = new Scanner(closet);
		int articleOfClothes = input.nextInt();
		
		Clothes[] allClothes = new Clothes[articleOfClothes];
		
		int numOfLines = articleOfClothes * 6;
		String[] fileLines = new String[numOfLines];
		
		for(int i = 0; i < numOfLines; i++){
			fileLines[i] = input.nextLine();
		}
		
		for(int i = 0; i < articleOfClothes; i++){
			allClothes[i].setColor(fileLines[0 + 6*i]);
			allClothes[i].setType(fileLines[1 + 6*i]);
			allClothes[i].setMaterial(fileLines[2 + 6*i]);
			allClothes[i].setLastWorn(fileLines[3 + 6*i]);
			allClothes[i].setSweatLevel(fileLines[4 + 6*i]);
			allClothes[i].setTimesWorn(fileLines[5 + 6*i]);
		}
		
		int[] washListInt = new int[articleOfClothes];
		int washes = 0;
		
		for(int i = 0; i < allClothes.length; i++){
			if(allClothes[i].isWash()){
				washListInt[washes] = i;
				washes++;
			}
		}
		
		
		
		File outFile = new File("Hamper.txt");
		PrintWriter output = new PrintWriter(outFile);
		output.println("You have these " + washes + " articles of clothing in your hamper");
		
		for(int i= 0; i < washes; i++){
			output.println(washListInt[i]);
			output.println(allClothes[i].toString());
		}
	}
}
