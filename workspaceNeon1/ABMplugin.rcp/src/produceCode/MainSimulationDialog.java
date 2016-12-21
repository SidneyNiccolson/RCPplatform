package produceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import maia.collectiveStructure.PersonalValue;
import maia.constitutionalStructure.Role;
import maia.physicalStructure.PhysicalComponent;

public class MainSimulationDialog extends TitleAreaDialog {

	private Text txtFirstName;
	private Text seedText;
	private Text agentText;
	private Text agentText2;
	Button checkBox;
	private int numberOfActions;
	private boolean checker;
	private List<String> guiAgents;
	private List<String> guiPhys;
	private Map<String, Object> agentAttr;
	private Map<String, Object> planAttr;
	private Map<String, Object> phyAttr;
	private Map<String, Integer> planSeq;
	private Map<String, Integer> returnData = new HashMap<String, Integer>();
	private Map<String, Integer> returnData2 = new HashMap<String, Integer>();
	private Map<Integer, Boolean> seedData = new HashMap<Integer, Boolean>();
	private Map<String, List<Double>> attrData = new HashMap<String, List<Double>>();
	private Map<String, List<Double>> attrPCData = new HashMap<String, List<Double>>();
	private Map<String, Integer> seqData = new HashMap<String, Integer>();
	private Map<String, String> vizData = new LinkedHashMap<String, String>();
	private String tobeRemov;
	private String numberOfTicks;
	private String lastName;

	public MainSimulationDialog(Shell parentShell) {

		super(parentShell);

	}

