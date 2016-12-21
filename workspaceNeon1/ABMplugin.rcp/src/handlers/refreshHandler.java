package handlers;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.di.annotations.Execute;

public class refreshHandler {
        @Execute
        public void execute() throws CoreException {
          System.out.println((this.getClass().getSimpleName() + " called"));
          System.out.println("Refreshing..");
          for(IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
        	    project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
        	}
        }
}