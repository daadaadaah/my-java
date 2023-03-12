package abstractfactory.example.power;

public class AveragePowerSensorFactory extends SensorFactory {
	public LightSensor createLightSensor() {
		return new AveragePowerLightSensor() ;
	}
	public Gyroscope createGyroscope() {
		return new AveragePowerGyroscope() ;
	}
	public MotionSensor createMotionSensor() {
		return new AveragePowerMotionSensor() ;
	}
}
