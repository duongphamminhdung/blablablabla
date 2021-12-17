// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import static frc.robot.Constants.SUBSYSTEM.*;

public class DriveBase extends SubsystemBase {
  /** Creates a new DriveBase. */
  
  public WPI_TalonSRX rightMaster = new WPI_TalonSRX(RIGHTMOTOR1_ID);
  public WPI_TalonSRX leftMaster = new WPI_TalonSRX(LEFTMOTOR1_ID);
  public  WPI_TalonSRX rightFollow = new WPI_TalonSRX(RIGHTMOTOR2_ID);
  public  WPI_TalonSRX leftFollow = new WPI_TalonSRX(LEFTMOTOR2_ID);
   public DriveBase(){
    rightFollow.follow(rightMaster);
    leftFollow.follow(leftMaster);
    leftMaster.setInverted(true);

   }
  public void drive(double leftdrive, double rightdrive){
        leftMaster.set(leftdrive);
        rightMaster.set(rightdrive);

  }
  private double x;
  private double y;
  private double z;

  public double DistanceL() {
    return leftMaster.getSensorCollection().getQuadraturePosition() / 4096.0;
  }

  public double DistanceR() {
    return rightMaster.getSensorCollection().getQuadraturePosition() / 4096.0;
  }

  @Override
  public void periodic() {
    if (RobotContainer.taycam.getRawAxis(2) > 0.5 && RobotContainer.taycam.getRawAxis(3) > 0.5) {
      drive(RobotContainer.taycam.getRawAxis(1) * 0.8, RobotContainer.taycam.getRawAxis(5) * 0.8);

    } else if (RobotContainer.taycam.getRawAxis(2) > 0.5) {
      drive(RobotContainer.taycam.getRawAxis(1) * 0.2, RobotContainer.taycam.getRawAxis(5) * 01);
    } else if (RobotContainer.taycam.getRawAxis(3) > 0.5) {
      drive(RobotContainer.taycam.getRawAxis(1) * 1, RobotContainer.taycam.getRawAxis(5) * 0.2

      );
    } else {
      drive(RobotContainer.taycam.getRawAxis(1) * 1, RobotContainer.taycam.getRawAxis(5) * 1);
    }
    
  }

}
