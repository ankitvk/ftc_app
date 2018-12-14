package org.firstinspires.ftc.teamcode.OpModes.Leviathan.Crater;

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

@Autonomous(name = "LeviathanCrater",group = "Crater")
public class LeviathanCrater extends LinearOpMode implements AutonomousOpMode,Constants {
    Hardware robot = new Hardware();

    private Pivot pivot = new Pivot(robot);
    private Extendo extendo = new Extendo(robot);
    //private Intake intake =  new Intake(robot);
    private Drivetrain drivetrain = new Drivetrain(robot);
    private GoldFind goldfish = new GoldFind(this,robot);


    public boolean getOpModeIsActive() {
        return opModeIsActive();
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    @Override
    public void runOpMode() {

        robot.setAuto(this, telemetry);

        goldfish.setAlignSettings(ALIGN_POSITION, 1000);
        robot.init(hardwareMap);

        double goldPos = 0;

        waitForStart();

        //goldfish.startOpenCV(hardwareMap);

        robot.drop.setPosition(1);

    }

}
