package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class textfilehandler {
     public static void main(String[] args) throws IOException 
     {
	    File textfile= new File("C:\\eclipse project\\project1\\resources\\textfiles\\samplefile.txt");
	  
	    if(!textfile.exists())
	    textfile.createNewFile();
	  
	    String text = "this is java selinum ";

	    Scanner scan= new Scanner(textfile);
	    
	   /* String exittext ="";
	    while(scan.hasNext())
	    	exittext =exittext+scan.nextLine()+"\n";
	  
	    FileWriter fw = new FileWriter(textfile);
	    fw.write(exittext+text);
	    fw.close();*/
//	   
//	    
	    
	   

//	  
	  
	  
   //   System.out.println(scan.nextLine());         // if their is no lines in file,through error as
	                                                 // no such element exception.
	     
	 	
	 	/*if(scan.hasNext())
	    	System.out.println(scan.nextLine());
	      else
    	  System.out.println("no lines");*/
	 	 
//	 	 
	 	/* while(scan.hasNext())
	 		 System.out.println(scan.nextLine());*/
//	 	 
//
	 	 String text2="";
	     while(scan.hasNext())
	 	 text2=text2+scan.nextLine()+"\n";    // +"\n"+
	 	 System.out.println(text2);
	     scan.close();
	 	
}
}
