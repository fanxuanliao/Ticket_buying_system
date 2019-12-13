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

public class shaishuan extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
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
		composite_1.setLayout(new RowLayout(SWT.HORIZONTAL));
		FormData fd_composite_1 = new FormData();
		fd_composite_1.left = new FormAttachment(0, 75);
		fd_composite_1.bottom = new FormAttachment(100, -579);
		fd_composite_1.top = new FormAttachment(composite, 6);
		composite_1.setLayoutData(fd_composite_1);
		
		Button button = new Button(composite_1, SWT.CHECK);
		button.setText("\u9A5A\u609A");
		
		Button button_1 = new Button(composite_1, SWT.CHECK);
		button_1.setText("\u611B\u60C5");
		
		Button button_2 = new Button(composite_1, SWT.CHECK);
		button_2.setText("\u52D5\u4F5C");
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setTouchEnabled(true);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.bottom = new FormAttachment(composite_1, 439, SWT.BOTTOM);
		fd_lblNewLabel.top = new FormAttachment(composite_1, 23);
		fd_lblNewLabel.left = new FormAttachment(composite, 0, SWT.LEFT);
		fd_lblNewLabel.right = new FormAttachment(0, 473);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		String X = "test\n1111\n";
		//lblNewLabel.setText(X);

		
		Button chooseEnd = new Button(this, SWT.NONE);
		chooseEnd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for(int i=0;i<4;i++) {
					lblNewLabel.setText("XDXDXD\n");					
				}

			}
		});
		fd_composite_1.right = new FormAttachment(100, -370);
		FormData fd_chooseEnd = new FormData();
		fd_chooseEnd.bottom = new FormAttachment(composite_1, 0, SWT.BOTTOM);
		fd_chooseEnd.left = new FormAttachment(composite_1, 6);
		fd_chooseEnd.top = new FormAttachment(0, 100);
		fd_chooseEnd.right = new FormAttachment(100, -252);
		chooseEnd.setLayoutData(fd_chooseEnd);
		chooseEnd.setText("\u9078\u64C7\u7D42\u4E86");
		
		

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
