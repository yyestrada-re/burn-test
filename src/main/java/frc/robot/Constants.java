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
    public static final class DriveConstants {
        // left motor ports
        public static final int UPPER_LEFT_MOTOR = 10;
        public static final int LOWER_LEFT_MOTOR = 7;

        // right motor ports
        public static final int UPPER_RIGHT_MOTOR = 9;
        public static final int LOWER_RIGHT_MOTOR = 8;

        // joystick ports
        public static final int DRIVE_CONTROLLER = 0;

        // max output
        public static final double MAX_OUTPUT = 0.75;
    }
}
