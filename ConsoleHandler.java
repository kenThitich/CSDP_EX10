public class ConsoleHandler extends Handler {
	
	public ConsoleHandler(String handlerName){
		super(handlerName);
	}

	@Override
	public void process(Log log) {
		String stateLog = log.showLog();

		if(!(stateLog.equals(""))){
			System.out.println("Standard Console::Logger: "+ stateLog+" by "+handlerName);
		}

		if(next!=null){
			next.process(log);
		}
		else if(next==null){
		}
		else{
			System.out.println("log not supported");
		}
		
	}
}
