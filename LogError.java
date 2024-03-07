public class LogError implements LogState{

	private final Log log;
	
	public LogError(Log log){
		this.log = log;
	}
	 
	@Override
	public String showLog() {
		return "This is an error information.";
	}
}
