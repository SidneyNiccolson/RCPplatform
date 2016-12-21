package handlers;

import javax.annotation.PostConstruct;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class ShowWizard {
	@PostConstruct
	public void createControls(Composite parent){
		System.out.println(this.getClass().getSimpleName()
		        + " @PostConstruct method called.");
		parent.setLayout(new GridLayout(2,false));
		
		//text = new Text(parent, SWT.BORDER);
		//text.setMessage("Enter City");
		//text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,false,1,1));
		Button button = new Button(parent, SWT.PUSH);
		button.setText("Open Wizard");
		button.addSelectionListener(new SelectionAdapter() {
		        @Override
		        public void widgetSelected(SelectionEvent e) {
		                WizardDialog wizardDialog = new WizardDialog(parent.getShell(),
		                        new MyWizard());
		                if (wizardDialog.open() == Window.OK) {
		                        System.out.println("Ok pressed");
		                } else {
		                        System.out.println("Cancel pressed");
		                }
		        }
		});
	}
}
