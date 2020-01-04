package finalproject;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

public class maintest {

	protected Shell shell;
	private shaishuan shaishuan;
	private introwindow introwindow;
	private command command;
	private Composite composite;
	private Composite composite_1;
	private Button button;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			maintest window = new maintest();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(1293, 772);
		shell.setText("SWT Application");
		shell.setLayout(new GridLayout(1, false));
		
		composite_1 = new Composite(shell, SWT.NONE);
		GridData gd_composite_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_composite_1.widthHint = 753;
		composite_1.setLayoutData(gd_composite_1);
		
		button = new Button(composite_1, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				start();
				shaishuan.reset();
			}
		});
		button.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 16, SWT.BOLD));
		button.setBounds(0, 0, 145, 54);
		button.setText("\u958B\u59CB\u4F7F\u7528");
		
		composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new StackLayout());
		
		command = new command(composite, SWT.NONE);
		command.button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
			}
		});
		shaishuan = new shaishuan(composite, SWT.NONE);
		introwindow = new introwindow(composite, SWT.NONE);
		introwindow.pre.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				start();
				//shaishuan.reset();
				shaishuan.finished = true;
			}
		});

		shaishuan.button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
				introwindow.reset();
			}
		});
		shaishuan.button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
				introwindow.reset();

			}
		});
		shaishuan.button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
				introwindow.reset();

			}
		});
		shaishuan.button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
				introwindow.reset();

			}
		});
		shaishuan.button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
				introwindow.reset();

			}
		});
				
		introwindow.button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Showcom();
			}
		});

	}
	private void start() {
		StackLayout layout= (StackLayout) this.composite.getLayout();
		layout.topControl= shaishuan;
		this.composite.layout();
		shaishuan.finished = false;
	}
	private void Show() {
		if(shaishuan.finished == true) {
			StackLayout layout= (StackLayout) this.composite.getLayout();
			layout.topControl= introwindow;
			this.composite.layout();
		}
	}

	private void Showcom() {
		StackLayout layout= (StackLayout) this.composite.getLayout();
		layout.topControl= this.command;
		this.composite.layout();
	}
}
