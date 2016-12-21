package handlers;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Text;

public class MyPageTwo extends WizardPage {
        private Text text1;
        private Composite container;
        private String path;
        private int outString;
        

        public MyPageTwo() {
                super("Second Page");
                setTitle("Second Page");
                setDescription("Now this is the second page");
                setControl(text1);
        }

        @Override
        public void createControl(Composite parent) {
                container = new Composite(parent, SWT.NONE);
                GridLayout layout = new GridLayout();
                container.setLayout(layout);
                layout.numColumns = 2;
                Label label1 = new Label(container, SWT.NONE);
                label1.setText("Test");
                Button browseButton = new Button(this.container, SWT.PUSH);
                browseButton.setText("Open..");
                //slider widget
                final Label label = new Label(container, SWT.NONE);
                label.setText("Move the slider");
                label.setBounds(0, 20, 150, 15);

                final Slider slider = new Slider(container, SWT.HORIZONTAL);
                slider.setBounds(0, 40, 200, 20);
                final Text text = new Text(container, SWT.BORDER);
                text.setBounds(0, 100, 200, 25);
                slider.addListener(SWT.Selection, new Listener() {
                    public void handleEvent(Event event) {
                      
                      outString = slider.getSelection();
                      text.setText("Value: "+outString);
                    }
                  });
                browseButton.addSelectionListener(new SelectionListener() {

                   @Override
                   public void widgetDefaultSelected(SelectionEvent arg0) {

                }
                 
               
                 //file widget
				@Override
				public void widgetSelected(SelectionEvent e) {

                    FileDialog fileDialog = new FileDialog(MyPageTwo.this.container.getShell(), SWT.OPEN);         
                    fileDialog.setText("Open file");
                    path = fileDialog.open();
                    
					
				}
                   });
                //text widget
                text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
                text1.setText("");
                text1.addKeyListener(new KeyListener() {

                        @Override
                        public void keyPressed(KeyEvent e) {
                                // TODO Auto-generated method stub
                        }

                        @Override
                        public void keyReleased(KeyEvent e) {
                                if (!text1.getText().isEmpty()) {
                                        setPageComplete(true);
                                }
                        }

                });
                GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                text1.setLayoutData(gd);
                Label labelCheck = new Label(container, SWT.NONE);
                labelCheck.setText("This is a check");
                Button check = new Button(container, SWT.CHECK);
                check.setSelection(true);
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
        public int getSlider() {
            return outString;
    }
}