package abstractfactory.example.power;

public class LowPowerSensorFactory extends SensorFactory {
	public LightSensor createLightSensor() {
		return new LowPowerLightSensor() ;
	}
	public Gyroscope createGyroscope() {
		return new LowPowerGyroscope() ;
	}
	public MotionSensor createMotionSensor() {
		return new LowPowerMotionSensor() ;
	}

}
