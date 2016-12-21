package handlers;
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
                super("MAIA code generation wizard");
                setTitle("MAIA code generation wizard");
                
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
                label1.setText("Enter your project name:");
                text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
                text1.setText("");
                //set combo widget
                Composite yesNo = new Composite(container, SWT.NONE);
                yesNo.setLayout(new FillLayout(SWT.VERTICAL));
                defSel = new Button(yesNo,SWT.RADIO);
                defSel.setText("Create default project (recommended)");
                defSel.setSelection(true);
                

                altSel = new Button(yesNo,SWT.RADIO);
                altSel.setText("Create project with raw JET templates (powerusers)");
                altSel.setSelection(false);
              

                
                
                text1.addKeyListener(new KeyListener() {

                        @Override
                        public void keyPressed(KeyEvent e) {
                        }
                        //this is a key event whenever something is typed in and the text is not empty
                        @Override
                        public void keyReleased(KeyEvent e) {
                                if (!text1.getText().isEmpty()) {
                                        setPageComplete(true);
                                        String projName = text1.getText();
                                        

                                }
                        }

                });
                //add event to check the value
                defSel.addListener(SWT.Selection, new Listener() {
                    public void handleEvent(Event event) {
                      
                    	
                    	setDefaultSelection(defSel.getSelection());
                    }
                });
                //set layout for widgets
                GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                
                text1.setLayoutData(gd);
                
                // required to avoid an error in the system
                setControl(container);
                setPageComplete(false);

        }

        public String getText1() {
                return text1.getText();
        }
        
        public void setDefaultSelection(Boolean selection){
        	mySelection = selection;
        }
        public Boolean getDefaultSelection(){
        	
        	return mySelection;
        }
      
        
       
    
}