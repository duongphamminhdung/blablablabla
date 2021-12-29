// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

import frc.robot.commands.Drive;
import frc.robot.commands.RotateToAngle;
import frc.robot.subsystems.*;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class Autonomous extends SequentialCommandGroup {
  /** Creates a new Autonomous. */
  public Autonomous(DriveBase drivebase) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
  super(  
          new Drive(drivebase, -0.4, -0.37).withTimeout(4), // Drive Straight
          new RotateToAngle(drivebase, 37), // Turn around (40º)
          new Drive(drivebase, -0.6, -0.6).withTimeout(6)// Drive Straight into middle area 
  );
  }
}
