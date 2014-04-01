package org.harry;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class KK {
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		new JJJ(shell).open();
		while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
	}
}
