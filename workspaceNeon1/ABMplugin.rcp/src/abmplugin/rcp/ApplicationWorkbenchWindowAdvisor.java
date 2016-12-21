package abmplugin.rcp;



import java.awt.Dimension;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
    	
    	super(configurer);
    	
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }
    
    public void preWindowOpen() {
    	
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        //set full screen for the app
        Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        configurer.setInitialSize(new Point((int)dim.getWidth(), 
        (int)dim.getHeight()));
       
        
        configurer.setShowPerspectiveBar(true);
      
       // configurer.setShowCoolBar(true);
        //configurer.setShowStatusLine(true);
        configurer.setTitle("ABM-MAIA Model & Simulation"); //$NON-NLS-1$
    	
    }
}
