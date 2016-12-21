package runSimulation;

import org.eclipse.jface.wizard.Wizard;


public class MyWizard extends Wizard {

        protected MyPageOne one;


        public MyWizard() {
                super();
                setNeedsProgressMonitor(true);
        }

        @Override
        public String getWindowTitle() {
                return "Run simulation";
        }

        @Override
        public void addPages() {
                one = new MyPageOne();
         
                addPage(one);
               
        }

        @Override
        public boolean performFinish() {
                // Print the result to the console
                System.out.println("finish is pressed");
              

                return true;
        }
}