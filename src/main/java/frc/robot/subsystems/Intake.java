// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import static frc.robot.Constants.SUBSYSTEM.*;
import static frc.robot.Constants.SPEED.*;

public class Intake extends SubsystemBase {
  /** Creates a new Grabber. */
  public WPI_TalonSRX Intake = new WPI_TalonSRX(INTAKE_ID);

  public Intake() {
    
  }

  public void handUp(){
    double speedu = INTAKE_SPEED;
    Intake.set(speedu);
  }

  public void handDown(){
    Intake.set(INTAKE_SPEED*(-1));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
