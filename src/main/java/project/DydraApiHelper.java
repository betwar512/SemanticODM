package project;

import java.io.*;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelMaker;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;



public class DydraApiHelper {

	
	// HTTP POST request
	
		private void sendPost(String fileName,ByteArrayOutputStream file) throws Exception {

		final String url = "http://Scdydra.com/betwar/cardiodatabasestore";

		
		//auth_token=Sc1mzQxse5FK8EyyeQ6x: 
		
			HttpClient httpclient = HttpClients.createDefault();
			
			HttpPost post = new HttpPost(url);
			byte[] b = file.toByteArray();
		
			HttpEntity entry =MultipartEntityBuilder.create()
					.addBinaryBody(fileName,b)
					.build();
	
			post.addHeader("Content-Type","application/x-turtle");
			post.addHeader("auth_token","Sc1mzQxse5FK8EyyeQ6x:");
		    post.setEntity(entry);
		   
	
			
			System.out.println("done");
			
		
		}

	



public void fileFordb(ModelMaker mm){
	
	
	ExtendedIterator<String> iter=mm.listModels();
	while(iter.hasNext()){
	//
		String modelName=iter.next();
		Model model =mm.openModel(modelName);
	

		ByteArrayOutputStream out=new ByteArrayOutputStream();
		
		RDFDataMgr.write(out, model, RDFFormat.TURTLE_BLOCKS);
			
				try {
					
					sendPost(modelName,out);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}	
        }	
	}


}