// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Grabber;
import frc.robot.Constants.JOYSTICK.*;

public class UnGrab extends CommandBase {
  /** Creates a new UnGrab. */
  private Grabber grabber;

  public UnGrab(Grabber m_grabber ) {
    // Use addRequirements() here to declare subsystem dependencies.
    grabber = m_grabber;
    addRequirements(grabber);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize(){
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(RobotContainer.taycam.getRawAxis(2) > 0.5){
      grabber.grab(-0.8);
    } else {
      grabber.grab(-0.4);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    grabber.grab(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
