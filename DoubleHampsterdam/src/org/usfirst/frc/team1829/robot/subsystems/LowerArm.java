package org.usfirst.frc.team1829.robot.subsystems;


import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class LowerArm extends Subsystem {

	private CANTalon moveArm;
	
	
	public LowerArm(){
		moveArm = new CANTalon(5);
		
	}
	
	@Override
	protected void initDefaultCommand() {
		//setDefaultCommand(new DefaultLowerArmCommand());
	}
	//set collector motor speed
	public void set(double speed){
	
	moveArm.set(speed);
	}
	//if sensor reads true we have the ball, otherwise it does not
	//public boolean hasBall() {
		
		//return opticalSensor.get();
	//}
}
