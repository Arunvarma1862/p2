package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class propertyfilehandler {
	
  public static void main(String[] args) throws Exception  {
	  
//	File propfile= new File("C:\\eclipse project\\project1\\resources\\propertyfiles\\config.properties");
	File  propfile = new File("./resources/propertyfiles/config.properties");
	
//	if(!propfile.exists())                                      // io exception
//	propfile.createNewFile();                                   // io exception
	
	System.out.println(propfile.exists());
	System.out.println(propfile.getName());
	System.out.println(propfile.getAbsolutePath());
	System.out.println(propfile.isFile());
	System.out.println(propfile.isDirectory());
	
//    System.out.println(propfile.listFiles().length);  //("C:\\eclipse project\\project1");
	
	
	
 // FileInputStream fr= new FileInputStream(propfile);
	             // or
	FileReader fr =new FileReader(propfile);     
	Properties property= new Properties();
	property.load(fr);
	
	
	System.out.println(property.size());
	System.out.println(property.keySet());
	System.out.println(property.entrySet());
	System.out.println(property.entrySet().size());
	System.out.println(property.keySet().size());
	System.out.println(property.keys());
	
	System.out.println(property.get("broswerName"));
	System.out.println(property.getProperty("applicationurl"));
	System.out.println(property.getProperty("waitTime","100000"));
	System.out.println(property.getProperty("wait"));
	
        Set<Object> keys=property.keySet();
        for(Object key:keys)
        	System.out.println(key+ " >>>>>>"+ property.get(key));
	
        property.setProperty("hey", "india");
	    FileWriter fw = new FileWriter(propfile);
//	              // or
  //    FileOutputStream fw = new FileOutputStream(propfile);
	    property.store(fw," i create");
//	    property.save(fw," i create");  it is debricated
//	

	   System.out.println(property.get("hey"));
	
	
	   fr.close();
	   fw.close();
//	
	
	// fileinputstream fr= new fileinputstream(propfile);  // filereader
	// fileputputstream fw= new fileoutputstream(propfile);  // filewriter
	
	
	
}
}
