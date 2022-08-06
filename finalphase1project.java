package Virtualrepositories;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CompanyLockersPvtLtd {
	public static void main(String[]args) throws IOException {
		File folder = new File("C:\\Users\\73981\\Desktop\\main");
	folder.mkdirs();
	    int ch =0, Var=0;
	    Scanner Sc = new Scanner(System.in);
	    
	    System.out.println(" ----*----*----*----*\n");
	    System.out.println(" Welcome to Lockers workspace## LOCK IT!!");
	    System.out.println(" By, Company Lockers Pvt ");
	    System.out.println(" ----*----*----*----*\n");
	    System.out.println("Developer : Shreya \n");
	    
	    while(true)
	    {
	    	System.out.println("Select one of the options listed");
	    	System.out.println("1. Current file names in Ascending Order ");
	    	System.out.println("2. Buissness Tasks");
	    	System.out.println("3. Close the Application");
	    	
	    	try{
	    		
	    		 ch = Sc.nextInt();
	    		
	    	
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("Empty");
	    	}
	    	
	    	
	    	    switch(ch)
	    	    {
	    	    case 1:
	    	    	File arr[] = folder.listFiles();
	    	    	Arrays.sort(arr);
	    	    	
	    	    	for(int i=0;i<arr.length;i++)
	    	    		System.out.println("arr[i]");
	    	    	break;
	    	    	
	    	    	
	    	    	
	    	    case 2:
	    	    	Boolean temp = true;
	    	    	while(temp) {
	    	    		System.out.println("please select anyone option which u want to perform.");
	    	    		System.out.println("1 : To add a file to the existing directory. ");
	    	    		System.out.println("2 : To delete a file from the existing directory. ");
	    	    		System.out.println("3 : To searvh a user file from the directory. ");
	    	    		System.out.println("4 : Back to the previous menu");
	    	    		System.out.println("5 : Terminate the program");
	    	    		
	    	    		int Var2 = Sc.nextInt();
	    	    		
	    	    		switch(Var2) {
	    	    			case 1 :
	    	    				File f = new File("C:\\Users\\73981\\Desktop\\main");
	    	    				System.out.println("Enter a file name");
	    	    				String name = Sc.next();
	    	    				if(new File(folder,name).exists()) {
	    	    					System.out.println("file already exist");
	    	    				}else {
	    	    					File folder1 = new File(folder, name);
	    	    					folder1.mkdir();
	    	    					if(new File(folder, name).exists()) {
	    	    						System.out.println("File has been added successfully");
	    	    					}
	    	    					
	    	    				}
	    	    				
	    	    				break;
	    	    		
	    	    	         case 2 :
	    	    		    	System.out.println("Enter a file name");
	    	    		    	String name1 = Sc.next();
	    	    		    	boolean folder2 = new File(folder, name1).exists();
	    	    		    	System.out.println(folder2);
	    	    		    	if(folder2 == true ) {
	    	    		    		File folder3 = new File(folder, name1);
	    	    		    		folder3.delete();
	    	    		    		System.out.println("File deleted");
	    	    		    	} else {
	    	    		    		System.out.println("File does not exixts");
	    	    		    	}
	    	    		    	
	    	    		    	break;
	    	    		    	
	    	    	         case 3 :
	    	    	        	 System.out.println("Enter a keyword for search");
	    	    	        	 String search = Sc.next();
	    	    	        	 
	    	    	        	 File arr1[] = folder.listFiles();
	    	    	        	 for(int a=0;a<arr1.length;a++) {
	    	    	        		 if(arr1[a].getName().startsWith(search)) {
	    	    	        			 System.out.println(arr1[a]);
	    	    	        		 }else {
	    	    	        			 System.out.println("No file found");
	    	    	        		 }
	    	    	        	 }
	    	    	        	 break;
	    	    	        	 
	    	    	         case 4 :
	    	    	        	 
	    	    	        	 temp = false;
	    	    	        	 break;
	    	    	        	 
	    	    	         case 5 :
	    	    	        	 System.out.println("Program Terminated Successfully");
	    	    	        	 System.exit(0);
	    	    	        	 
	    	    	         default :
	    	    	        	 System.out.println("Retry");
	    	    	        	 break;
	    	    		}
	    	    	}
	    	    }
	    }
	}
	    	    	
	    	    
}
	
	    	    	        		 
	    	    	        
	    	    	        		 
	    	    	        	 
	    	    		    	
	    	    		    	
	    	    		    
	    	    		 
	    	    		    	
	    	    		    	
	    	    			
	    	    		
	    	    
	    	    	
	    	    
	    	   
	    
	

