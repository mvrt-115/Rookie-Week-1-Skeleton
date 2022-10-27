// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  private TalonFX motor;

  /** Creates a new Motors. */
  public Motor() {
    motor = new TalonFX(5);
  }

  public void run(double speed) {
    motor.set(ControlMode.PercentOutput, speed);
  }

  public void stop() {
    motor.set(ControlMode.PercentOutput, 0);
  }

  public void log() {
    SmartDashboard.putNumber("Percent Output:", motor.getMotorOutputPercent());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    log();
  }
}
