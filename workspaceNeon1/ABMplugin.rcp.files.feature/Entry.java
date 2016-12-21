package Run;
import java.io.File;
import java.io.IOException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;

import maia.MAIA;
import maia.MaiaPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import JETTemplates.Util;

import maia.collectiveStructure.*;
//import maia.collectiveStructure.MCDA;
import maia.collectiveStructure.PersonalValue;
import maia.constitutionalStructure.Role;
import maia.impl.MaiaPackageImpl;
import maia.ontologicalStructure.*;
import maia.physicalStructure.*;

public class Entry {
	public static void main(String[] param)
	{
		try {
			loadModel(param[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void loadModel(String modelFile) throws IOException {	
		
		// Obtain a new resource set
	    
	    //MaiaFactoryImpl.init();
	    //resSet.getPackageRegistry().put("http://maia/1.0", MaiaFactoryImpl.eINSTANCE.getEPackage());
	    ResourceSet resSet = new ResourceSetImpl();
	    resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	    	    //Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	    		"xml", new EcoreResourceFactoryImpl());
	    
	    resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	    		"maia", new EcoreResourceFactoryImpl());
	    
	    //Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
	    MaiaPackage.eINSTANCE.eClass();
	    // Get the resource
	    URI fileURI = URI.createFileURI(new File(modelFile).getAbsolutePath());
	    
	    //MaiaFactory m = MaiaFactoryImpl.eINSTANCE;
	    //m.createMAIA();
	    Resource resource = resSet.getResource(fileURI, true);
	   
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    MAIA myObj = (MAIA) resource.getContents().get(0);
	    EmitCode(myObj);
		
	}
	
	private static void EmitCode(MAIA maia){
		output(new JETTemplates.Agent().generate(null), "Agent");
		output(new JETTemplates.DecisionCriterion().generate(null), "DecisionCriterion");
		output(new JETTemplates.EntityAction().generate(null), "EntityAction");
		output(new JETTemplates.Institution().generate(null), "Institution");
		output(new JETTemplates.Objective().generate(null), "Objective");
		output(new JETTemplates.Role().generate(null), "Role");
		
		for (Agent agent : maia.getCollectiveStructure().getAgent())
		{
			output(new JETTemplates.Agent_instance().generate(agent), "Agent");
			for (MCDA decisionCriteria : agent.getDecision())
			{
				output(new JETTemplates.DecisionCritria_instances().generate(new Object[] {decisionCriteria, agent}), "p");
			}
		}
		
		for(PhysicalComponent comp : maia.getPhysicalStructure().getPhysicalComponent())
		{
			output(new JETTemplates.PhysicalComponent_instance().generate(comp),"PhysicalComponent");
		}
	}
	
	private static void output(String code, String n) {
		System.out.println(code);
	}

	private void codeDump()
	{
		PhysicalComponent p = null;
		p.getName();
		boolean fenced = p.getType() == ResourceType.FENCED;  
		for (Property x : p.getProperty()){
			x.getLabel();
			
			String propertyTypeName = "";
			
			if (x instanceof BooleanProperty)
			{
				propertyTypeName = "boolean";
			}
			else if (x instanceof NumberProperty)
			{
				propertyTypeName = "double";
			}
			else if (x instanceof StringProperty)
			{
				propertyTypeName = "String";
			}
			else
			{
				propertyTypeName = "Erooooooor cannot detect property name";
			}
		}
		
		Agent agent = null;
		
		for (PhysicalComponent pCom :agent.getPhysicalComponent())
		{
			///*<%=pComp.getName()%>PhyCom*/ pCom.getName() = new ???
			if (pCom.getType()== ResourceType.FENCED)
			{}
			for(Condition info : agent.getInformation())
			{
				info.getLabel();
			}
			
			for(PersonalValue pValue : agent.getPersonalValue())
			{
				double limit = Double.parseDouble(pValue.getDecisionInfluence().getLimit());
				String name = pValue.getDecisionInfluence().getName();
				double value = pValue.getValue();
			}
			
			for (Role role :agent.getPossibleRole())
			{
				String roleName = role.getName();
				
			}
			
			for (maia.collectiveStructure.MCDA decision : agent.getDecision())
			{
				DecisionCriteriaDump(decision);
			}
		}
	}
	
	private void DecisionCriteriaDump(maia.collectiveStructure.MCDA decision)
	{
		//String label = Util.Capitilize(decision.getLabel());
		
	}
	
	
}
