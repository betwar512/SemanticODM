/**
 * 
 */
package semanticModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;


import org.apache.commons.io.IOUtils;

import au.com.bytecode.opencsv.CSVReader;

/**
 * @author Abbas H Safaie
 *
 */
public class CsvHelper {

		//CSV resource file lcdcMAp
		private static final String fileName="CsvMap.csv";
			private File file;
		
		
		public CsvHelper(){
			
				
			  ClassLoader classLoader = getClass().getClassLoader();
			
			  file=new File(classLoader.getResource(fileName).getFile());
			
			
		}
		
		

		

	/*
	 * return snomad uri for passed label 
	 * */
	    public  String getSnomedUri(String itemOid) 
	    		throws FileNotFoundException{
	    	String uri="";
	    	

	       List<String[]> myEntries;
		try {
			
			
			
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(file));
			myEntries = reader.readAll();
			
			
		       Iterator<String[]> it =myEntries.iterator();
		       
	      		Boolean exit=false;  //find uri exit 

				

	     		while(!exit && it.hasNext()){

	     				String[] str=it.next();
	   			String s=str[0];
	   				if (s.equals(itemOid)){
	   					 uri=str[3];
	   					 exit=true;
	   				  }
	   				}
	     		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	     return uri;
	    }

	    
		/*
		 * return label
		 * Input ItemOid
		 * 
		 * */
		    public  String getLabel(String itemOid) 
		    		throws FileNotFoundException{
		    	String label="";
		       
		       List<String[]> myEntries;
			try {
				
				@SuppressWarnings("resource")
				CSVReader reader = new CSVReader(new FileReader(file));
				myEntries = reader.readAll();
				
				
			       Iterator<String[]> it =myEntries.iterator();
			       
		      		Boolean exit=false;  //find uri exit 

					

		     		while(!exit && it.hasNext()){

		     				String[] str=it.next();
		   			String s=str[0];
		   				if (s.equals(itemOid)){
		   					 label=str[4];
		   					 exit=true;
		   				  }
		   				}
		     		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		     return label;
		    }
		    
		    
		    
			/*
			 * return Domain 
			 * input ItemOid
			 * */
			    public  String getDomain(String itemOid) 
			    		throws FileNotFoundException{
			    	String uri="";
			       
			       List<String[]> myEntries;
				try {
					
					@SuppressWarnings("resource")
					CSVReader reader = new CSVReader(new FileReader(file));
					myEntries = reader.readAll();
					
					
				       Iterator<String[]> it =myEntries.iterator();
				       
			      		Boolean exit=false;  //find uri exit 

						

			     		while(!exit && it.hasNext()){

			     				String[] str=it.next();
			   			String s=str[0];
			   				if (s.equals(itemOid)){
			   					 uri=str[2];
			   					 exit=true;
			   				  }
			   				}
			     		
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				


			     return uri;
			    }


				public File getFile() {
					return file;
				}


				public void setFile(File file) {
					this.file = file;
				}
	    
	    
	}


