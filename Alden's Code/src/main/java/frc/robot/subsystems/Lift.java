package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.Spark;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Lift extends Subsystem{

    //Init talonSRX
    Spark SPARKLIFT = new Spark(RobotMap.SPARKLIFT);

    public Lift(){

        SPARKLIFT.configOpenloopRamp(1);

    }

    //Function that actuate the lift
    public void MoveLift(double liftSpeed){

        SPARKLIFT.set(ControlMode.PercentOutput, liftSpeed);

    }

    @Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		//setDefaultCommand(new DriveArcade());
	}

}