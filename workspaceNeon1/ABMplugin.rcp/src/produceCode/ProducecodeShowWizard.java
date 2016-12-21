package produceCode;

import javax.annotation.PostConstruct;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

public class ProducecodeShowWizard {
	@PostConstruct
	public void createControls(Composite parent){
		System.out.println(this.getClass().getSimpleName()
		        + " @PostConstruct method called.");
		RowLayout fill = new RowLayout();
		
		parent.setLayout(fill);
		
		//text = new Text(parent, SWT.BORDER);
		//text.setMessage("Enter City");
		//text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,false,1,1));
		Button button = new Button(parent, SWT.PUSH);
		button.setText("Produce code");
		button.addSelectionListener(new SelectionAdapter() {
		        @Override
		        public void widgetSelected(SelectionEvent e) {
		                WizardDialog wizardDialog = new WizardDialog(parent.getShell(),
		                        new ProduceCodeHandler());
		                if (wizardDialog.open() == Window.OK) {
		                        System.out.println("Ok pressed");
		                } else {
		        			MessageDialog.openWarning(Display.getDefault().getActiveShell(), "Warning", "Code generation aborted, not all code is generated.");

		                }
		        }
		});
	}
}
