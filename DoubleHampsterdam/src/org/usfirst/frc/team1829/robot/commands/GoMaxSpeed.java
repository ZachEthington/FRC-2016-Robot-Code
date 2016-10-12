package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class GoMaxSpeed extends Command {
 	
	
	
	public GoMaxSpeed() {
		requires(Robot.getcurrentDrive());
		
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		//turns on OperateJoystick, assume positive sucks in
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.getcurrentDrive().Arcade(1.0, 1.0);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		//myOperateJoystick.set(0.0);
		Robot.getcurrentDrive().Arcade(0.0, 0.0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.getcurrentDrive().Arcade(0.0, 0.0);
		
	}

}
