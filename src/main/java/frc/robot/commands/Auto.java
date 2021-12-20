// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

// WPILib libraries
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;

// Subsystems
import frc.robot.subsystems.*;
import frc.robot.Constants.SPEED;


// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class Auto extends ParallelCommandGroup {
  /** Creates a new Auto. */
  public Auto(DriveBase drivebase) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    //addCommands(new DriveStraight(drivebase, DRIVE_SPEED).withTimeout(DS1));
  }
}
