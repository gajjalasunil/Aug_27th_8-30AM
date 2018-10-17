package robot_actions;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Robot_mouseActions 
{

	public static void main(String[] args) throws Exception 
	{
		Robot r = new Robot();
		// click Save File 
		r.mouseMove(787, 544); // move to co-ordinate Location
		r.mousePress(InputEvent.BUTTON1_MASK); // Left Mouse click - Press 
		r.mouseRelease(InputEvent.BUTTON1_MASK); // Left Mouse click - Release 
		r.delay(50); // wait for 5 millisecs
		
		
		
		// click ok
		r.mouseMove(1032, 641); // move to co-ordinate Location
		r.mousePress(InputEvent.BUTTON1_MASK); // Left Mouse click - Press
		r.mouseRelease(InputEvent.BUTTON1_MASK); // Left Mouse click - Release

		

	/*	InputEvent.BUTTON1_MASK // Left button
		InputEvent.BUTTON2_MASK // Middle button
		InputEvent.BUTTON3_MASK // Right button
	 */
		
		r.mousePress(InputEvent.BUTTON1_MASK);      //Click
		r.mousePress(InputEvent.BUTTON2_MASK);      //Middle button..
	}

}
