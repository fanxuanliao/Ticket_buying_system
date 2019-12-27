package finalproject;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;

public class introwindow extends Composite {
	int iden, amount, pay;
	public Button button_1;
	
	public static Label name;
	public static Label intro;
	public static Label image;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public introwindow(Composite parent, int style) {
		super(parent, style);
		setLayout(null);
		
		name = new Label(this, SWT.NONE);
		name.setFont(SWTResourceManager.getFont("黑體-繁", 25, SWT.NORMAL));
		name.setBounds(75, 68, 139, 47);
		name.setText("電影名稱");
		
		intro = new Label(this, SWT.NONE);
		intro.setFont(SWTResourceManager.getFont("黑體-繁", 14, SWT.NORMAL));
		intro.setBounds(75, 162, 471, 236);
		intro.setText("電影介紹");
		
		
		image = new Label(this, SWT.NONE);
		image.setImage(SWTResourceManager.getImage(introwindow.class, "/photo/1.jpg"));
		image.setBounds(552, 68, 203, 282);
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setAlignment(SWT.RIGHT);
		lblNewLabel.setFont(SWTResourceManager.getFont("黑體-繁", 14, SWT.NORMAL));
		lblNewLabel.setBounds(75, 433, 70, 23);
		lblNewLabel.setText("\u7968\u7A2E");
		
		Combo combo = new Combo(this, SWT.NONE);
		combo.setItems(new String[] {"\u6210\u4EBA\u7968", "\u611B\u5FC3\u7968"});
		combo.setBounds(155, 433, 88, 23);
		
		Label label_2 = new Label(this, SWT.NONE);
		label_2.setText("\u5F35\u6578");
		label_2.setFont(SWTResourceManager.getFont("黑體-繁", 14, SWT.NORMAL));
		label_2.setAlignment(SWT.RIGHT);
		label_2.setBounds(260, 433, 45, 23);
		
		Combo combo_1 = new Combo(this, SWT.NONE);
		combo_1.setItems(new String[] {"1", "2", "3", "4"});
		combo_1.setBounds(311, 433, 88, 23);
		
		Label label_3 = new Label(this, SWT.NONE);
		label_3.setText("\u4ED8\u6B3E\u65B9\u5F0F");
		label_3.setFont(SWTResourceManager.getFont("黑體-繁", 14, SWT.NORMAL));
		label_3.setAlignment(SWT.RIGHT);
		label_3.setBounds(405, 433, 90, 23);
		
		Combo combo_2 = new Combo(this, SWT.NONE);
		combo_2.setItems(new String[] {"\u73FE\u91D1", "\u4FE1\u7528\u5361"});
		combo_2.setBounds(501, 433, 88, 23);
		
		Label label_5 = new Label(this, SWT.NONE);
		label_5.setFont(SWTResourceManager.getFont("黑體-繁", 16, SWT.BOLD));
		label_5.setBounds(405, 488, 99, 23);
		label_5.setText("\u7E3D\u7968\u50F9\u70BA\uFF1A");
		
		Label prize = new Label(this, SWT.NONE);
		prize.setAlignment(SWT.RIGHT);

		prize.setFont(SWTResourceManager.getFont("黑體-繁", 16, SWT.BOLD));
		prize.setBounds(501, 488, 90, 23);
		
		Button button = new Button(this, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				iden = combo.getSelectionIndex();
				amount = combo_1.getSelectionIndex();
				pay = combo_2.getSelectionIndex();
				int money = 300;
				if(iden == 1) money*= 0.5;
				if(pay == 1) money*=0.8;
				money*= (amount+1);
				prize.setText( "$" + money );
			}
		});
		button.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 12, SWT.NORMAL));
		button.setBounds(621, 421, 114, 35);
		button.setText("\u8A08\u7B97\u7968\u50F9");
		
		button_1 = new Button(this, SWT.NONE);
		button_1.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 12, SWT.NORMAL));
		button_1.setText("\u78BA\u8A8D\u4ED8\u6B3E");
		button_1.setBounds(621, 488, 114, 35);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	public static void setMovieIntro(int btn) {
		String path = "/photo/" + shaishuan.selectedData[btn].index  +".jpg";
		name.setText(shaishuan.selectedData[btn].name);
		//intro.setText(shaishuan.selectedData[btn].);
		image.setImage(SWTResourceManager.getImage(introwindow.class, path));
	}
}
