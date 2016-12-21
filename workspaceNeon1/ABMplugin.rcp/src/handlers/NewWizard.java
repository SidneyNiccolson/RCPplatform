package handlers;

import java.io.BufferedInputStream;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path ;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.emf.codegen.jet.IJETNature;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
public class NewWizard extends Wizard implements INewWizard {
	protected MyPageOne wizObj;
//***WORKING WIZARD FOR CREATION OF JET/JAVA EMF/MAIA project
	public NewWizard() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
			wizObj = new MyPageOne();
		     
		     addPage(wizObj);
		     
	}
		    
	//This is where I want the JET project to be created by default, by overriding performFinish you can create custom projects
	@Override
	public boolean performFinish() {
		//set monitor to track progress
		NullProgressMonitor pm = new NullProgressMonitor();
		//get the filled in name and radio button seleciton
		String projName = wizObj.getText1();
		Boolean defSelection = wizObj.getDefaultSelection();
	
		// create empty project
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projName);
		try {
			project.create(pm);
			project.open(pm);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		//set Java nature 
			  IProjectDescription desc = project.getDescription();
			   desc.setNatureIds(new String[] {
			      JavaCore.NATURE_ID});
			   project.setDescription(desc, pm);
		//set output folder for classess (bin folder)
			   IJavaProject javaProj = JavaCore.create(project);
			   IFolder binDir = project.getFolder("bin");
			   IPath binPath = binDir.getFullPath();
			   javaProj.setOutputLocation(binPath, null);
			   
			   //custom libaries to add to the builtpath
			   String emf_common_filename = "org.eclipse.emf.common-2.9.0.v20130528-0742.jar";
			   String maia_filename = "MAIA_0.1.0.201610181051.jar";
			   String emf_xmi_filename = "org.eclipse.emf.ecore.xmi-2.9.0.v20130528-0742.jar";
			   String emf_ecore_filename = "org.eclipse.emf.ecore-2.9.0.v20130528-0742.jar";
			   InputStream is;
			   InputStream maia;
			   InputStream xmi;
			   InputStream ecore;
			   is = new BufferedInputStream(new FileInputStream(emf_common_filename));
			   maia = new BufferedInputStream(new FileInputStream(maia_filename));
			   xmi = new BufferedInputStream(new FileInputStream(emf_xmi_filename));
			   ecore = new BufferedInputStream(new FileInputStream(emf_ecore_filename));
			   IFile emf_common_file = project.getFile(emf_common_filename);
			   IFile emf_xmi_file = project.getFile(emf_xmi_filename);
			   IFile emf_ecore_file = project.getFile(emf_ecore_filename);
			   IFile maia_file = project.getFile(maia_filename);
			   emf_common_file.create(is, false, null);
			   emf_ecore_file.create(ecore, false, null);
			   emf_xmi_file.create(xmi, false, null);
			   maia_file.create(maia, false, null);

			   IPath emf_common_path = emf_common_file.getFullPath();
			   IPath maia_path = maia_file.getFullPath(); 
			   IPath xmi_path = emf_xmi_file.getFullPath();
			   IPath ecore_path = emf_ecore_file.getFullPath();
			  
			   //System.out.println(projName);
			 //add custom folder and JET TEMPLATES
			   
			   IFolder folder2 = project.getFolder("JETTemplates");
			   IFolder folder3 = project.getFolder("Run");
			   if (!folder2.exists()) 
				    folder2.create(IResource.NONE, true, null);
			   if (!folder3.exists()) 
				    folder3.create(IResource.NONE, true, null);
			   System.out.println(defSelection);
			   //check the radiobutton selection and create the txtjet folder and files if needed.
			   if (defSelection == false){
				   IFolder folder = project.getFolder("templates");
				   if (!folder.exists()) 
					    folder.create(IResource.NONE, true, null);
				   List<String> files = Arrays.asList("Agent_instances.txtjet","PhysicalComponent_instance.txtjet","Role.txtjet","EntityAction.txtjet"
						   ,"Agent.txtjet","Role_instances.txtjet","DecisionCriteria_instances.txtjet", "property.inc","DecisionCriterion.txtjet","generator.skeleton",
						   "Objective.txtjet","PhysicalComponent.txtjet","Institution.txtjet");
				   for(int i = 0; i < files.size(); i++){
					   IFile file2 = folder.getFile(files.get(i));
					   if (!file2.exists()) {
							  
						   byte[] bytes = Files.readAllBytes(Paths.get(files.get(i)));
						     //byte[] bytes = "<%@ jet package=\"Templates\"  class=\"Role_instances\"  %>package constitutionalStructure;public class inspectionOfficer extends Role{}".getBytes();
						     InputStream source = new ByteArrayInputStream(bytes);
						     file2.create(source, IResource.NONE, null);
						  }
				   }
			   }
			   //create the java files that are normally generated
			   else{
				   if (folder2.exists()){ 
					   List<String> files = Arrays.asList("Agent_instance.java","PhysicalComponent_instance.java","Role.java","EntityAction.java"
							   ,"Agent.java","Role_instances.java","DecisionCritria_instances.java","DecisionCriterion.java",
							   "Objective.java","PhysicalComponent.java","Institution.java");
					   for(int i = 0; i < files.size(); i++){
						   IFile file2 = folder2.getFile(files.get(i));
						   if (!file2.exists()) {
								  
							   byte[] bytes = Files.readAllBytes(Paths.get(files.get(i)));
							     //byte[] bytes = "<%@ jet package=\"Templates\"  class=\"Role_instances\"  %>package constitutionalStructure;public class inspectionOfficer extends Role{}".getBytes();
							     InputStream source = new ByteArrayInputStream(bytes);
							     file2.create(source, IResource.NONE, null);
						   }
					   }
				   }
			   }
			   
			   
			   IFile run = folder3.getFile("Entry.java");
			   if (!run.exists()) {
				   byte[] bytes = Files.readAllBytes(Paths.get("Entry.java"));
				     InputStream source = new ByteArrayInputStream(bytes);
				     run.create(source, IResource.NONE, null);
			   }
			   IFile util = folder2.getFile("Util.java");
			   if (!util.exists()) {
				   byte[] bytes = Files.readAllBytes(Paths.get("Util.java"));
				     InputStream source = new ByteArrayInputStream(bytes);
				     util.create(source, IResource.NONE, null);
			   }
			   
			   
			   
			  
			//set JRE and add additional libraries EMF and MAIA
			   Set<IClasspathEntry> entries = new HashSet<IClasspathEntry>();

			   entries.addAll(Arrays.asList(javaProj.getRawClasspath()));
			   
			   IVMInstall vmInstall= JavaRuntime.getDefaultVMInstall();

			   LibraryLocation[] locations= JavaRuntime.getLibraryLocations(vmInstall);

			   for (LibraryLocation element : locations) {

			   entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
			   entries.add(JavaCore.newLibraryEntry(emf_common_path, null, null));
			   entries.add(JavaCore.newLibraryEntry(maia_path, null, null));
			   entries.add(JavaCore.newLibraryEntry(xmi_path, null, null));
			   entries.add(JavaCore.newLibraryEntry(ecore_path, null, null));
			   }

			   javaProj.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), pm);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			  //IProject newProject = getNewProject();
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Working Directory = " +
		              System.getProperty("user.dir"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		


		return true;
	}

}
