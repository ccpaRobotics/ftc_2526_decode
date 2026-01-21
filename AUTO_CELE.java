package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "AUTO_CELE (Blocks to Java)")
public class AUTO_CELE extends LinearOpMode {

  private DcMotor motor1;

  /**
   * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
   * Comment Blocks show where to place Initialization code (runs once, after touching the
   * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
   * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
   * Stopped).
   */
  @Override
  public void runOpMode() {
    motor1 = hardwareMap.get(DcMotor.class, "motor1");

    // Put initialization blocks here.
    waitForStart();
    motor1.setPower(-1);
    motor1.setDirection(DcMotor.Direction.REVERSE);
    sleep(10000);
    motor1.setPower(0);
  }
}
