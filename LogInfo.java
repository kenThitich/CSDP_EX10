public class LogInfo implements LogState{

	private final Log log;
	
	public LogInfo(Log log){
		this.log = log;
	}
	 
	@Override
	public String showLog() {
		return "This is an information.";
	}
}
