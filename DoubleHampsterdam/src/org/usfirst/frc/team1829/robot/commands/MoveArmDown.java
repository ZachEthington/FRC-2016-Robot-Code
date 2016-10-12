package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;
import org.usfirst.frc.team1829.robot.subsystems.LowerArm;

import edu.wpi.first.wpilibj.command.Command;

public class MoveArmDown extends Command {
 	
	private LowerArm myLowerArm;
	
	public MoveArmDown() {
		requires(myLowerArm = Robot.getLowerArm());
		
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		//turns on LowerArm, assume positive sucks in
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		myLowerArm.set(-0.25);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		//myLowerArm.set(0.0);
		myLowerArm.set(0.0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		myLowerArm.set(0.0);
		
	}

}
