package runSimulation;
import javax.swing.ButtonGroup;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;

public class MyPageOne extends WizardPage {
        private Text text1;
        private Composite container;
		private Button defSel;
		private Button altSel;
		private boolean defaultSelection;
		private boolean mySelection = true;

        public MyPageOne() {
                super("Run simulation");
                setTitle("Run simulation");
                
        }

        @Override
        public void createControl(Composite parent) {
                container = new Composite(parent, SWT.NONE);
                GridLayout layout = new GridLayout();
                container.setLayout(layout);
                //set # columns for widgets to one
                layout.numColumns = 1;
                
                Label label1 = new Label(container, SWT.NONE);
                //set text widget
                label1.setText("This is the wizard for running a simulation.\n In order to run the simulation, the Java code requires further completion,\n for example, by adding initial values, the period of the simulation and the number of agents."
                		+ "\n So there needs to some way of specification in a GUI for these before calling the main simulation class.");
         
             
              

                
                
             
             
                
                // required to avoid an error in the system
                setControl(container);
                setPageComplete(false);

        }

   
       
      
        
       
    
}