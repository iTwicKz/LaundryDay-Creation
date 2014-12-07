import java.io.*;
import java.util.Scanner;

public class Creator {
	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(new File("src/closet.txt"));
		int articleOfClothes = 5;
		
		Clothes[] allClothes = new Clothes[articleOfClothes];
		
		int numOfLines = articleOfClothes * 6;
		String[] fileLines = new String[numOfLines];
		
		for(int i = 0; i < numOfLines; i++){
			fileLines[i] = input.nextLine();
		}
	
		for(int i = 0; i < articleOfClothes; i++){
			allClothes[i] = new Clothes();
		}
		
		for(int i = 0; i < articleOfClothes; i++){
			allClothes[i].setColor(fileLines[0 + 6*i]);
			allClothes[i].setType(fileLines[1 + 6*i]);
			allClothes[i].setMaterial(fileLines[2 + 6*i]);
			allClothes[i].setLastWorn(fileLines[3 + 6*i]);
			allClothes[i].setSweatLevel(fileLines[(4 + 6*i)]);
			allClothes[i].setTimesWorn(fileLines[5 + 6*i]);
		}
		
		int[] washListInt = new int[articleOfClothes];
		int washes = 0;
		
		for(int i = 0; i < allClothes.length; i++){
			if(allClothes[i].setWash()){
				washListInt[washes] = i;
				washes++;
			}
		}
		
		
		
		PrintWriter output = new PrintWriter(new File("Hamper.txt"));
		output.println("You have these " + washes + " articles of clothing in your hamper\n\n");
		
		for(int i= 0; i < washes; i++){
			output.println(allClothes[washListInt[i]].toString());
		}
		output.close();
	}
}
