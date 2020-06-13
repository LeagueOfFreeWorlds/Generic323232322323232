/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

// packages
import edu.wpi.first.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;
//

/**
 * Add your docs here.
 */
public class JoystUtil {
    
    public static double driveCenter(double steer1, double steer2){
        double centerRadius = 0.09; // I'm not entirely sure what this means yet...
        double avgSteer = (steer1 + steer2) / 2.0; // Taking the average of the two steering vectors
        if(Constants.TEST_VERSION)
            SmartDashboard.putNumber("avgSteer", avgSteer);
        double r = centerRadius / 2.0; 

        

    }
}
