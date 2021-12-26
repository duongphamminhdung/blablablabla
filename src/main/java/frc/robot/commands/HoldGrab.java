// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Grabber;

public class HoldGrab extends CommandBase {
  /** Creates a new HoldGrab. */
  private Grabber grabber;

  public HoldGrab(Grabber m_grabber) {
    grabber = m_grabber;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_grabber);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      grabber.grab(-0.15);
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