	@Override
	public void create() {
		super.create();

		setTitle("Main simulation construction");
		setMessage("Specify simulation specific information", IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// parent.getShell().setSize(700,700);

		// parent.getShell().setFullScreen(true);
		Composite area = (Composite) super.createDialogArea(parent);
		area.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		final TabFolder tabFolder = new TabFolder(parent, SWT.BORDER);

		// ********create scrollable tab item for GENERAL TAB
		ScrolledComposite scroll = new ScrolledComposite(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL);
		scroll.setExpandHorizontal(true);
		scroll.setExpandVertical(true);
		GridData scrolledData = new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
		scroll.setLayoutData(scrolledData);
		// general tab composite (number of agents etc.)
		Composite result = new Composite(scroll, SWT.NONE);
		result.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		result.setLayout(layout);
		// fill in GUI
		createNumberOfTicks(result);
		createAgentGui(result, guiAgents);
		scroll.setContent(result);
		scroll.setMinSize(scroll.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		final TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		// set name of tab
		tabItem.setText("General");

		tabItem.setControl(scroll);
		scroll.setVisible(true);

		// ********create scrollable tab item for Initialization I tab
		// initialize attributes
		ScrolledComposite scrollIni = new ScrolledComposite(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL);
		scrollIni.setExpandHorizontal(true);
		scrollIni.setExpandVertical(true);

		// general tab composite (number of agents etc.)
		Composite result2 = new Composite(scrollIni, SWT.NONE);
		result2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout2 = new GridLayout(5, false);

		result2.setLayout(layout2);
		// fill in GUI
		createAgentAttr(result2, agentAttr);
		result2.setVisible(true);
		scrollIni.setContent(result2);

		scrollIni.setMinSize(scrollIni.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		// tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
		// true));
		final TabItem tabItem2 = new TabItem(tabFolder, SWT.NONE);
		tabFolder.pack();

		// set name of tab
		tabItem2.setText("Initialization I");
		tabItem2.setControl(scrollIni);
		scrollIni.setVisible(true);
		// ********create scrollable tab item for Initialization II tab
		// initialize attributes
		ScrolledComposite scrollIni2 = new ScrolledComposite(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL);
		scrollIni2.setExpandHorizontal(true);
		scrollIni2.setExpandVertical(true);

		// general tab composite (number of agents etc.)
		Composite resultII = new Composite(scrollIni2, SWT.NONE);
		resultII.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layoutII = new GridLayout(7, false);

		resultII.setLayout(layoutII);
		// fill in GUI
		createPhyAttr(resultII, agentAttr, phyAttr);
		resultII.setVisible(true);
		scrollIni2.setContent(resultII);

		scrollIni2.setMinSize(scrollIni2.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		// tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
		// true));
		final TabItem tabItemII = new TabItem(tabFolder, SWT.NONE);
		tabFolder.pack();

		// set name of tab
		tabItemII.setText("Initialization II");
		tabItemII.setControl(scrollIni2);
		scrollIni2.setVisible(true);
		// ********create scrollable tab item for Action order tab
		// initialize attributes
		ScrolledComposite scrollAction = new ScrolledComposite(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL);
		scrollAction.setExpandHorizontal(true);
		scrollAction.setExpandVertical(true);

		// general tab composite (number of agents etc.)
		Composite result3 = new Composite(scrollAction, SWT.NONE);
		result3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		// set number of columns of the GRID
		GridLayout layout3 = new GridLayout(3, false);

		result3.setLayout(layout3);
		// fill in GUI
		createPlanAttr(result3, planAttr);
		result3.setVisible(true);
		scrollAction.setContent(result3);

		scrollAction.setMinSize(scrollAction.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		// tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
		// true));
		final TabItem tabItem3 = new TabItem(tabFolder, SWT.NONE);
		tabFolder.pack();

		// set name of tab
		tabItem3.setText("Action orders");
		tabItem3.setControl(scrollAction);
		scrollAction.setVisible(true);

		// ********create scrollable tab item for export tab
		// initialize attributes
		ScrolledComposite scrollExport = new ScrolledComposite(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL);
		scrollExport.setExpandHorizontal(true);
		scrollExport.setExpandVertical(true);

		// general tab composite (number of agents etc.)
		Composite result4 = new Composite(scrollExport, SWT.NONE);
		result4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		// set number of columns of the GRID
		GridLayout layout4 = new GridLayout(2, false);

		result4.setLayout(layout4);
		// fill in GUI
		createVisualization(result4, agentAttr, phyAttr, parent);
		result4.setVisible(true);
		scrollExport.setContent(result4);

		scrollExport.setMinSize(scrollExport.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		// tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
		// true));
		final TabItem tabItem4 = new TabItem(tabFolder, SWT.NONE);
		tabFolder.pack();

		// set name of tab
		tabItem4.setText("Visualizations");
		tabItem4.setControl(scrollExport);
		scrollExport.setVisible(true);

		return area;
	}

	private void createNumberOfTicks(Composite container) {
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("Enter number of ticks:");

		GridData dataFirstName = new GridData();
		dataFirstName.grabExcessHorizontalSpace = true;
		dataFirstName.horizontalAlignment = GridData.CENTER;

		txtFirstName = new Text(container, SWT.BORDER);
		txtFirstName.setLayoutData(dataFirstName);
		txtFirstName.addListener(SWT.Verify, new Listener() {
			public void handleEvent(Event e) {
				String string = e.text;
				char[] chars = new char[string.length()];
				string.getChars(0, chars.length, chars, 0);
				for (int i = 0; i < chars.length; i++) {
					if (!('0' <= chars[i] && chars[i] <= '9')) {
						e.doit = false;
						return;
					}
				}
			}
		});
		Label seedLb = new Label(container, SWT.NONE);
		seedLb.setText("Enter random seed:");
		seedText = new Text(container, SWT.BORDER);
		seedText.setLayoutData(dataFirstName);
		seedText.addListener(SWT.Verify, new Listener() {
			public void handleEvent(Event e) {
				String string = e.text;
				char[] chars = new char[string.length()];
				string.getChars(0, chars.length, chars, 0);
				for (int i = 0; i < chars.length; i++) {
					if (!('0' <= chars[i] && chars[i] <= '9')) {
						e.doit = false;
						return;
					}
				}
			}
		});
		Label seedLb2 = new Label(container, SWT.NONE);
		seedLb2.setText("Use seed:");
		seedLb2.setVisible(false);
		// Create three checkboxes
		Boolean check = false;
		checkBox = new Button(container, SWT.CHECK);
		checkBox.setLayoutData(dataFirstName);
		checkBox.setText("Use seed");
		checkBox.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				Button btn = (Button) event.getSource();
				System.out.println(btn.getSelection());
				// add listener to check for any inputs and map the input
				seedText.addModifyListener(new ModifyListener() {
					@Override
					public void modifyText(ModifyEvent e) {
						// TODO Auto-generated method stub
						Text text = (Text) e.widget;

						if (!text.getText().isEmpty()) {
							Integer returnValue = Integer.parseInt(text.getText());
							try {
								seedData.clear();
								seedData.put(returnValue, btn.getSelection());
								setSeedData(seedData);
							} catch (Exception t) {
								//
							}
						}

					}
				});
			}
		});
		seedText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				Text text = (Text) e.widget;

				if (!text.getText().isEmpty()) {
					Integer returnValue = Integer.parseInt(text.getText());
					checkBox.addSelectionListener(new SelectionAdapter() {

						@Override
						public void widgetSelected(SelectionEvent event) {
							Button btn = (Button) event.getSource();
							try {
								seedData.clear();
								seedData.put(returnValue, btn.getSelection());
								setSeedData(seedData);
							} catch (Exception t) {
								//
							}
							// add listener to check for any inputs and map the
							// input

						}
					});

				}

			}
		});
	}

