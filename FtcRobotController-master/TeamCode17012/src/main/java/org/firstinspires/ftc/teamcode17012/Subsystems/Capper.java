package org.firstinspires.ftc.teamcode17012.Subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Capper {

    private Servo horizontalServo, verticalServo;
    private CRServo extenderServo;

    public Capper(HardwareMap hardwareMap, Telemetry telemetry){

        horizontalServo = hardwareMap.get(Servo.class, "horizontalServo");
        verticalServo = hardwareMap.get(Servo.class, "verticalServo");
        extenderServo = hardwareMap.get(CRServo.class, "extenderServo");

     }

     public void setPowerOfExtenderServo(double power){
        extenderServo.setPower(power);
     }
     public void setOrientation(double vertical, double horizontal){
        horizontalServo.setPosition(horizontal);
        verticalServo.setPosition(vertical);
     }

     public double getVerticalOrientation(){
        return verticalServo.getPosition();
     }
     public double getHorizontalOrientation(){
        return horizontalServo.getPosition();
     }
}
