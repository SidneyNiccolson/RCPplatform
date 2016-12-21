package produceCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ButtonGroup;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;

import handlers.MyPageTwo;

public class ProduceCodePage extends WizardPage {
        private Text text1;
        private Text text2;
        private Composite container;
        private String path;
        private FileDialog fileDialog;

        public ProduceCodePage() {
                super("This is the wizard for producing code.");
                setTitle("This is the wizard for producing code.");
                
        }

        @Override
        public void createControl(Composite parent) {
        		
                container = new Composite(parent, SWT.NONE);
                GridLayout layout = new GridLayout();
                container.setLayout(layout);
                //set # columns for widgets to one
                layout.numColumns = 2;
                
                
                Label label2 = new Label(container, SWT.NONE);
                //set text widget
                //label1.setText("");
              //set text widget
                label2.setText("Enter your MAIA simulation experiment name:");
                text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
                text1.setText("");
                
                
               
                Button browseButton = new Button(this.container, SWT.PUSH);
                
                browseButton.setText("Select maia file..");
                text2 = new Text(container, SWT.BORDER | SWT.SINGLE);
                text2.setText("");
                text2.setEnabled(false);
                browseButton.addSelectionListener(new SelectionListener() {

                    @Override
                    public void widgetDefaultSelected(SelectionEvent arg0) {

                }
             //file widget
                    
				@Override
				public void widgetSelected(SelectionEvent e) {

                fileDialog = new FileDialog(ProduceCodePage.this.container.getShell(), SWT.OPEN);         
                
            	fileDialog.setText("");
               
	                String[] filterExt = {"*.maia"};
	              
	                fileDialog.setFilterExtensions(filterExt);
	                
                   path = fileDialog.open();
                   setPath(path);
                   text2.setText(path);
                
	                
					
				}
                 });
                text1.addKeyListener(new KeyListener() {

                    @Override
                    public void keyPressed(KeyEvent e) {
                    }
                    //this is a key event whenever something is typed in and the text is not empty
                    @Override
                    public void keyReleased(KeyEvent e) {
                    		
                            if (!text1.getText().isEmpty() && !text2.getText().isEmpty()){
                            	
                            	setPageComplete(true);
                            }
                    }

            });
                ModifyListener listener = new ModifyListener() {
                   
            
					@Override
					public void modifyText(ModifyEvent e) {
						// TODO Auto-generated method stub
						if (!text1.getText().isEmpty() && !text2.getText().isEmpty()){
                        	
                        	setPageComplete(true);
                        }
					}
                };
                
                text2.addModifyListener(listener);
           
                
                
               
                GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                text1.setLayoutData(gd);
                GridData gd2 = new GridData(GridData.FILL_HORIZONTAL);
                text2.setLayoutData(gd);
             
                   
                
                // required to avoid an error in the system
                setControl(container);
                setPageComplete(false);

        }

        public String getText1() {
            return text1.getText();
    }
    public String getPath() {
        return path;
}
       public void setPath(String p){
    	   path = p;
       }
      
        
       
    
}