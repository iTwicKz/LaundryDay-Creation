import java.io.*;
import java.util.Scanner;

public class Creator {
	public static void main(String[] args) throws IOException{
		
		File closet = new File("closet.txt");
		Scanner input = new Scanner(closet);
		int articleOfClothes = input.nextInt();
		
		Clothes[] allClothes = new Clothes[articleOfClothes];
		
		int numOfLines = articleOfClothes * 5;
		String[] fileLines = new String[numOfLines];
		
		for(int i = 0; i < numOfLines; i++){
			fileLines[i] = input.nextLine();
		}
		
		for(int i = 0; i < articleOfClothes; i++){
			allClothes[i].color = fileLines[0 + 5*i];
			allClothes[i].type = fileLines[1 + 5*i];
			allClothes[i].material = fileLines[2 + 5*i];
			
		}
	}
}
