package org.firstinspires.ftc.teamcode.learn.lachlan.JavaForFTC.decisions;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// Make a “turbo button”. When gamepad1.a is not pressed, multiply the joystick by 0.5.
// When it is pressed multiply by 1 and report to the user as Forward Speed

@TeleOp()
public class TurboButtonOpMode extends OpMode {

    @Override
    public void init(){

    }

    @Override
    public void loop(){
        if (gamepad1.a){
            telemetry.addData("Left Stick Y Speed: ", gamepad1.left_stick_y * 1);
            telemetry.addData("Left Stick X Speed: ", gamepad1.left_stick_x * 1);
        }
        else{
            telemetry.addData("Left Stick Y Speed: ", gamepad1.left_stick_y * 0.5);
            telemetry.addData("Left Stick X Speed: ", gamepad1.left_stick_x * 0.5);
        }
    }
}
