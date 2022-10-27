// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  // Create a field for the motor
  //

  /** Creates a new Motor. */
  public Motor() {
    //
  }

  /** Set the motor to a given speed. */
  public void run(double speed) {
    //
  }

  /** Stop the motor. */
  public void stop() {
    //
  }

  /** Log the motor's percent output to SmartDashboard. */
  public void log() {
    //
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    log();
  }
}
