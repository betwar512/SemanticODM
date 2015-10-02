package project;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelMaker;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;

import java.io.*;


/**
 * Servlet implementation class main
 */

public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final int BUFFER_SIZE = 4096;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		// TODO Auto-generated method stub

		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		// Parse the request
		ModelMaker mm=null;
		
		try {
			List<FileItem> items = upload.parseRequest(request);	
			for(FileItem file:items){
				
		if(file!=null){		
			InputStream f=file.getInputStream();	
			RDFModelHelper mh=new RDFModelHelper();
	     	//Model Maker 
			 mm=mh.modelGenerator(f);
	     	//Sc1mzQxse5FK8EyyeQ6x   Dydra Api key
	     	
		}
			
		
			
			
			
//	     	ExtendedIterator<String> names=mm.listModels();
//	     	 response.setContentType("text/html");  
//	     	 PrintWriter out = response.getWriter();  
//	     	 out.println("<html>");
//	     	 out.println("<body>");
//	     int i=0;
//	     	while(i<1){
//	     		i++;
//	     		String it=names.next();
//	     		out.println(it);
//	     		
//	     		Model m=mm.openModel(it);
//	     	//	RDFDataMgr.write(out, m,RDFFormat.TURTLE_BLOCKS) ;
//	     	 	out.println("<p>");
//	     		m.write(out);
//	     	RDFDataMgr.write(out, m, RDFFormat.TURTLE_BLOCKS);
//	     			
//	     	out.println("/p>");
//	     	}
//
//	     	 out.println("</body>");
//	     	 out.println("</html>");
//
//	     	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		DydraApiHelper dy=new DydraApiHelper();
		dy.fileFordb(mm);
		
		

	}
}
