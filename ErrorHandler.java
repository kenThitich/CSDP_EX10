public class ErrorHandler extends Handler {
	
	public ErrorHandler(String handlerName){
		super(handlerName);
	}

	@Override
	public void process(Log log) {
		String stateLog = log.showLog();

		if((stateLog.equals("This is an error information."))){
			System.out.println("Error Console::Logger: "+stateLog+" by "+handlerName);
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
