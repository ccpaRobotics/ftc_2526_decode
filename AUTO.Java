package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "AUTO_CELE2 (Blocks to Java)")
public class AUTO_CELE2 extends LinearOpMode {

  private DcMotor FrontFlywheel;
  private DcMotor LeftFlywheel;
  private DcMotor RightFlywheel;

  /**
   * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
   * Comment Blocks show where to place Initialization code (runs once, after touching the
   * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
   * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
   * Stopped).
   */
  @Override
  public void runOpMode() {
    FrontFlywheel = hardwareMap.get(DcMotor.class, "FrontFlywheel");
    LeftFlywheel = hardwareMap.get(DcMotor.class, "LeftFlywheel");
    RightFlywheel = hardwareMap.get(DcMotor.class, "RightFlywheel");

    // Put initialization blocks here.
    waitForStart();
    FrontFlywheel.setPower(-1);
    LeftFlywheel.setPower(-1);
    RightFlywheel.setPower(1);
    sleep(10000);
    FrontFlywheel.setPower(0);
    LeftFlywheel.setPower(0);
    RightFlywheel.setPower(1);
  }
}
