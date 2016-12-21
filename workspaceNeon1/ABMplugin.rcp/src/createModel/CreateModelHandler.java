package createModel;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.jface.wizard.Wizard;




public class CreateModelHandler extends Wizard {
		protected  CreateModelPage wizObj;
   


        public CreateModelHandler() {
                super();
                setNeedsProgressMonitor(true);
        }

        @Override
        public String getWindowTitle() {
                return "Create Model";
        }

        @Override
        public void addPages() {
                wizObj = new CreateModelPage();
         
                addPage(wizObj);
               
        }

        @Override
        public boolean performFinish() {
    		//set monitor to track progress
    		NullProgressMonitor pm = new NullProgressMonitor();
    		//get the filled in name and radio button seleciton
    		String projName = wizObj.getText1();
    		String maiaName = wizObj.getText2();
    		System.out.println(projName);
    		System.out.println(maiaName);

    	
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

	   //System.out.println(projName);
    			 //add custom folder and JET TEMPLATES
    			   
    	
    			   
    			   
    			   IFile run = project.getFile(maiaName+".maia");
    			   if (!run.exists()) {
    				   byte[] bytes = Files.readAllBytes(Paths.get("skeleton.maia"));
    				     InputStream source = new ByteArrayInputStream(bytes);
    				     run.create(source, IResource.NONE, null);
    			   }
    			
    			   
    			   
    			   
    			  
    			
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