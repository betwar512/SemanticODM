package project;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.cdisc.ns.odm.v1.*;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.ModelMaker;
import com.hp.hpl.jena.shared.PrefixMapping;
import com.hp.hpl.jena.vocabulary.DC;
import semanticModel.*;
import vocabulary.lcdc.*;


/**
 * @author Abbas H Safaie
 * RDFModel /helper class to generate model and add specified properties to the model 
 * Main function CreateModel 
 *
 */
public class RDFModelHelper {


	   //================================================================================
    // Model
    //================================================================================

  
  //Grouping by SubjectKey
  public HashMap<String, List<ItemDetail>> groupBySubjectKey(ArrayList<ItemDetail> itemDtos){
	  
	  
	  HashMap<String, List<ItemDetail>> hashMap=new HashMap<String, List<ItemDetail>>();
	  
	  for(ItemDetail itemDto:itemDtos){ 
		  if(!hashMap.containsKey(itemDto.subjectKey)){
	          List<ItemDetail> list= new ArrayList<ItemDetail>();
	          list.add(itemDto);
	      hashMap.put(itemDto.subjectKey,list);
	      }
	      else
	          hashMap.get(itemDto.subjectKey).add(itemDto);  
	    }	  
	  return hashMap;
	  }

  

		  //================================================================================
	   	// MetaData model   Test V 2.0
		//================================================================================
  
 
//Test Method to call 
  public ModelMaker modelGenerator(InputStream file){

		PrefixMapping pf=PrefixMapping.Factory.create();

			pf.withDefaultMappings(PrefixMapping.Standard);
		
		pf.setNsPrefix("lcdcodm", Odm.getURI());
		pf.setNsPrefix("dc",  DC.getURI());	
		pf.setNsPrefix("lcdccore",LcdcCore.getURI());
		pf.setNsPrefix("disco",Disco.getURI());
		pf.setNsPrefix("cardiovitalsigns", "http://aehrc-ci.it.csiro.au/cardio/lcdc/vitalsigns/def/cardio-vitalsigns#");
		pf.setNsPrefix("lcdcobs", Obs.getURI());
		pf.setNsPrefix("skos", Skos.getURI());
		pf.setNsPrefix("cardiovitalsigns",Cardiovitalsigns.getURI() );
		pf.setNsPrefix("cardiomedic",Cardiomedic.getURI());
		pf.setNsPrefix("cardioblood",Cardioblood.getURI());
		ModelFactory.setDefaultModelPrefixes(pf);
		
		     ModelMaker mm=ModelFactory.createMemModelMaker();
		
		     	
		   // String filePa="C:\\Users\\abbas\\Desktop\\EclipseMarsWorkSpace\\prijectgriffithstudents\\src\\main\\java\\project\\odm1.3_clinical_ext_Full_study_extract_2015-05-22-162457368.xml";
	
			JaxBinder jxb=new JaxBinder(file);
			ODMcomplexTypeDefinitionClinicalData clinicalData=
			jxb.getClinicalData(jxb.odm);
	ODMcomplexTypeDefinitionMetaDataVersion meta = jxb.catchMetaData(jxb.odm);
	
	    HashMap<String,ODMcomplexTypeDefinitionItemDef> itemDef = JaxBinder.catchItemDef(meta);
       ArrayList<ItemDetail> itemDtos = jxb.makeItemsObjects(clinicalData,meta);

 
    	//Cardio Variables 
        VariableCustomModel.generateVariable(itemDtos,itemDef,mm);
          CardioCustomModel.generateCardio(itemDtos,itemDef,mm);  
        
        //Observation Models 
        ObservationCustomModel.createObservation(mm,itemDtos,itemDef,meta);
        //Slice Models 
        SliceCustomModel.sliceBySubject(mm, itemDtos, itemDef, meta);
        SliceCustomModel.sliceByTheme( mm,  itemDtos, itemDef, meta);
        SliceCustomModel.sliceByPhase( mm,  itemDtos, itemDef, meta); 
        
  	return mm;
	  
  }
  
  
  
 
  
}
