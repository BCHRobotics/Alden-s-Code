package main.java.frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;

public class RobotTemplate extends SampleRobot {

	DigitalInput limitSwitch;
    public void robotInit() {
    	limitSwitch = new DigitalInput(1);
    }

    public void operatorControl() {
    	// more code here
    	while (limitSwitch.get()) {
    		Timer.delay(10);
    	}
        // more code here
    }
}


public class RobotTemplate extends SampleRobot {
	
	DigitalInput limitSwitch;
	
	public void robotInit() {
		limitSwitch = new DigitalInput(1);
	}
	
	public void operatorControl() {
		// more code here
		while (limitSwitch.get()) {
			Timer.delay(10);
		}
	}
}

public class ArmUp extends CommandBase {
    public ArmUp() {
    }

    protected void initialize() {
        arm.armUp();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return arm.isSwitchSet();
    }

    protected void end() {
        arm.armStop();
    }

    protected void interrupted() {
        end();
    }
}
