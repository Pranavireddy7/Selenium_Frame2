package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class ListenersImplements implements ITestListener{
		@Override
		public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts = (TakesScreenshot)BaseTest.listernersDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshot/"+result.getName()+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
}
