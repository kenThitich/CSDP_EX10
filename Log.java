//public class Robot implements RoboticState{
public class Log {	
	
	private LogState state;
	
	public Log(){
		state = new LogInfo(this);
	}
	
	public void setLogState(LogState state){
		this.state = state;
	}
	
	public String showLog() {
		return state.showLog();
	}

	/*public LogState getLogDebug() {
		return logDebug;
	}

	public void setLogDebug(LogState logDebug) {
		this.logDebug = logDebug;
	}

	public LogState getLogError() {
		return logError;
	}

	public void setLogError(LogState logError) {
		this.logError = logError;
	}

	public LogState getLogInfo() {
		return logInfo;
	}

	public void setLogInfo(LogState logInfo) {
		this.logInfo = logInfo;
	}*/

	public LogState getState() {
		return state;
	}

}
