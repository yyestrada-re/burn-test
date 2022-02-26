// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  private final WPI_TalonFX upperLeftMotor = new WPI_TalonFX(Constants.DriveConstants.UPPER_LEFT_MOTOR);
  private final WPI_TalonFX lowerLeftMotor = new WPI_TalonFX(Constants.DriveConstants.LOWER_LEFT_MOTOR);

  private final WPI_TalonFX upperRightMotor = new WPI_TalonFX(Constants.DriveConstants.UPPER_RIGHT_MOTOR);
  private final WPI_TalonFX lowerRightMotor = new WPI_TalonFX(Constants.DriveConstants.LOWER_RIGHT_MOTOR);
  
  private double targetRotations = 10 * 2048;

  private double rawLowerLeftUnits = 0;
  private double rawUpperLeftUnits = 0;

  private double rawLowerRightUnits = 0;
  private double rawUpperRightUnits = 0;

  public Drivetrain() {
    //this.upperLeftMotor.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
    //this.lowerLeftMotor.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
    //this.upperRightMotor.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
    //this.lowerRightMotor.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);

    upperLeftMotor.setSelectedSensorPosition(0); // reset
    lowerLeftMotor.setSelectedSensorPosition(0); // reset
    upperRightMotor.setSelectedSensorPosition(0); // reset
    lowerRightMotor.setSelectedSensorPosition(0); 
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void move() {
    //lower left bad >:(
    // ^^upper left worse :|
    SmartDashboard.putNumber("Target Pos", targetRotations);

    
    //UPPER LEFT
    rawUpperLeftUnits = upperLeftMotor.getSelectedSensorPosition();
    SmartDashboard.putNumber("Enc Upper Left", rawUpperLeftUnits);

    if(rawUpperLeftUnits < targetRotations) {
      upperLeftMotor.set(0.3);
      lowerLeftMotor.set(0.3);
    }
    else {
      upperLeftMotor.set(0);
      lowerLeftMotor.set(0);
    }
    

    /*
    upperLeftMotor.set(0.2);
    upperRightMotor.setInverted(true);
    upperRightMotor.set(0.2);
    */

    // LOWER LEFT
    /*
    rawLowerLeftUnits = lowerLeftMotor.getSelectedSensorPosition();
    SmartDashboard.putNumber("Enc Lower Left", rawLowerLeftUnits);

    if(rawLowerLeftUnits <= targetRotations) {
      lowerLeftMotor.set(0.3);
    }
    else {
      lowerLeftMotor.set(0);
    }
    */

    // UPPER RIGHT
    /*
    
    rawUpperRightUnits = upperRightMotor.getSelectedSensorPosition();
    SmartDashboard.putNumber("Enc Upper Right", rawUpperRightUnits);

    if(rawUpperRightUnits <= targetRotations) {
      upperRightMotor.set(0.3);
      lowerRightMotor.set(0.3);
    }
    else {
      upperRightMotor.set(0);
      lowerRightMotor.set(0);
    }
    */
    

    // LOWER RIGHT
    /*
    rawLowerRightUnits = lowerRightMotor.getSelectedSensorPosition();
    SmartDashboard.putNumber("Enc Lower Right", rawLowerRightUnits);

    if(rawLowerRightUnits <= targetRotations) {
      lowerRightMotor.set(0.3);
    }
    else {
      lowerRightMotor.set(0);
    }
    */

    /*
    upperLeftMotor.set(TalonFXControlMode.Position,targetRotations);
    lowerLeftMotor.set(TalonFXControlMode.Position, targetRotations);
  
    upperRightMotor.set(TalonFXControlMode.Position, targetRotations);
    lowerRightMotor.set(TalonFXControlMode.Position, targetRotations);
    */
    
    // potential issue with upper left = too fast/loose
  }
}
