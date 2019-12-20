package finalproject;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FillLayout;

public class maintest {

	protected Shell shell;
	public static shaishuan shaishuan;
	public static introwindow introwindow;
	public static command command;

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
		shell.setLayout(null);
		
		introwindow = new introwindow(shell, SWT.NONE);
		introwindow.setBounds(0, 0, 1277, 733);
		
		shaishuan = new shaishuan(shell, SWT.NONE);
		shaishuan.setBounds(0, 0, 1277, 733);
		
		command = new command(shell, SWT.NONE);
		command.setBounds(0, 0, 1277, 733);

	}
	public  static void Show1() {
		StackLayout layout= (StackLayout) shaishuan.getLayout();
		layout.topControl= shaishuan.button;
		shaishuan.layout();
	}
	public  static void Show2() {
		StackLayout layout= (StackLayout) shaishuan.getLayout();
		layout.topControl= shaishuan.button_1;
		shaishuan.layout();
	}
	public  static void Show3() {
		StackLayout layout= (StackLayout) shaishuan.getLayout();
		layout.topControl= shaishuan.button_2;
		shaishuan.layout();
	}
	public  static void Show4() {
		StackLayout layout= (StackLayout) shaishuan.getLayout();
		layout.topControl= shaishuan.button_3;
		shaishuan.layout();
	}
	public  static void Show5() {
		StackLayout layout= (StackLayout) shaishuan.getLayout();
		layout.topControl= shaishuan.button_4;
		shaishuan.layout();
	}
	public  static void Showcom() {
		StackLayout layout= (StackLayout) introwindow.getLayout();
		layout.topControl= introwindow.button_1;
		introwindow.layout();
	}
}
