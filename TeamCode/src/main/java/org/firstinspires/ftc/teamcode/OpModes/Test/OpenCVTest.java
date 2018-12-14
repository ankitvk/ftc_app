package org.firstinspires.ftc.teamcode.OpModes.Test;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Control.AutonomousOpMode;
import org.firstinspires.ftc.teamcode.Control.Constants;
import org.firstinspires.ftc.teamcode.Hardware.Hardware;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.GoldFind;

@Autonomous(name = "OpenCVTest",group = "Depot")
public class OpenCVTest extends LinearOpMode implements AutonomousOpMode,Constants {

    Hardware robot = new Hardware();

    public boolean getOpModeIsActive() {
        return opModeIsActive();
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    @Override
    public void runOpMode() {

        robot.setAuto(this, telemetry);

        GoldFind goldfish = new GoldFind(this, robot);
        goldfish.setAlignSettings(ALIGN_POSITION, 1000);
        robot.init(hardwareMap);
        //start opencv

        waitForStart();

        goldfish.startOpenCV(hardwareMap);

        while(getOpModeIsActive()){
            telemetry.addData("Found: ",goldfish.isFound());
            telemetry.update();
        }
    }
}
