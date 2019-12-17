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
	int max, cnt=0;
	boolean finished = false;
	boolean En,Eu,Ch,other;
	boolean st01,st02,st03,st04,st05,st06,st07,st08,st09,st10,st11;
	movie[] selectedData = new movie[50];

	public void filter() {
		cnt=0;
		for(int i =0;i<50;i++) {
			if( (Main.datain[i].En && En) || (Main.datain[i].Eu &&Eu) || (Main.datain[i].Ch&&Ch) || (Main.datain[i].other&&other) ) {
				selectedData[cnt] = Main.datain[i];
				cnt++;
			}
			else if( (st01&&Main.datain[i].ty01)||(st02&&Main.datain[i].ty02)||(st03&&Main.datain[i].ty03)||(st04&&Main.datain[i].ty04)||(st05&&Main.datain[i].ty05)||(st06&&Main.datain[i].ty06)||(st07&&Main.datain[i].ty07)||(st08&&Main.datain[i].ty08)||(st09&&Main.datain[i].ty09)||(st10&&Main.datain[i].ty10)||(st11&&Main.datain[i].ty11)){
				selectedData[cnt] = Main.datain[i];
				cnt++;
			}
		}
	}
	
	
	public shaishuan(Composite parent, int style) {
		super(parent, style);
		setLayout(null);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setBounds(75, 51, 445, 33);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Button btnCheckButton = new Button(composite, SWT.CHECK);
		btnCheckButton.setText("\u82F1\u8A9E");
		
		Button btnCheckButton_1 = new Button(composite, SWT.CHECK);
		btnCheckButton_1.setText("\u6B50\u6D32");
		
		Button btnCheckButton_2 = new Button(composite, SWT.CHECK);
		btnCheckButton_2.setText("\u83EF\u8A9E");
		
		Button btnCheckButton_3 = new Button(composite, SWT.CHECK);
		btnCheckButton_3.setText("\u4E9E\u6D32\u5176\u4ED6");
		
		Composite composite_1 = new Composite(this, SWT.NONE);
		composite_1.setBounds(75, 90, 327, 46);
		composite_1.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Button b01 = new Button(composite_1, SWT.CHECK);
		b01.setText("\u52D5\u4F5C");
		
		Button b02 = new Button(composite_1, SWT.CHECK);
		b02.setText("\u52D5\u756B");
		
		Button b03 = new Button(composite_1, SWT.CHECK);
		b03.setText("\u72AF\u7F6A");
		
		Button b04 = new Button(composite_1, SWT.CHECK);
		b04.setText("\u5287\u60C5");
		
		Button b05 = new Button(composite_1, SWT.CHECK);
		b05.setText("\u5192\u96AA");
		
		Button b06 = new Button(composite_1, SWT.CHECK);
		b06.setText("\u611B\u60C5");
		
		Button b07 = new Button(composite_1, SWT.CHECK);
		b07.setText("\u79D1\u5E7B");
		
		Button b08 = new Button(composite_1, SWT.CHECK);
		b08.setText("\u559C\u5287");
		
		Button b09 = new Button(composite_1, SWT.CHECK);
		b09.setText("\u6B77\u53F2");
		
		Button b10 = new Button(composite_1, SWT.CHECK);
		b10.setText("\u97F3\u6A02");
		
		Button b11 = new Button(composite_1, SWT.CHECK);
		b11.setText("\u6050\u6016\u3001\u9A5A\u609A\u3001\u61F8\u7591");
		
		Button button_3 = new Button(this, SWT.NONE);
		button_3.setBounds(75, 185, 397, 25);
		
		Button button_4 = new Button(this, SWT.NONE);
		button_4.setBounds(75, 216, 397, 25);
		
		Button button_5 = new Button(this, SWT.NONE);
		button_5.setBounds(75, 247, 397, 25);
		
		Button button_6 = new Button(this, SWT.NONE);
		button_6.setBounds(75, 278, 397, 25);
		
		Button button_7 = new Button(this, SWT.NONE);
		button_7.setBounds(75, 309, 397, 25);
		
		Button chooseEnd = new Button(this, SWT.NONE);
		chooseEnd.setBounds(408, 100, 112, 36);
		chooseEnd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {		
					finished = true;
					En = btnCheckButton.getSelection();
					Eu = btnCheckButton_1.getSelection();
					Ch = btnCheckButton_2.getSelection();
					other = btnCheckButton_3.getSelection();
					
					st01 = b01.getSelection();
					st02 = b02.getSelection();
					st03 = b03.getSelection();
					st04 = b04.getSelection();
					st05 = b05.getSelection();
					st06 = b06.getSelection();
					st07 = b07.getSelection();
					st08 = b08.getSelection();
					st09 = b09.getSelection();
					st10 = b10.getSelection();
					st11 = b11.getSelection();

					filter();
					
					button_3.setText(selectedData[pa].name);
					button_4.setText(selectedData[pb].name);
					button_5.setText(selectedData[pc].name);
					button_6.setText(selectedData[pd].name);
					button_7.setText(selectedData[pe].name);

			}
		});
		chooseEnd.setText("\u9078\u64C7\u7D42\u4E86");
		
		Composite composite_2 = new Composite(this, SWT.NONE);
		composite_2.setBounds(329, 340, 191, 55);
		composite_2.setLayout(null);
		
		Button btnBack = new Button(composite_2, SWT.NONE);
		btnBack.setBounds(0, 3, 87, 25);
		btnBack.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(pa>1 && finished == true) {
					button_3.setText(selectedData[pa-=5].name);
					button_4.setText(selectedData[pb-=5].name);
					button_5.setText(selectedData[pc-=5].name);
					button_6.setText(selectedData[pd-=5].name);
					button_7.setText(selectedData[pe-=5].name);
				}
				else {
				}
			}
		});
		btnBack.setText("back");
		
		Button btnNext = new Button(composite_2, SWT.NONE);
		btnNext.setBounds(104, 3, 87, 25);
		btnNext.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(finished == true && (pe+5 <= cnt)) {
					button_3.setText(selectedData[pa+=5].name);
					button_4.setText(selectedData[pb+=5].name);
					button_5.setText(selectedData[pc+=5].name);
					button_6.setText(selectedData[pd+=5].name);
					button_7.setText(selectedData[pe+=5].name);
				}}
		});
		btnNext.setText("next");
		
		

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
