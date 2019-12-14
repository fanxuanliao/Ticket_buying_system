package finalproject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.RowData;

public class shaishuan extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	int pa=1,pb=2,pc=3,pd=4,pe=5,pf=6;
	int max;
	boolean finished = false;
	
	public shaishuan(Composite parent, int style) {
		super(parent, style);
		setLayout(new FormLayout());
		
		Composite composite = new Composite(this, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 84);
		fd_composite.right = new FormAttachment(0, 594);
		fd_composite.top = new FormAttachment(0, 51);
		fd_composite.left = new FormAttachment(0, 75);
		composite.setLayoutData(fd_composite);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Button btnCheckButton = new Button(composite, SWT.CHECK);
		btnCheckButton.setText("American");
		
		Button btnCheckButton_1 = new Button(composite, SWT.CHECK);
		btnCheckButton_1.setText("Taiwan");
		
		Button btnCheckButton_2 = new Button(composite, SWT.CHECK);
		btnCheckButton_2.setText("Japan");
		
		Button btnCheckButton_3 = new Button(composite, SWT.CHECK);
		btnCheckButton_3.setText("Korean");
		
		Composite composite_1 = new Composite(this, SWT.NONE);
		FormData fd_composite_1 = new FormData();
		fd_composite_1.bottom = new FormAttachment(0, 136);
		fd_composite_1.right = new FormAttachment(0, 404);
		fd_composite_1.top = new FormAttachment(0, 90);
		fd_composite_1.left = new FormAttachment(0, 75);
		composite_1.setLayoutData(fd_composite_1);
		composite_1.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Button button = new Button(composite_1, SWT.CHECK);
		button.setText("\u9A5A\u609A");
		
		Button button_1 = new Button(composite_1, SWT.CHECK);
		button_1.setText("\u611B\u60C5");
		
		Button button_2 = new Button(composite_1, SWT.CHECK);
		button_2.setText("\u52D5\u4F5C");
		
		Button button_3 = new Button(this, SWT.NONE);
		FormData fd_button_3 = new FormData();
		fd_button_3.right = new FormAttachment(0, 472);
		fd_button_3.top = new FormAttachment(0, 185);
		fd_button_3.left = new FormAttachment(0, 75);
		button_3.setLayoutData(fd_button_3);
		
		Button button_4 = new Button(this, SWT.NONE);
		FormData fd_button_4 = new FormData();
		fd_button_4.right = new FormAttachment(0, 472);
		fd_button_4.top = new FormAttachment(0, 216);
		fd_button_4.left = new FormAttachment(0, 75);
		button_4.setLayoutData(fd_button_4);
		
		Button button_5 = new Button(this, SWT.NONE);
		FormData fd_button_5 = new FormData();
		fd_button_5.right = new FormAttachment(0, 472);
		fd_button_5.top = new FormAttachment(0, 247);
		fd_button_5.left = new FormAttachment(0, 75);
		button_5.setLayoutData(fd_button_5);
		
		Button button_6 = new Button(this, SWT.NONE);
		FormData fd_button_6 = new FormData();
		fd_button_6.right = new FormAttachment(0, 472);
		fd_button_6.top = new FormAttachment(0, 278);
		fd_button_6.left = new FormAttachment(0, 75);
		button_6.setLayoutData(fd_button_6);
		
		Button button_7 = new Button(this, SWT.NONE);
		FormData fd_button_7 = new FormData();
		fd_button_7.right = new FormAttachment(0, 472);
		fd_button_7.top = new FormAttachment(0, 309);
		fd_button_7.left = new FormAttachment(0, 75);
		button_7.setLayoutData(fd_button_7);
		
		Button chooseEnd = new Button(this, SWT.NONE);
		FormData fd_chooseEnd = new FormData();
		fd_chooseEnd.bottom = new FormAttachment(0, 136);
		fd_chooseEnd.right = new FormAttachment(0, 522);
		fd_chooseEnd.top = new FormAttachment(0, 100);
		fd_chooseEnd.left = new FormAttachment(0, 410);
		chooseEnd.setLayoutData(fd_chooseEnd);
		chooseEnd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {		
					finished = true;
					button_3.setText(Main.datain[pa].name);
					button_4.setText(Main.datain[pb].name);
					button_5.setText(Main.datain[pc].name);
					button_6.setText(Main.datain[pd].name);
					button_7.setText(Main.datain[pe].name);

			}
		});
		chooseEnd.setText("\u9078\u64C7\u7D42\u4E86");
		
		Composite composite_2 = new Composite(this, SWT.NONE);
		composite_2.setLayout(null);
		FormData fd_composite_2 = new FormData();
		fd_composite_2.right = new FormAttachment(composite, 0, SWT.RIGHT);
		fd_composite_2.top = new FormAttachment(button_7, 6);
		fd_composite_2.left = new FormAttachment(chooseEnd, 0, SWT.LEFT);
		fd_composite_2.bottom = new FormAttachment(100, -311);
		composite_2.setLayoutData(fd_composite_2);
		
		Button btnBack = new Button(composite_2, SWT.NONE);
		btnBack.setBounds(3, 3, 79, 25);
		btnBack.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(pa>1 && finished == true) {
					button_3.setText(Main.datain[pa-=5].name);
					button_4.setText(Main.datain[pb-=5].name);
					button_5.setText(Main.datain[pc-=5].name);
					button_6.setText(Main.datain[pd-=5].name);
					button_7.setText(Main.datain[pe-=5].name);
				}
				else {
				}
			}
		});
		btnBack.setText("back");
		
		Button btnNext = new Button(composite_2, SWT.NONE);
		btnNext.setBounds(85, 3, 87, 25);
		btnNext.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(finished == true) {
					button_3.setText(Main.datain[pa+=5].name);
					button_4.setText(Main.datain[pb+=5].name);
					button_5.setText(Main.datain[pc+=5].name);
					button_6.setText(Main.datain[pd+=5].name);
					button_7.setText(Main.datain[pe+=5].name);
				}}
		});
		btnNext.setText("next");
		
		

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
