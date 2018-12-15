package org.firstinspires.ftc.teamcode.OpModes.Leviathan.Depot;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Control.AutonomousOpMode;
import org.firstinspires.ftc.teamcode.Control.Constants;
import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.Endgame;
import org.firstinspires.ftc.teamcode.Subsystems.Extendo;
import org.firstinspires.ftc.teamcode.Subsystems.GoldFind;
import org.firstinspires.ftc.teamcode.Subsystems.Pivot;

@Autonomous(name = "LeviathanDepot",group = "Depot")
public class LeviathanDepot extends LinearOpMode implements AutonomousOpMode,Constants {
    Hardware robot = new Hardware();
    private GoldFind goldfish;


    public boolean getOpModeIsActive() {
        return opModeIsActive();
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    @Override
    public void runOpMode() {
        robot.setAuto(this, telemetry);

        robot.init(hardwareMap);

        goldfish = new GoldFind(this, robot);
        goldfish.setAlignSettings(ALIGN_POSITION, 1000);

        telemetry.addLine("Instant Run test 3");
        telemetry.update();


        waitForStart();

        goldfish.startOpenCV();

        robot.hookRelease.setPosition(0);

        robot.drop.setPosition(1);

        sleep(1000);

        robot.hookSwivel.setPosition(.75);

        robot.drive.rotateToAbsoluteAngle(60); //doesnt have to be so complicated

        while(getOpModeIsActive()&& !goldfish.isFound()){
            robot.drive.rotate(-.50);
            telemetry.addData("Found: ",goldfish.isFound());
            telemetry.update();
        }

        goldfish.alignGold();

        goldfish.disable();

        robot.drive.driveForwardDistance(30);

        robot.drive.rotateToAbsoluteAngle(-robot.imu.getRelativeYaw());

        robot.intake.setPower(-1);

        sleep(3000);

        robot.intake.setPower(0);

    }

}
