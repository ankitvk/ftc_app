package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Control.Constants;
import org.firstinspires.ftc.teamcode.Control.Toggle;
import org.firstinspires.ftc.teamcode.Hardware.Hardware;

public class Endgame implements Constants {

     Hardware hardware;
     Toggle swivelToggle = new Toggle();

     public Endgame(Hardware hardware){
         this.hardware = hardware;
     }

     public void hookSwivel(Gamepad gamepad){

         if(gamepad.a){
             if(hardware.hookSwivel.getPosition()==.25){
                 hardware.hookSwivel.setPosition(.5);
             }
             else if(hardware.hookSwivel.getPosition()==.5){
                 hardware.hookSwivel.setPosition(.75);
             }
             else{
                 hardware.hookSwivel.setPosition(.25);
             }
         }
     }

     public void hookRelease (Gamepad gamepad){
         if (gamepad.left_bumper && gamepad.right_bumper){
             double hookReleaseStatus = hardware.hookRelease.getPosition();
             if(hookReleaseStatus>.5){
                 hardware.hookRelease.setPosition(0);
             }
             else{
                 hardware.hookRelease.setPosition(1);
             }
         }
     }

     public void winch (Gamepad gamepad){
         if (gamepad.right_trigger>.75){
             hardware.winch.setPower(1);
         }
         else if(gamepad.left_trigger >.75){
             hardware.winch.setPower(-1);
         }
         else{
             hardware.winch.setPower(0);
         }
     }
}
