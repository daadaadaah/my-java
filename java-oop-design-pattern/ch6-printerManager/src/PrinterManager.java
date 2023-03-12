import java.util.ArrayList;
import java.util.Iterator;




public class PrinterManager {
	private static PrinterManager mgr=null;
	private ArrayList<Printer> managedPrinters = new ArrayList<Printer>();

	private PrinterManager() {
		managedPrinters.add(new Printer());
		managedPrinters.add(new Printer());
		managedPrinters.add(new Printer());
	}
	
	public synchronized static PrinterManager getPrinterManger() {
		if (mgr == null) {
			mgr = new PrinterManager();
		}
		return mgr;
	}

	public synchronized Printer getPrinter() {	
		while (true) {
			for (Printer printer:managedPrinters) {
				if (printer.isAvailable()) {
					printer.setAvailable(false);
					return printer;
				}
			}
		}
	}
}