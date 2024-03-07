public class LogDebug implements LogState{

	private final Log log;
	
	public LogDebug(Log log){
		this.log = log;
	}
	 
	@Override
	public String showLog() {
		return "This is a debug information.";
	}
}
