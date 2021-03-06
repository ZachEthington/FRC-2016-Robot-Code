package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CrossDefenseAutoBackwards extends Command {

	private long myTime;
	
	public CrossDefenseAutoBackwards() {
		requires(Robot.getcurrentDrive());
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		//sets current time to varibale myTime
		myTime = System.currentTimeMillis();
		//sets finish time to 3 seconds
		myTime += 4000;
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
		Robot.getcurrentDrive().Arcade(0.75,  0.05);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return System.currentTimeMillis() >= myTime;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		//stops robot at end of exectue method 
		Robot.getcurrentDrive().Arcade(0.0,  0.0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
