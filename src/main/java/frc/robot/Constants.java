// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
   public static final class SUBSYSTEM{
      public static final int RIGHTMOTOR1_ID = 1;
      public static final int RIGHTMOTOR2_ID = 2;
      public static final int LEFTMOTOR1_ID = 3;
      public static final int LEFTMOTOR2_ID = 4;
      public static final int SUCKER_ID = 5;
      public static final int OPENER_ID = 6;
      public static final int GRABBER_ID = 10;
      public static final int STRINGER_ID = 11;
      public static final int INTAKE_ID = 12;
   }
   public static final class JOYSTICK{
      public static final int Y = 4;
      public static final int A = 1;
      public static final int X = 3;
      public static final int B = 2;

      public static final int L = 1;
      public static final int R = 5;
      public static final int LT = 2;
      public static final int RT = 3;
      public static final int LB = 5;
      public static final int RB = 6;

      public static final int START = 7;
      public static final int BACK = 8;
   }
   public static final class PID {
      public static final double kP = 0.01;
      public static final double kI = 0.008;
      public static final double kD = 0.005;

      public static final double kToleranceDegrees = 2.0;
      public static final double kToleranceAngularVelocity = 0.075;
      
   }
    public static final class SPEED {
      public static final double GRAB_SPEED = 0.3;
      public static final double INTAKE_SPEED = 0.2;
      public static final double DRIVE_SPEED = 0.4;
      public static final double DRIVE_SPEED_AUTO = 0.2;
      public static final double STRING_SPEED = 0.3;
    }
    private static final double omega = 5.330/60;
    public static final double GRAB_TIME = (omega/4)/SPEED.GRAB_SPEED;
    public static final double TRONGMINH = (omega/4)/SPEED.INTAKE_SPEED;
    //public static final double DS1 = ((omega*omega/radius))/SPEED.DRIVE_SPEED;
   }
    

