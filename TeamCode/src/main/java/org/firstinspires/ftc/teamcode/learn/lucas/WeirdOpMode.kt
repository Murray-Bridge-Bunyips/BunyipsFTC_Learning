package org.firstinspires.ftc.teamcode.learn.lucas

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode

class WeirdOpMode : LinearOpMode() {
    override fun runOpMode() {
        for (i in 0..100) {
            telemetry.addData("dementia", "dementia")
        }
        telemetry.update()
        waitForStart()
        while (opModeIsActive());
    }
}