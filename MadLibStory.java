import java.util.Scanner;

public class MadLibStory {

public static void main(String[] args) {

//gets main character name
Scanner characterNameInput = new Scanner(System.in);
System.out.println("Enter the name of the story's main character.");
String characterName = characterNameInput.nextLine();

//gets adjective
Scanner adjectiveInput = new Scanner(System.in);
System.out.println("Type an adjective.");
String adjective1 = adjectiveInput.nextLine();

//gets noun1
Scanner noun1Input = new Scanner(System.in);
System.out.println("Type a noun.");
String noun1 = noun1Input.nextLine();

//gets noun2
Scanner noun2Input = new Scanner(System.in);
System.out.println("Type another noun.");
String noun2 = noun2Input.nextLine();

//gets place
Scanner placeInput = new Scanner(System.in);
System.out.println("Type a place.");
String place = placeInput.nextLine();

//defines the story
String story = ""+characterName+" is a "+adjective1+" "+noun1+". Every Tuesday "+characterName+" goes to "+place+" for "+noun2+".";

//prints the story
System.out.println(story);

}



}
