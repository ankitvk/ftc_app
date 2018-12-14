package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Control.Constants;
import org.firstinspires.ftc.teamcode.Hardware.Hardware;

public class Intake implements Constants {

    Hardware hardware;

    private boolean forwardCurrState;
    private boolean forwardPreviousState;
    private boolean spinningForward;

    private boolean backwardCurrState;
    private boolean backwardPreviousState;
    private boolean spinningBackward;


    public Intake(Hardware hardware){
        this.hardware = hardware;
    }

    public void intake(Gamepad gamepad){
        if(gamepad.a){
            hardware.intake.setPower(-.5);
        }
        else if(gamepad.b){
            hardware.intake.setPower(.5);
        }
        else{
            hardware.intake.setPower(0);
        }

        /*if (gamepad.a) {
            forwardCurrState = true;
        }
        else {
            forwardCurrState = false;
            if (forwardPreviousState) {
                spinningForward = !spinningForward;
            }
        }
        forwardPreviousState = forwardCurrState;

        if (gamepad.b){
            backwardCurrState = true;
        }
        else {
            backwardCurrState = false;
            if (backwardPreviousState) {
                spinningBackward = !spinningBackward;
            }
        }
        backwardPreviousState = backwardCurrState;

        if(spinningForward){
            hardware.intake.setPower(.5);
        }
        else if(spinningBackward){
            hardware.intake.setPower(-.5);
        }
        else{
            hardware.intake.setPower(0);
        }*/

    }



    public void index(Gamepad gamepad){
        if(gamepad.x){
            hardware.index.setPosition(.75);
        }
        else if(gamepad.y){
            hardware.index.setPosition(.35);
        }
    }
}
