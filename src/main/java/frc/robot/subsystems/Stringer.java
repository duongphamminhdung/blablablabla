// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import static frc.robot.Constants.SUBSYSTEM.*;
import static frc.robot.Constants.SPEED.*;
import frc.robot.RobotContainer;

public class Stringer extends SubsystemBase {
  /** Creates a new Stringer. */
  public WPI_VictorSPX Stringer = new WPI_VictorSPX(STRINGER_ID);

  public Stringer() {}

  public void string(double strength){
    Stringer.set(strength);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    int direction = RobotContainer.taycam.getPOV();

    if(direction == 90){
      string(STRING_SPEED);
    } else if(direction == 270){
      string(-STRING_SPEED);
    } else {
      string(0);
    }
  }
}
