package finalproject;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;

public class maintest {

	protected Shell shell;
	private shaishuan shaishuan;
	private introwindow introwindow;
	private command command;
	private Composite composite;

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
		shell.setLayout(new StackLayout());
		
		composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new StackLayout());
		
		command = new command(composite, SWT.NONE);
		
		shaishuan = new shaishuan(composite, SWT.NONE);
		shaishuan.button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
			}
		});
		shaishuan.button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
			}
		});
		shaishuan.button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
			}
		});
		shaishuan.button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
			}
		});
		shaishuan.button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Show();
			}
		});
				
		introwindow = new introwindow(composite, SWT.NONE);
		introwindow.button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Showcom();
			}
		});

	}
	private void Show() {
		StackLayout layout= (StackLayout) this.composite.getLayout();
		layout.topControl= introwindow;
		this.composite.layout();
	}

	private void Showcom() {
		StackLayout layout= (StackLayout) this.composite.getLayout();
		layout.topControl= this.command;
		this.composite.layout();
	}
}
