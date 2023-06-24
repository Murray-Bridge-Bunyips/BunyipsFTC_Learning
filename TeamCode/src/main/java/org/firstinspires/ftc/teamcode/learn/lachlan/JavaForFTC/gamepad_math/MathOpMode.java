package org.firstinspires.ftc.teamcode.learn.lachlan.JavaForFTC.gamepad_math;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class MathOpMode extends OpMode{

    @Override
    public void init(){

    }

    @Override
    public void loop(){
        double speedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("Left Stick y", gamepad1.left_stick_y);
        telemetry.addData("speed Forward", speedForward);

        // Exercises
        // Add telemetry to show the right stick of gamepad1
        telemetry.addData("Right Stick y", gamepad1.right_stick_x);
        // Add telemetry to show whether the b button is pressed on gamepad1
        telemetry.addData("Gamepad1 B", gamepad1.b);
        // Report to the user the difference between the left joystick y and the right joystick y on gamepad1
        telemetry.addData("Left Stick Y is ", String.valueOf(gamepad1.left_stick_y), ", while Right Stick Y is ", String.valueOf(gamepad1.right_stick_y));
        // TODO: Report to the user the sum of the left and right triggers on gamepad1
    }
}
