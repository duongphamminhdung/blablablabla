// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Stringer;

public class StringUp extends CommandBase {
  /** Creates a new StringUp. */
  private Stringer stringer;

  public StringUp(Stringer m_stringer) {
    stringer = m_stringer;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(stringer);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    stringer.string(0.3);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    stringer.string(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
