package Example3_File_Create;

import java.io.File;

public class File_Create 
{

	public static void main(String[] args) 
	
	{  
		
		
		File file1 = new File (" student.txt "); // This keyword creates the file student.txt in  The workspace Of JAVA in Folder E
		File file2 = new File (" teacher.txt "); // This keyword creates the file teacher.txt in  The workspace Of JAVA in Folder E
		
		try
		{
			file1.createNewFile();
			file2.createNewFile();
			System.out.println(" Files are created ");
			
		}
		catch(Exception e)
		{
			System.out.println(" Files are not  Ereated because of the Eception " + e);
			
		}
		
	   
		        //******************* if we want to create files in Desktop or any other Drive then ?  ****************** //
		
				File dir = new File (" Fahim ");
				dir.mkdir();  //This keyword creates the folder Fahim in the java Workspace drive which is drive E 
				
				File file3 = new File (" Fahim/man.txt "); //This keyword creates the file man.txt in folder Fahim in the java Workspace drive which is drive E 
				File file4 = new File (" Fahim/woman.txt "); //This keyword creates the file woman.txt in folder Fahim in the java Workspace drive which is drive E 
				
				try
				{
					file3.createNewFile();
					file4.createNewFile();
					
					System.out.println(" Files are created ");
					
				}
				catch(Exception f)
				{
					System.out.println(" Files are not  Created because of the Eception " + f);
					
				}
		
		

	}

}
