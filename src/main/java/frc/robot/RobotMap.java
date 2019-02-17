/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static int turretEncoder = 1;
  public static int turretMotorOne = 10;
  public static int limitSwitch1 = 3;
  public static int limitSwitch2 = 4;
  public static int slideEncoder = 5;
  public static int limitSwitch3 = 6;
  public static int limitSwitch4 = 7;
  public static int intakeMotor = 6;
  public static int intakeEncoder1 = 9;
  public static int elevatorMotor = 5;
  public static int elavatorEncoder = 11;
  public static int intakemotor2 = 7;
  public static int intakeEncoder2 = 13;
  public static final int SolenoidOne[] = {0, 1};
  public static final int SolenoidTwo[] = {2, 3};
  public static final int SolenoidThree[] = {4, 5};
  public static final int frontLeftCIM = 4;
  public static final int frontRightCIM = 5;
  public static final int backLeftCIM = 2;
  public static final int backRightCIM = 1;
}
