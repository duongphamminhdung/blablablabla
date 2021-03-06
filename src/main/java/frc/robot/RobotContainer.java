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

import frc.robot.commands.Autonomous;
import frc.robot.commands.Grab;
import frc.robot.commands.UnGrab;
import frc.robot.commands.HoldGrab;
import frc.robot.commands.HandUp;
import frc.robot.commands.HandDown;
import frc.robot.commands.StringUp;
import frc.robot.commands.StringDown;

import frc.robot.subsystems.DriveBase;
import frc.robot.subsystems.Grabber;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Stringer;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public static final Joystick taycam = new Joystick(0);
  private final DriveBase drivebase = new DriveBase();
  private final Grabber m_grabber = new Grabber();
  private final Intake m_intake = new Intake();
  public final Stringer m_stringer = new Stringer();


  private final Command m_Autonomous = new Autonomous(drivebase); // Test lenh autonomous
  public final Command grab = new Grab(m_grabber);
  private final Command UnGrab = new UnGrab(m_grabber);
  private final Command HoldGrab = new HoldGrab(m_grabber);
  private final Command handUp = new HandUp(m_intake);
  private final Command handDown = new HandDown(m_intake);
  private final Command stringUp = new StringUp(m_stringer);
  private final Command stringDown = new StringDown(m_stringer);

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

    new JoystickButton(taycam, RB).whileActiveOnce(HoldGrab);
    new JoystickButton(taycam, LB).whileActiveOnce(stringDown);

    new JoystickButton(taycam, Y).whileActiveOnce(handUp);
    new JoystickButton(taycam, A).whileActiveOnce(handDown);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_Autonomous;
  }
}
