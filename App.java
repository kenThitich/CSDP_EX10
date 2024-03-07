public class App {

	public static void main(String[] args) {
		Log log = null;
		
		Handler errorHandler = new ErrorHandler("Error Handler");
		Handler fileHandler = new FileHandler("File Handler");
		Handler consoleHandler = new ConsoleHandler("Console Handler");

		errorHandler.setHandler(fileHandler);
		fileHandler.setHandler(consoleHandler);

		System.out.println("---------------------------------");
		
		log = new Log();
		errorHandler.process(log);
		System.out.println("---------------------------------");

		log.setLogState(new LogDebug(log));
		errorHandler.process(log);
		System.out.println("---------------------------------");

		log.setLogState(new LogError(log));
		errorHandler.process(log);
		System.out.println("---------------------------------");
	}

}
