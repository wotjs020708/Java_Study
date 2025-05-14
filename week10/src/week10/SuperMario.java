package week10;

public class SuperMario extends Game {
	public SuperMario(String title, double version) {
		super(title, version);
	}
	
	@Override
	public void start() {
		super.start();
		marioDesc();
	}
	
	public void marioDesc() {
		System.out.println("닌텐도의 대표 비디오게임 시리즈인 마리오 시리즈의 핵심이 되는 본가 시리즈.");
	}
	
}
