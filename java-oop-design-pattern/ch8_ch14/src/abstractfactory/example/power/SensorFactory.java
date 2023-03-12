package abstractfactory.example.power;

public abstract class SensorFactory {	
	public abstract LightSensor createLightSensor() ;
	public abstract Gyroscope createGyroscope() ;
	public abstract MotionSensor createMotionSensor() ;
}
