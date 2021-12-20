// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBase;

public class Drive extends CommandBase {
  /** Creates a new DriveStraight. */
  private DriveBase m_drivebase;
  private double right;
  private double left;
  
  public Drive(DriveBase drivebase, double RSpeed, double LSpeed) {
    m_drivebase = drivebase;
    right = RSpeed;
    left = LSpeed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drivebase);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
  
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivebase.drive(right, left);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivebase.drive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
