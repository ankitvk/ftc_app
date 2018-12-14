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
        robot.hookRelease.setPosition(1);
        //robot.led.setPosition(-.41);
        robot.hookSwivel.setPosition(.75);

    }
    public void loop(){
        if(resetimu){
            robot.imu.reset();
            resetimu = !resetimu;

        }
        drivetrain.drive(gamepad1);
        pivot.driverControl(gamepad1);
        extendo.driverControl(gamepad1);
        intake.intake(gamepad1);
        intake.index(gamepad1);
        endgame.hookRelease(gamepad2);
        endgame.hookSwivel(gamepad2);
        endgame.winch(gamepad2);

        if(gamepad2.x){
            robot.drop.setPosition(0);
        }
        else if(gamepad2.y){
            robot.drop.setPosition(1);
        }
        /*telemetry.addData("index: ",robot.index.getPosition());
        telemetry.addData("intake: ",robot.intake.getPower());*/
        telemetry.addData("Yaw: ",robot.imu.getAngles()[0]);
        telemetry.addData("Pitch: ",robot.imu.getPitch());
        telemetry.addData("Roll: ",robot.imu.getRoll());

        telemetry.update();

    }
}