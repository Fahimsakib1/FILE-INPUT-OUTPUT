package Example1_Directory_Create;

import java.io.File;

public class Folder_Create_And_Show {

	public static void main(String[] args) 
	
	{
		File first = new File (" Fahim ");
		first.mkdir(); //This keyword creates the folder Fahim in the java Workspace drive which is drive E  
		
		//  ************ if we want to create folder in Desktop or any other Drive then ?  ****************** //
		
		File second = new File ("C:/Users/Asus/Desktop/OOP "); // this line showes the path where will be the folder created
		second.mkdir(); //This keyword creates the folder OOP in  desktop
		
		File third = new File ("F:/Java "); // this line showes the path where will be the folder created
		third.mkdir(); // This keyword creates the folder Java in  Drive F
		
		
		// ********* if we wanna show where is the file created and the name of the folder then the below codes will work  *********** //
		
		File forth = new File ("E:/Corona ");
		forth.mkdir(); // This keyword creates the folder Corona in  Drive E
		String show = forth.getAbsolutePath(); // keyword for the path of the folder 
		System.out.println(" Name of the folder : " +forth.getName() );  // Showes the name of the folder
		System.out.println(" Path of the folder " + forth.getName() + " is: "  + show); // showes the folder where it is created with folder name
		
		System.out.println();
		
		
		File fifth = new File ("C:/Users/Asus/Desktop/COVID-19 ");
		fifth.mkdir();
		String show1 = fifth.getAbsolutePath(); // keyword for the path of the folder 
		System.out.println(" Name of the folder : " +fifth.getName() );  // Showes the name of the folder
		System.out.println(" Path of the folder " + fifth.getName() + " is: "  + show1); // showes the folder where it is created
		
		
		
	}

}
