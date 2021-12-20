// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

import frc.robot.commands.Drive;
import frc.robot.subsystems.*;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class Autonomous extends SequentialCommandGroup {
  /** Creates a new Autonomous. */
  public Autonomous(DriveBase drivebase) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    super(  new Drive(drivebase, 0.4, 0.4).withTimeout(5), // Drive Straight
            new Drive(drivebase, -0.2, 0.2).withTimeout(1.25), // Turn around (90º)
            new Drive(drivebase, 0.4, 0.4).withTimeout(3) // Drive Straight into middle area
    );
  }
}
