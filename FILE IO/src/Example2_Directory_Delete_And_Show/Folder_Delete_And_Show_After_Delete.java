package Example2_Directory_Delete_And_Show;

import java.io.File;

public class Folder_Delete_And_Show_After_Delete 
{

	public static void main(String[] args) 
	{

		// ********* If we want to delete a folder and show whether the folder exixts or not after delete   *********** //
		
		File one = new File (" Corona ");
		
		one.mkdir(); // This keyword creates the folder Corona in  The workspace Of JAVA in Folder E
		String show = one.getAbsolutePath(); // keyword for the path of the folder 
		System.out.println(" Name of the folder : " +one.getName() );  // Showes the name of the folder
		System.out.println(" Path of the folder " + one.getName() + " is: "  + show); // showes the folder where it is created with folder name
		//one.delete(); // this will delete the folder from F drive
		
		if (one.delete()) //if-else use kore delete kora holo. We could use one.delete() to delete the folder corona
		{
			System.out.println(" Folder " + one.getName()+ "Has been deleted ");
			
		}
		else
		{
			System.out.println(" Folder " + one.getName()+ "Has  NOT been deleted ");
		}
		
		System.out.println();
		
		////// ****************** ANOTHER **************** /////
		
		
		File two = new File ("C:/Users/Asus/Desktop/COVID-19 ");
		
		two.mkdir();
		String show1 = two.getAbsolutePath(); // keyword for the path of the folder 
		System.out.println(" Name of the folder : " +two.getName() );  // Showes the name of the folder
		System.out.println(" Path of the folder " + two.getName() + " is: "  + show1); // showes the folder where it is created
		//two.delete(); // this will delete the folder from C drive
		
		if (two.delete()) //if-else use kore delete kora holo. We could use two.delete() to delete the folder corona
		{
			System.out.println(" Folder " + two.getName()+ "Has been deleted ");
			
		}
		
		else
		{
			System.out.println(" Folder " + two.getName()+ "Has  NOT been deleted ");
		}
		
		if(two.exists())
		{

			System.out.println(two.getName()+ " Folder Exists ");
			
		}
		else
		{
			System.out.println(two.getName()+ " Folder Does not Exists ");
			
		}
				
	
		
		

	}

}
