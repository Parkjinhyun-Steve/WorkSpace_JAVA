package logTest;

import java.util.logging.Logger;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.PatternLayout;

public class LoggingSample1 {
	public void initlogging() {
		//주요 컴포넌트 생성
		Logger logger = logger.getLogger(LoggingSample1.class);
		DailyRollingFileAppender appender = new DailyRollingFileAppender();
		PatternLayout layout = new PatternLayout();
		
		//Layout 객체 설정
		String layoutPattern="[%d{yyyy/MM/dd HH:mm:ss}] %Sp $c %M : %m%n";
		
		
		//
		String failPath = "C:/DEV/LogTest.log";
		String datePattern = "'.'yyyy-MM-dd";
		appender.setName("TestAppender");
		appender.setFile(filePath);
		appender.setDatePattern(datePattern);
		appender.setBufferSize(1024);
		appender.activateOptions();
				
		//
		logger.addAppender(appender);
		
		//
		logger.debug("log for debugging");
		logger.info("log for info ");
		logger.warn("log for warn");
		logger.error("log for error");
		logger.fatal("log for fatal");
		
	}
	

}
