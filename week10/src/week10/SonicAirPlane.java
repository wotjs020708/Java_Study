package week10;

public class SonicAirPlane extends AirPlane {
	private int soundSpeed;
	private int maxSpeed;
	
	//부모 메소드를 재정
	@Override
	public void fly() {
		System.out.println("음속비행합니다.");
	}
	
	
	public int getSoundSpeed() {
		return soundSpeed;
	}
	public void setSoundSpeed(int soundSpeed) {
		this.soundSpeed = soundSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
