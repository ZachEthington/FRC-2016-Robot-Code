package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;
import org.usfirst.frc.team1829.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.Command;

public class OperateJoystick extends Command{
	
	private Drive myDrive;
	private LowerArm myLowerArm;
	//constructor for command instance
	public OperateJoystick() {
		requires (myDrive = Robot.getcurrentDrive());
		requires (myLowerArm = Robot.getLowerArm());
	}
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		myDrive.arcade(Robot.myJoystick.getY() * Robot.getSensitivity(), Robot.myJoystick.getX() * Robot.getSensitivity());
		myLowerArm.arcade(Robot.myJoystick.getY() * Robot.getSensitivity(), Robot.myJoystick.getX() * Robot.getSensitivity());

	
	}
			
			
	

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		myDrive.arcade(0.0, 0.0);
		myLowerArm.armArcade(0.0, 0.0);
	}

	@Override
	protected void interrupted() {
		myDrive.arcade(0.0, 0.0);
		myLowerArm.armArcade(0.0, 0.0);

	}

}
