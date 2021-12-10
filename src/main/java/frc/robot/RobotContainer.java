// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import static frc.robot.Constants.JOYSTICK.*;
import static frc.robot.Constants.SPEED.*;
import static frc.robot.Constants.*;

import frc.robot.commands.Auto;
import frc.robot.commands.Grab;
import frc.robot.commands.DriveStraight;
import frc.robot.commands.RotateToAngle;
import frc.robot.commands.Rotate;
import frc.robot.commands.HandUp;
import frc.robot.commands.HandDown;

import frc.robot.subsystems.DriveBase;
import frc.robot.subsystems.Grabber;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.TurnController;
import frc.robot.subsystems.Gyro;
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public static final Joystick taycam = new Joystick(Y);
  private final DriveBase drivebase = new DriveBase();
  private final Grabber m_grabber = new Grabber();
  private final TurnController m_tcontroller = new TurnController();
  private final Gyro m_gyro = new Gyro();
  private final Intake m_intake = new Intake();

  private final Command drivestraight = new DriveStraight(drivebase, DRIVE_SPEED);
  private final Command drivesbackward = new DriveStraight(drivebase, (-1)*DRIVE_SPEED);

  private final Command m_Auto = new Auto(drivebase);
  private final Command grab = new Grab(m_grabber);
  private final Command rotate = new RotateToAngle(drivebase ,m_gyro.getYaw());
  private final Command rotateRight = new Rotate(drivebase, DRIVE_SPEED);
  private final Command rotateLeft = new Rotate(drivebase, DRIVE_SPEED*(-1));
  private final Command handUp = new HandUp(m_intake);
  private final Command handDown = new HandDown(m_intake);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    new JoystickButton(taycam, G).whenActive(grab.withTimeout(GRAB_TIME)); 
    new JoystickButton(taycam, W).whenActive(drivestraight);
    new JoystickButton(taycam, S).whenActive(drivesbackward);
    new JoystickButton(taycam, A).whenActive(rotateLeft);
    new JoystickButton(taycam, D).whenActive(rotateRight);
    new JoystickButton(taycam, HU).whenActive(handUp.withTimeout(TRONGMINH));
    new JoystickButton(taycam, HD).whenActive(handDown.withTimeout(TRONGMINH));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_Auto;
  }
}
