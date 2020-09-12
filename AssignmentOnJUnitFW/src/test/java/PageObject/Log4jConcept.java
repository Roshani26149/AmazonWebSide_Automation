package PageObject;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.junit.Before;

import junit.framework.TestCase;

public class Log4jConcept  {
	private static Logger log=Logger.getLogger(TestCase.class);


	{
		Layout layout =new SimpleLayout();
		Appender app=new ConsoleAppender(layout);	

		log.addAppender(app);
        log.debug("FROM DEBUG");
		log.info("FROM INFO");
		log.fatal("FROM FATAL");
		log.error("FROM ERROR ");
		log.warn("FROM WARN"); 


	}
}
