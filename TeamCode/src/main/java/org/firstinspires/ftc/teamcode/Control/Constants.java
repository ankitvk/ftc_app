package org.firstinspires.ftc.teamcode.Control;

public interface Constants {
    double NANOSECONDS_PER_MINUTE = 6e+10;
    double NEVEREST_20_MAX_RPM = 320;
    double NEVEREST20_COUNTS_PER_REV = 560;
    double NEVEREST40_COUNTS_PER_REV = 1120;

    double NEVEREST_CLASSIC = 28;
    double DT_NEVEREST_GEARBOX = (55/3)*NEVEREST_CLASSIC;

    double PIVOT_TICKS_PER_ROTATION = 100;
    double PIVOT_TICKS_PER_INCH = 100;

    double E4T_COUNTS_PER_REV = 537.6;
    int PATH_FOLLOWING_INTERVAL = 50;
    double SPEED_MULTIPLIER = 1;

    double LENGTH_BETWEEN_WHEELS = 15.789;
    double WHEEL_DIAMETER  =4;

    double DISTANCE_TOLERANCE = .5;
    double IMU_TOLERANCE = .2;

    double LOOKAHEAD = 18;

    int ALIGN_POSITION = 0;

    int TARGET_GOLD_X_POS = 425;

    double MIN_ROTATE_POWER = 0.39;
    double MIN_DRIVE_POWER = 0;

    double dtKP = .00045;
    double dtKI = .025;
    double dtKD = 0;
    double dtMaxI = 1;

    double dtRotateKP = 0.0095;
    double dtRotateKI = 0.00000;
    double dtRotateKD = 0;
    double dtRotateMaxI = 1;

    double dtBigRotateKP = 0.015;
    double dtBigRotateKI = 0;
    double dtBigRotateKD = 0;
    double dtBigRotateMaxI = 1;

    double extensionKP = .015;
    double extensionKI = 0;
    double extensionKD = 0;
    double extensionMaxI = 1;

    double pivotKP = 1e-6;
    double pivotKI = 0;
    double pivotKD = 0;
    double pivotMaxI = 1;

    String LICENSE_KEY = "AbxcZxf/////AAABmYehhkt9/k+lgWzWDZFG64eH2XR0TK1U2WbaJWSXrIBuB4xBU9FpE1oHH3WHomRfTKwInQH9f18rQNXlH0LoYQmYHUR30N47eierR8KeOCKWOz/ew5qYXDq5W4hy20SDt6/GrORnhVttBPrp1lu+RllaRANDz4PKdioMn8uobSLb4MC9z77cXv+BCxSQGsswhgaVNYh/3GoBLrYYEYDpgGGFRLEJtrmf8pYbd3s+KKatCS5xEaEoILRYWQZMt5kENV2CyoaSznfg+zmRNeNpVpFBLWMlaVoT19fBzj2IZZx209ztGb+MLCRkHwy2b0cTDc1DfBm/RfzcJsAm8ym9sAPTmlbi6UlWB/dJr9s48kwM";


}
