package Example4_File_Exists_Delete;

import java.io.File;


public class Check_File_Exists_Or_Delete
{

	public static void main(String[] args) 
	
	{
		
		 //   ***************** Creating Files And showing the Existing files ******************  //
		
		
		File dir = new File (" Fahim ");
		dir.mkdir();  //This keyword creates the folder Fahim in the java Workspace drive which is drive E 
		
		File file1 = new File (" Fahim/man.txt "); //This keyword creates the file man.txt in folder Fahim in the java Workspace drive which is drive E 
		File file2 = new File (" Fahim/woman.txt "); //This keyword creates the file woman.txt in folder Fahim in the java Workspace drive which is drive E 
		
		try
		{
			file1.createNewFile();
			file2.createNewFile();
			
			System.out.println("Files Are Successfully Created ");
			
		}
		catch(Exception e)
		{
			System.out.println(" Files are not  Created because of the Eception : " + e);
			
		}
		
		if(file1.exists() && file2.exists())
		{

			System.out.println( file1.getName()+ " File Exists ");
			System.out.println(file2.getName()+ " File Exists ");
			
		}
		else
		{
			System.out.println( file1.getName()+ " File Does not Exists ");
			System.out.println(file2.getName()+ " File  Does notExists ");
		}
		
		System.out.println();
		
		
		
		// ********************* if we want to delete a file and check whether it exists or not after delete ******************** //
		
		
		
		File dir1 = new File (" Corona ");
		dir1.mkdir();  //This keyword creates the folder Corona in the java Workspace drive which is drive E 
		
		File file3 = new File ("Corona/virus.txt "); //This keyword creates the file man.txt in folder Corona in drive E where is the JAVA workspace 
		File file4 = new File ("Corona/bacteria.txt "); //This keyword creates the file woman.txt in folder Corona in drive D where is the JAVA workspace 
		
		try
		{
			file3.createNewFile();
			file4.createNewFile();
			
			System.out.println("Files Are Successfully Created ");
			
		}
		catch(Exception f)
		{
			System.out.println(" Files are not  Created because of the Eception :" + f);
			
		}
		
		if(file3.exists() && file4.exists())
		{

			System.out.println( file3.getName()+ " File Exists ");
			System.out.println(file4.getName()+ " File Exists ");
			
		}
		else
		{
			System.out.println( file3.getName()+ " File Does not Exists ");
			System.out.println(file4.getName()+ " File  Does notExists ");
		}
		
		if(file3.delete())
		{
			System.out.println( file3.getName()+ " Has been deleted" );
			
		}
		else
		{
			
			System.out.println( file3.getName()+ " Has not been deleted" );
			
		}
		
		      // ******************* Now we want to check if the file3 exists or not after delete ************************ //
		
		if(file3.exists())
		{

			System.out.println( file3.getName()+ " File Exists ");
			
		}
		else
		{
			System.out.println( file3.getName()+ " File Does not Exists ");
			
		}
		
		
		

	}

}
