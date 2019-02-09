package main.java.frc.robot.subsystems;

public class Robot extends TimedRobot {



    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
        int i = 1;
        autonomousCommand = new RobotToRocket(i);
    }
{
    m_auto.gyro(144,5,.35,2);
    m_auto.encoder(125,4,.35,2);

    }    
    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }
}