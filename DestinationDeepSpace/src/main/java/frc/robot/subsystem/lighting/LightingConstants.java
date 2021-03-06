/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem.lighting;

/**
 * Add your docs here.
 */
public class LightingConstants {
	
	// Current baud rate of the BucketLights board
	public static int BAUDRATE = 38400;

	// Maximum time to search for lighting board before giving up
	public static long POLLING_TIMEOUT_MSEC = 20000; // 20 seconds
	
    public enum LightingObjects
	{
		// Currently planning on lighting on these controls
		FRONT_CAMERA(0),
		BACK_CAMERA(1);
		// RESERVED 2 - 9
		
		private int value;
		
		LightingObjects(int value)
		{
			this.value = value;
		}
		
		public int getValue() { return value; }
	};	
}
