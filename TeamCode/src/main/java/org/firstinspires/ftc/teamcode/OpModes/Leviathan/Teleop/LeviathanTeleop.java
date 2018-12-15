package org.firstinspires.ftc.teamcode.OpModes.Leviathan.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Control.Constants;
import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.Endgame;
import org.firstinspires.ftc.teamcode.Subsystems.Extendo;
import org.firstinspires.ftc.teamcode.Subsystems.Intake;
import org.firstinspires.ftc.teamcode.Subsystems.Pivot;

@TeleOp(name="LeviathanTeleop")
public class LeviathanTeleop extends OpMode implements Constants{

    private Hardware robot = new Hardware();

    private Pivot pivot = new Pivot(robot);
    private Extendo extendo = new Extendo(robot);
    private Intake intake =  new Intake(robot);
    private Drivetrain drivetrain = new Drivetrain(robot);
    private Endgame endgame = new Endgame(robot);

    private boolean resetimu = true;


    public void init(){
        robot.init(hardwareMap);
        robot.hookRelease.setPosition(0);
        //robot.led.setPosition(-.41);
        robot.hookSwivel.setPosition(.75);

    }
    public void loop(){

        drivetrain.drive(gamepad1);
        pivot.driverControl(gamepad2);
        extendo.driverControl(gamepad2);
        intake.intake(gamepad2);
        intake.index(gamepad2);
        endgame.hookRelease(gamepad1);
        endgame.hookSwivel(gamepad1);
        endgame.winch(gamepad1);
        endgame.drop(gamepad1);

        telemetry.addData("Angle: ",robot.imu.getRelativeYaw());
        telemetry.update();

    }
}