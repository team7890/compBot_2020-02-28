/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Feeder;

import frc.robot.Constants.kFixedSpeeds;

public class FeedLauncher extends CommandBase {
  Feeder objFeeder;
  /**
   * Creates a new FeedLauncher.
   */
  public FeedLauncher(Feeder objFeederIn) {
    objFeeder = objFeederIn;
    addRequirements(objFeeder);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    objFeeder.setFeedSpeed(kFixedSpeeds.dFeedWheel);
    objFeeder.setIndexerSpeed(kFixedSpeeds.dIndexer);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    objFeeder.setFeedSpeed(0.0);
    objFeeder.setIndexerSpeed(0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
