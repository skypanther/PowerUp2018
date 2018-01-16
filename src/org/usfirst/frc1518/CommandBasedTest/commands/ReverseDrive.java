// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1518.CommandBasedTest.commands;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

import org.usfirst.frc1518.CommandBasedTest.OI;
import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;
import org.usfirst.frc1518.CommandBasedTest.subsystems.DriveTrain;

/**
 *
 */
public class ReverseDrive extends InstantCommand {
	public ReverseDrive() 

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    {
    	

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//isReversed = false;
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.isReversed == false) {
        	//RobotMap.driveTrainFrontLeftWheel.setInverted(true);
        	//RobotMap.driveTrainFrontRightWheel.setInverted(true);
        	//RobotMap.driveTrainRearLeftWheel.setInverted(true);
        	//RobotMap.driveTrainRearRightWheel.setInverted(true);
    		Robot.isReversed = true;
    		//RobotMap.pwmIntake.set(-0.8);
    		//Robot.intakeOn = true;
    		}
    	
    	else {
        	//RobotMap.driveTrainFrontLeftWheel.setInverted(false);
        	//RobotMap.driveTrainFrontRightWheel.setInverted(false);
        	//RobotMap.driveTrainRearLeftWheel.setInverted(false);
        	//RobotMap.driveTrainRearRightWheel.setInverted(false);
    		Robot.isReversed = false;
    		//RobotMap.pwmIntake.set(-0.8);
    		//Robot.intakeOn = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}