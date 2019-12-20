package finalproject;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class command extends Composite {
	private Text text;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public command(Composite parent, int style) {
		super(parent, style);
		
		Label label = new Label(this, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 16, SWT.BOLD));
		label.setBounds(85, 51, 189, 26);
		label.setText("\u8ACB\u8F38\u5165\u4F60\u7684\u8A55\u50F9\u5427\uFF01");
		
		text = new Text(this, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 12, SWT.NORMAL));
		text.setBounds(84, 89, 657, 292);
		
		Button button = new Button(this, SWT.NONE);
		button.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 14, SWT.BOLD));
		button.setBounds(606, 404, 135, 37);
		button.setText("\u905E\u4EA4\u8A55\u50F9");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