	private void createAgentGui(Composite container, List<String> guiAgents) {

		ListIterator iter = guiAgents.listIterator();
		// dynamically construct the GUI based on available agents
		while (iter.hasNext()) {
			Label lbtLastName = new Label(container, SWT.NONE);
			String value = iter.next().toString();
			lbtLastName.setText("Enter number of " + value + " agent type" + ":");
			GridData dataLastName = new GridData();
			dataLastName.grabExcessHorizontalSpace = true;
			dataLastName.horizontalAlignment = GridData.CENTER;
			agentText = new Text(container, SWT.BORDER);
			agentText.setLayoutData(dataLastName);
			// add listener to check if input is integer
			agentText.addListener(SWT.Verify, new Listener() {
				public void handleEvent(Event e) {
					String string = e.text;
					char[] chars = new char[string.length()];
					string.getChars(0, chars.length, chars, 0);
					for (int i = 0; i < chars.length; i++) {
						if (!('0' <= chars[i] && chars[i] <= '9')) {
							e.doit = false;
							return;
						}
					}
				}
			});
			// add listener to check for any inputs and map the input
			agentText.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					// TODO Auto-generated method stub
					Text text = (Text) e.widget;

					if (!text.getText().isEmpty()) {
						Integer returnValue = Integer.parseInt(text.getText());
						try {
							returnData.put(value, returnValue);
							setLastName(returnData);
						} catch (Exception t) {
							//
						}
					}

				}
			});
			// System.out.println("index: " + iter.nextIndex() + " value: " +
			// value);
		}
	}

	private void createAgentAttr(Composite containerIni, Map<String, Object> agentAttr2) {
		Label ag = new Label(containerIni, SWT.NONE);
		ag.setText("Agent names");
		ag.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label head = new Label(containerIni, SWT.NONE);
		head.setText("Agent properties");
		head.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label min = new Label(containerIni, SWT.NONE);
		min.setText("min value");
		min.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label def = new Label(containerIni, SWT.NONE);
		def.setText("def value");
		def.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label max = new Label(containerIni, SWT.NONE);
		max.setText("max value");
		max.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));

		// spacing
		int[] looper = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int c : looper) {
			Label separator = new Label(containerIni, SWT.HORIZONTAL | SWT.SEPARATOR);
			separator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			separator.setVisible(false);
		}
		// TODO Auto-generated method stub
		Iterator it = agentAttr2.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();

			// cast the object into the agent object (which it inherently is)
			maia.collectiveStructure.Agent myAgent = (maia.collectiveStructure.Agent) pair.getValue();
			// create a list of the properties
			List<maia.ontologicalStructure.Property> properties = (myAgent.getProperty());
			
			// loop over properties
			for (maia.ontologicalStructure.Property pr : properties) {
				Label lb = new Label(containerIni, SWT.NONE);
				String agentName = pair.getKey().toString();
				// set name of agent
				lb.setText(agentName);
				// set label which is attribute name
				Label propLabel = new Label(containerIni, SWT.NONE);
				propLabel.setText(pr.getLabel() + ":");

				// set text box for min range
				GridData dataLastName2 = new GridData();
				dataLastName2.grabExcessHorizontalSpace = true;
				dataLastName2.horizontalAlignment = GridData.CENTER;
				Text minText = new Text(containerIni, SWT.BORDER);
				minText.setLayoutData(dataLastName2);
				verifyDouble(minText);
				Device device = Display.getCurrent();
				Color col = new Color(device, 81, 81, 81);
				// set text box for default value
				dataLastName2.grabExcessHorizontalSpace = true;
				dataLastName2.horizontalAlignment = GridData.CENTER;
				Text defText = new Text(containerIni, SWT.BORDER);
				defText.setLayoutData(dataLastName2);
				defText.setText(JETTemplates.Util.GetPropertyValue(pr));
				defText.setBackground(col);
				defText.setEnabled(false);
				// set text box for max range
				dataLastName2.grabExcessHorizontalSpace = true;
				dataLastName2.horizontalAlignment = GridData.CENTER;
				Text maxText = new Text(containerIni, SWT.BORDER);
				maxText.setLayoutData(dataLastName2);
				verifyDouble(maxText);
				if (maxText.getText().isEmpty() && minText.getText().isEmpty()) {
					checker = true;
				}

				// add listener to check for any inputs and map the input
				minText.addModifyListener(new ModifyListener() {
					@Override
					public void modifyText(ModifyEvent e) {
						// TODO Auto-generated method stub
						Text text2 = (Text) e.widget;
						if (!text2.getText().isEmpty()) {
							Double min = Double.parseDouble(text2.getText());
							try {
								// add listener to check for any inputs and map
								// the input
								maxText.addModifyListener(new ModifyListener() {
									@Override
									public void modifyText(ModifyEvent e) {
										// TODO Auto-generated method stub
										Text text3 = (Text) e.widget;
										if (!text3.getText().isEmpty()) {

											try {
												Double max = Double.parseDouble(text3.getText());
												if (max >= min) {
													List<Double> list = Arrays.asList(min, max);
													// the key should be unique
													// hence the combination
													attrData.put(myAgent.getName() + "|" + pr.getLabel(), list);
													setLastName3(attrData);
													checker = true;
												} else {
													checker = false;
												}
											} catch (Exception t) {
												//

											}
										}

									}
								});

							} catch (Exception t) {
								//
							}
						}

					}
				});

			} // end of loop

		}
	}// end of method

	protected void createPlanAttr(Composite containerAction, Map<String, Object> planHash) {
		Label per = new Label(containerAction, SWT.NONE);
		per.setText("Performer");
		per.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label ag = new Label(containerAction, SWT.NONE);
		ag.setText("EntityAction names");
		ag.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));

		Label orderHeader = new Label(containerAction, SWT.NONE);
		orderHeader.setText("order");
		orderHeader.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));

		// spacing
		int[] looper = { 1, 2, 3, 4, 5, 6 };
		for (int c : looper) {
			Label separator = new Label(containerAction, SWT.HORIZONTAL | SWT.SEPARATOR);
			separator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			separator.setVisible(false);
		}
		// TODO Auto-generated method stub
		Iterator it = planHash.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			// cast the object into the plan object (which it inherently is)
			maia.operationalStructure.Plan plan = (maia.operationalStructure.Plan) pair.getValue();
			// if is member of entityaction
			if (plan instanceof maia.operationalStructure.EntityAction) {
				maia.operationalStructure.EntityAction entityAction = (maia.operationalStructure.EntityAction) plan;

				if (entityAction != null) {
					try {
						numberOfActions = numberOfActions + 1;
						Label perLabel = new Label(containerAction, SWT.NONE);
						perLabel.setText(entityAction.getPerfomer().getName());
						// set label which is action name
						Label propLabel = new Label(containerAction, SWT.NONE);
						propLabel.setText(entityAction.getName() + ":");

						// set text box for min range
						GridData dataLastName2 = new GridData();
						dataLastName2.grabExcessHorizontalSpace = true;
						dataLastName2.horizontalAlignment = GridData.CENTER;
						Text actionText = new Text(containerAction, SWT.BORDER);
						actionText.setLayoutData(dataLastName2);
						// add listener to check if input is integer
						actionText.addListener(SWT.Verify, new Listener() {
							public void handleEvent(Event e) {
								String string = e.text;
								char[] chars = new char[string.length()];
								string.getChars(0, chars.length, chars, 0);
								for (int i = 0; i < chars.length; i++) {
									if (!('0' <= chars[i] && chars[i] <= '9')) {
										e.doit = false;
										return;
									}
								}
							}
						});
						actionText.addModifyListener(new ModifyListener() {
							@Override
							public void modifyText(ModifyEvent e) {
								// TODO Auto-generated method stub
								Text inputAction = (Text) e.widget;
								if (!inputAction.getText().isEmpty()) {
									int chckData = Integer.parseInt(inputAction.getText());
									// set a new name according to sequence
									// order

									System.out.println(chckData);
									seqData.put(entityAction.getName(), chckData);
									setseqdata(seqData);
								}

							}
						});

					} catch (Exception e) {

					}
				}

			}
		} // end of while

	}

	protected void createVisualization(Composite container, Map<String, Object> agentAttr2,
			Map<String, Object> phyAttr2, Composite parent) {
		Label per = new Label(container, SWT.NONE);
		per.setText("x-axis selection");
		per.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label ag = new Label(container, SWT.NONE);
		ag.setText("y-axis selection");
		ag.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		final Combo xaxis = new Combo(container, SWT.DROP_DOWN | SWT.READ_ONLY);
		final Combo yaxis = new Combo(container, SWT.DROP_DOWN | SWT.READ_ONLY);

		// TODO Auto-generated method stub
		Iterator it = agentAttr2.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();

			// cast the object into the agent object (which it inherently is)
			maia.collectiveStructure.Agent myAgent = (maia.collectiveStructure.Agent) pair.getValue();
			// create a list of the properties
			List<maia.ontologicalStructure.Property> properties = (myAgent.getProperty());

			// loop over properties
			for (maia.ontologicalStructure.Property pr : properties) {
				xaxis.add(pr.getLabel() + "|" + myAgent.getName() + "|" + "notRole" + "|" + "notPC");
				xaxis.select(0);
				yaxis.add(pr.getLabel() + "|" + myAgent.getName() + "|" + "notRole" + "|" + "notPC");
				yaxis.select(1);
			}
			List<String> linkedPCs = new ArrayList();
			// loop over roles to get those PC properties as well
			for (maia.constitutionalStructure.Role role : myAgent.getPossibleRole()) {
				for (maia.physicalStructure.PhysicalComponent phy : role.getPhysicalComponent()) {
					for (maia.ontologicalStructure.Property pr : phy.getProperty()) {
						xaxis.add(pr.getLabel() + "|" + myAgent.getName() + "|" + role.getName() + "|" + phy.getName());
						yaxis.add(pr.getLabel() + "|" + myAgent.getName() + "|" + role.getName() + "|" + phy.getName());
						linkedPCs.add(pr.getLabel());
					}
				}
			}
			// loop over physical components
			for (maia.physicalStructure.PhysicalComponent phy : myAgent.getPhysicalComponent()) {
				for (maia.ontologicalStructure.Property pr : phy.getProperty()) {
					// the property name should not match any of the role as
					// this will be redundant
					if (!linkedPCs.contains(pr.getLabel())) {
						xaxis.add(pr.getLabel() + "|" + myAgent.getName() + "|" + "notRole" + "|" + phy.getName());
						yaxis.add(pr.getLabel() + "|" + myAgent.getName() + "|" + "notRole" + "|" + phy.getName());
					}
				}

			}
		}

		// loop of physical components that are of type OPEN
		Iterator itphy = phyAttr2.entrySet().iterator();
		while (itphy.hasNext()) {
			Map.Entry pairs = (Map.Entry) itphy.next();
			// cast the object into the agent object (which it inherently is)
			maia.physicalStructure.PhysicalComponent phyComGen = (maia.physicalStructure.PhysicalComponent) pairs
					.getValue();
			if (phyComGen.getType().getName().equals("open")) {
				for (maia.ontologicalStructure.Property pr : phyComGen.getProperty()) {
					xaxis.add(pr.getLabel() + "|" + "(OPEN)#" + "|" + "notRole" + "|" + phyComGen.getName());
					yaxis.add(pr.getLabel() + "|" + "(OPEN)#" + "|" + "notRole" + "|" + phyComGen.getName());
				}
			}
		}
		// add ticks
		xaxis.add("ticks" + "|notAgent" + "|notRole" + "|notPC");
		yaxis.add("ticks" + "|notAgent" + "|notRole" + "|notPC");

		Button button = new Button(container, SWT.PUSH);
		button.setText("Add(++)");

		Button buttonRem = new Button(container, SWT.PUSH);
		buttonRem.setText("Remove latest added");

		Button button2 = new Button(container, SWT.PUSH);
		button2.setText("Show selections");

		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				/* returnVal.setText(""); */

				if (!xaxis.getText().equals(yaxis.getText())) {
					// as the key should be unique deal with that
					String uniqueID = UUID.randomUUID().toString();
					vizData.put("x|" + xaxis.getText() + "|" + uniqueID, "y|" + yaxis.getText());
					setvizdata(vizData);

					// returnVal.setText(vizData.toString());
					// returnVal.setText("\n");
				}
			}

		});
		// Remove last element function
		buttonRem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				// System.out.println(tobeRemov);
				String lastEl = null;
				Iterator it = vizData.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry pair = (Map.Entry) it.next();
					lastEl = pair.getKey().toString();
					System.out.println(lastEl);
				}
				vizData.remove(lastEl);
				setvizdata(vizData);
			}
		});
		// display button
		button2.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				MessageBox messageBox = new MessageBox(parent.getShell(), SWT.ICON_WARNING);
				setvizdata(vizData);
				messageBox.setText("Info");
				List<String> where = new ArrayList<String>();
				Iterator it = vizData.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry pair = (Map.Entry) it.next();
					String key = (String) pair.getKey();
					String value = (String) pair.getValue();
					String[] keys = key.split("\\|");
					String[] values = value.split("\\|");
					where.add("[x=" + keys[1] + "(" + keys[2] + ")," + "y=" + values[1] + "(" + values[2] + ")" + "]");
					// header =
					// header.concat(keys[1]+"\t\t\t\t\t\t\t\t"+keys[2]+"\t\t\t\t\t\t\t\t\t\t"+values[1]+"\t\t\t\t\t\t\t\t"+values[2]+"\n");
					System.out.println(value);

				}
				messageBox.setMessage(where.toString());

				int buttonID = messageBox.open();
				switch (buttonID) {
				case SWT.YES:
					// saves changes ...
				case SWT.NO:
					// exits here ...
					break;
				case SWT.CANCEL:
					// does nothing ...
				}
			}
		});

	}

	private void createPhyAttr(Composite resultII, Map<String, Object> agentAttr2, Map<String, Object> phyAttr2) {
		// TODO read in agent object > getphycom, getpossiblerole
		// for role getphycom
		// if phycom in phycom object is not tied to an agent also display that
		// one (if OPEN)

		// headers
		Label per = new Label(resultII, SWT.NONE);
		per.setText("Agent");
		per.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label ag = new Label(resultII, SWT.NONE);
		ag.setText("Role");
		ag.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label ag2 = new Label(resultII, SWT.NONE);
		ag2.setText("PhyCom");
		ag2.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label per2 = new Label(resultII, SWT.NONE);
		per2.setText("Property");
		per2.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label min = new Label(resultII, SWT.NONE);
		min.setText("min value");
		min.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label def = new Label(resultII, SWT.NONE);
		def.setText("def value");
		def.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Label max = new Label(resultII, SWT.NONE);
		max.setText("max value");
		max.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));

		// start iterating through to restore original objects
		Iterator it = agentAttr2.entrySet().iterator();
		List<String> linkedPCs = new ArrayList();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			// cast the object into the agent object (which it inherently is)
			maia.collectiveStructure.Agent myAgent = (maia.collectiveStructure.Agent) pair.getValue();
			// create a list of the roles
			List<maia.constitutionalStructure.Role> roles = (myAgent.getPossibleRole());
			// loop over roles
			for (maia.constitutionalStructure.Role rl : roles) {
				List<PhysicalComponent> physRole = rl.getPhysicalComponent();
				// build gui
				for (maia.physicalStructure.PhysicalComponent phyRole : physRole) {
					linkedPCs.add(phyRole.getName());
					List<maia.ontologicalStructure.Property> prsOfRolePC = phyRole.getProperty();
					for (maia.ontologicalStructure.Property prOfRolePC : prsOfRolePC) {
						Label lb = new Label(resultII, SWT.NONE);
						// set name of agent
						lb.setText(myAgent.getName());
						// set label which is attribute name
						Label roleLabel = new Label(resultII, SWT.NONE);
						roleLabel.setText(rl.getName());
						Label pcName = new Label(resultII, SWT.NONE);
						pcName.setText(phyRole.getName());
						Label prLabel = new Label(resultII, SWT.NONE);
						prLabel.setText(prOfRolePC.getLabel() + ":");

						// set text box for min range
						GridData dataLastName2 = new GridData();

						dataLastName2.grabExcessHorizontalSpace = true;
						dataLastName2.horizontalAlignment = GridData.CENTER;
						Text minText = new Text(resultII, SWT.BORDER);
						minText.setLayoutData(dataLastName2);
						verifyDouble(minText);
						Device device = Display.getCurrent();
						Color col = new Color(device, 81, 81, 81);
						// set text box for default value
						dataLastName2.grabExcessHorizontalSpace = true;
						dataLastName2.horizontalAlignment = GridData.CENTER;
						Text defText = new Text(resultII, SWT.BORDER);
						defText.setLayoutData(dataLastName2);
						defText.setText(JETTemplates.Util.GetPropertyValue(prOfRolePC));
						defText.setBackground(col);
						defText.setEnabled(false);
						// set text box for max range
						dataLastName2.grabExcessHorizontalSpace = true;
						dataLastName2.horizontalAlignment = GridData.CENTER;
						Text maxText = new Text(resultII, SWT.BORDER);
						maxText.setLayoutData(dataLastName2);
						verifyDouble(maxText);
						if (maxText.getText().isEmpty() && minText.getText().isEmpty()) {
							checker = true;
						}

						// add listener to check for any inputs and map the
						// input
						minText.addModifyListener(new ModifyListener() {
							@Override
							public void modifyText(ModifyEvent e) {
								// TODO Auto-generated method stub
								Text text2 = (Text) e.widget;
								if (!text2.getText().isEmpty()) {
									Double min = Double.parseDouble(text2.getText());
									try {
										// add listener to check for any inputs
										// and map the input
										maxText.addModifyListener(new ModifyListener() {
											@Override
											public void modifyText(ModifyEvent e) {
												// TODO Auto-generated method
												// stub
												Text text3 = (Text) e.widget;
												if (!text3.getText().isEmpty()) {

													try {
														Double max = Double.parseDouble(text3.getText());
														if (max >= min) {
															List<Double> list = Arrays.asList(min, max);
															// the key should be
															// unique hence the
															// combination
															attrPCData.put(myAgent.getName() + "|" + rl.getName() + "|"
																	+ phyRole.getName() + "|" + prOfRolePC.getLabel(),
																	list);
															setAttrPCData(attrPCData);
															checker = true;
														} else {
															checker = false;
														}
													} catch (Exception t) {
														//

													}
												}

											}
										});

									} catch (Exception t) {
										//
									}
								}

							}
						});
					}

				}

			}
			// create a list of the phycoms
			List<PhysicalComponent> phys = (myAgent.getPhysicalComponent());
			// loop over phycoms
			for (maia.physicalStructure.PhysicalComponent phy : phys) {
				linkedPCs.add(phy.getName());
				List<maia.ontologicalStructure.Property> prsOfAgentPC = phy.getProperty();
				for (maia.ontologicalStructure.Property prOfAgentPC : prsOfAgentPC) {
					// build gui
					Label lb = new Label(resultII, SWT.NONE);
					// set name of agent
					lb.setText(myAgent.getName());
					// set label which is attribute name
					Label roleLabel = new Label(resultII, SWT.NONE);
					roleLabel.setText("notRole");
					Label pcName = new Label(resultII, SWT.NONE);
					pcName.setText(phy.getName());

					Label prLabel = new Label(resultII, SWT.NONE);
					prLabel.setText(prOfAgentPC.getLabel() + ":");
					// set text box for min range
					GridData dataLastName2 = new GridData();

					dataLastName2.grabExcessHorizontalSpace = true;
					dataLastName2.horizontalAlignment = GridData.CENTER;
					Text minText = new Text(resultII, SWT.BORDER);
					minText.setLayoutData(dataLastName2);
					verifyDouble(minText);
					Device device = Display.getCurrent();
					Color col = new Color(device, 81, 81, 81);
					// set text box for default value
					dataLastName2.grabExcessHorizontalSpace = true;
					dataLastName2.horizontalAlignment = GridData.CENTER;
					Text defText = new Text(resultII, SWT.BORDER);
					defText.setLayoutData(dataLastName2);
					defText.setText(JETTemplates.Util.GetPropertyValue(prOfAgentPC));
					defText.setBackground(col);
					defText.setEnabled(false);
					// set text box for max range
					dataLastName2.grabExcessHorizontalSpace = true;
					dataLastName2.horizontalAlignment = GridData.CENTER;
					Text maxText = new Text(resultII, SWT.BORDER);
					maxText.setLayoutData(dataLastName2);
					verifyDouble(maxText);
					if (maxText.getText().isEmpty() && minText.getText().isEmpty()) {
						checker = true;
					}

					// add listener to check for any inputs and map the input
					minText.addModifyListener(new ModifyListener() {
						@Override
						public void modifyText(ModifyEvent e) {
							// TODO Auto-generated method stub
							Text text2 = (Text) e.widget;
							if (!text2.getText().isEmpty()) {
								Double min = Double.parseDouble(text2.getText());
								try {
									// add listener to check for any inputs and
									// map the input
									maxText.addModifyListener(new ModifyListener() {
										@Override
										public void modifyText(ModifyEvent e) {
											// TODO Auto-generated method stub
											Text text3 = (Text) e.widget;
											if (!text3.getText().isEmpty()) {

												try {
													Double max = Double.parseDouble(text3.getText());
													if (max >= min) {
														List<Double> list = Arrays.asList(min, max);
														// the key should be
														// unique hence the
														// combination
														attrPCData.put(
																myAgent.getName() + "|" + "notRole" + "|"
																		+ phy.getName() + "|" + prOfAgentPC.getLabel(),
																list);
														setAttrPCData(attrPCData);
														checker = true;
													} else {
														checker = false;
													}
												} catch (Exception t) {
													//

												}
											}

										}
									});

								} catch (Exception t) {
									//
								}
							}

						}
					});
				}

			}

		}
		// start iterating through all phycom objects as we want to capture non
		// linked PCs
		Iterator it2 = phyAttr2.entrySet().iterator();
		List<String> phyGens = new ArrayList<String>();
		while (it2.hasNext()) {
			Map.Entry pairs = (Map.Entry) it2.next();
			// cast the object into the agent object (which it inherently is)
			maia.physicalStructure.PhysicalComponent phyComGen = (maia.physicalStructure.PhysicalComponent) pairs
					.getValue();
			// check if it is really an open phycome (assumption: not linked to
			// agents/roles)
			if (!linkedPCs.contains(phyComGen.getName()) && phyComGen.getType().getName().equals("open")) {

				for (maia.ontologicalStructure.Property prOpen : phyComGen.getProperty()) {

					// build gui
					Label lb = new Label(resultII, SWT.NONE);
					// set name of agent
					lb.setText("(OPEN)#" + phyComGen.getName());
					// set label which is attribute name
					Label roleLabel = new Label(resultII, SWT.NONE);
					roleLabel.setText("notRole");
					Label pcName = new Label(resultII, SWT.NONE);
					pcName.setText(phyComGen.getName());

					Label prLabel = new Label(resultII, SWT.NONE);
					prLabel.setText(prOpen.getLabel() + ":");
					// set text box for min range
					GridData dataLastName2 = new GridData();

					dataLastName2.grabExcessHorizontalSpace = true;
					dataLastName2.horizontalAlignment = GridData.CENTER;
					Text minText = new Text(resultII, SWT.BORDER);
					minText.setLayoutData(dataLastName2);
					verifyDouble(minText);
					Device device = Display.getCurrent();
					Color col = new Color(device, 81, 81, 81);
					// set text box for default value
					dataLastName2.grabExcessHorizontalSpace = true;
					dataLastName2.horizontalAlignment = GridData.CENTER;
					Text defText = new Text(resultII, SWT.BORDER);
					defText.setLayoutData(dataLastName2);
					defText.setText(JETTemplates.Util.GetPropertyValue(prOpen));
					defText.setBackground(col);
					defText.setEnabled(false);
					// set text box for max range
					dataLastName2.grabExcessHorizontalSpace = true;
					dataLastName2.horizontalAlignment = GridData.CENTER;
					Text maxText = new Text(resultII, SWT.BORDER);
					maxText.setLayoutData(dataLastName2);
					verifyDouble(maxText);
					if (maxText.getText().isEmpty() && minText.getText().isEmpty()) {
						checker = true;
					}

					// add listener to check for any inputs and map the input
					minText.addModifyListener(new ModifyListener() {
						@Override
						public void modifyText(ModifyEvent e) {
							// TODO Auto-generated method stub
							Text text2 = (Text) e.widget;
							if (!text2.getText().isEmpty()) {
								Double min = Double.parseDouble(text2.getText());
								try {
									// add listener to check for any inputs and
									// map the input
									maxText.addModifyListener(new ModifyListener() {
										@Override
										public void modifyText(ModifyEvent e) {
											// TODO Auto-generated method stub
											Text text3 = (Text) e.widget;
											if (!text3.getText().isEmpty()) {

												try {
													Double max = Double.parseDouble(text3.getText());
													if (max >= min) {
														List<Double> list = Arrays.asList(min, max);
														// the key should be
														// unique hence the
														// combination
														attrPCData.put(
																"(OPEN)#" + phyComGen.getName() + "|" + "notRole" + "|"
																		+ phyComGen.getName() + "|" + prOpen.getLabel(),
																list);
														setAttrPCData(attrPCData);
														checker = true;
													} else {
														checker = false;
													}
												} catch (Exception t) {
													//

												}
											}

										}
									});

								} catch (Exception t) {
									//
								}
							}

						}
					});
				}
			}
		}

	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	// save content of the Text fields because they get disposed
	// as soon as the Dialog closes
	private void saveInput() {
		numberOfTicks = txtFirstName.getText();
		lastName = agentText.getText();

	}

	protected void setAgents(List<String> agents) {
		guiAgents = agents;
	}

	protected void setPhys(List<String> phys) {
		guiPhys = phys;
	}

	protected void setAgentObjects(Map<String, Object> agentHashmap) {
		agentAttr = agentHashmap;
	}

	protected void setPlanObjects(Map<String, Object> planHashmap) {
		planAttr = planHashmap;
	}

	protected void setPhyObjects(Map<String, Object> phyHashmap) {
		phyAttr = phyHashmap;
	}

	@Override
	protected void okPressed() {
		List<Integer> testValues = new ArrayList<Integer>();

		// check for sequence order
		Iterator it4 = seqData.entrySet().iterator();
		while (it4.hasNext()) {
			Map.Entry pair2 = (Map.Entry) it4.next();
			Integer seq = (Integer) pair2.getValue();

			testValues.add(seq);
		}
		Set<Integer> set = new HashSet<Integer>(testValues);

		if (set.size() < testValues.size()) {
			// There are duplicates checker = true;
			System.out.println("ok");
			checker = false;
		} else {
			for (Integer i : testValues) {
				if (i > numberOfActions) {
					// the sequence number entered is larger than the total
					// entity actions available
					checker = false;
				} else {

					System.out.print("passed");
					/*
					 * boolean flag = true; for (int y = 0; y <
					 * testValues.size() - 1; y++) { if (testValues[y + 1] !=
					 * testValues[y] + 1) { flag = false; break;
					 * 
					 * } }
					 */
				}
			}

		}

		System.out.println(testValues);
		System.out.println(numberOfActions);
		// handle errors for general tab
		if (checker && !agentText.getText().isEmpty() && !txtFirstName.getText().isEmpty()) {
			System.out.println(checker);
			saveInput();
			super.okPressed();
		} else {
			MessageDialog.openWarning(Display.getDefault().getActiveShell(), "Warning",
					"Needed input parameters are wrong or missing!\n Please check input fields in General and Orders tab (both are required inputs).");
		}

	}

	@Override
	protected void cancelPressed() {

		MessageDialog.openWarning(Display.getDefault().getActiveShell(), "Warning",
				"Code generation aborted, not all code is generated.");
		super.cancelPressed();
	}

	public String getnumberOfTicks() {
		return numberOfTicks;
	}

	// for agents
	public void setLastName(Map<String, Integer> obj) {
		returnData = obj;
	}

	// for ticks but I didn't adjust the variable names
	public void setLastName2(Map<String, Integer> obj) {
		returnData2 = obj;
	}

	public void setSeedData(Map<Integer, Boolean> obj) {
		seedData = obj;
	}

	public void setLastName3(Map<String, List<Double>> obj) {
		attrData = obj;
	}

	public void setAttrPCData(Map<String, List<Double>> obj) {
		attrPCData = obj;
	}

	public void setseqdata(Map<String, Integer> obj) {
		seqData = obj;
	}

	public void setvizdata(Map<String, String> obj) {
		vizData = obj;
	}

	public void setPlanSeq(Map<String, Integer> obj) {
		planSeq = obj;
	}

	public void setRem(String obj) {
		tobeRemov = obj;
	}

	public Map<String, Integer> getAgentData() {
		return returnData;
	}

	public Map<String, Integer> getPhyComData() {
		return returnData2;
	}

	public Map<String, List<Double>> getattrData() {
		return attrData;
	}

	public Map<String, List<Double>> getattrPCData() {
		return attrPCData;
	}

	public Map<String, Integer> getseqData() {
		return seqData;
	}

	public Map<Integer, Boolean> getseedData() {
		return seedData;
	}

	public Map<String, String> getvizData() {
		return vizData;
	}

	public void verifyDouble(Text text) {
		text.addVerifyListener(new VerifyListener() {
			@Override
			public void verifyText(VerifyEvent e) {
				/* Notice how we combine the old and new below */
				String currentText = ((Text) e.widget).getText();
				String port = currentText.substring(0, e.start) + e.text + currentText.substring(e.end);
				System.out.println(port);
				try {
					Double max = Double.parseDouble(port);
				} catch (NumberFormatException ex) {

					if (!port.equals("") && !port.equals("-")) {
						e.doit = false;
					}
				}
			}
		});
	}
	// make sure that the order given by the user make sense
	// are there duplicate values?
	// is the number not larger than the existing entityActions
	// if random is selected do not do the check!!

}