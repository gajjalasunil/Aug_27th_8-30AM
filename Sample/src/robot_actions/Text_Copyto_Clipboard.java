package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Text_Copyto_Clipboard 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for repository class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		String text="Selenium has the support of some of the largest "
				+ "browser vendors who have taken (or are taking) steps "
				+ "to make Selenium a native part of their browser. "
				+ "It is also the core technology in countless "
				+ "other browser automation tools, APIs and frameworks.";
		
		//Select String
		StringSelection stext=new StringSelection(text);
		//Get Default toolkit
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		//set content to clipboard
		clip.setContents(stext, stext);
		
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		
		
		//Save file using ctrl+S
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
				
				
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		
		
		//Type Filename
		String filename="selenium_homepage";
		StringSelection stext1=new StringSelection(filename);
		clip.setContents(stext1, stext1);
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		

	}

}
