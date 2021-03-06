package p367_3;

import java.util.ArrayList;


public class PrinterManager {

	private ArrayList<Printer> managedPrinters=new ArrayList<Printer>();
	private static PrinterManager mgr=null;

	public PrinterManager() {
		managedPrinters.add(new Printer());  //  익명
		managedPrinters.add(new Printer());  //  익명
		managedPrinters.add(new Printer());  //  익명
		
	}
	
	public static synchronized PrinterManager getPrinterManager() {
		if(mgr==null) {
			mgr=new PrinterManager();			
		}
		return mgr;
		
	}	
	
	public synchronized Printer getPrinter() {
		while(true) {
			for(Printer printer:managedPrinters) {
				if(printer.isAvailable()) {
					printer.setAvailable(false);
					return printer;
				}		
				
				
			}
		}
		
	}
	
}