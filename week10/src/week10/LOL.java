package week10;

public class LOL extends Game{
	
	

	public LOL(String title, double version) {
		super(title, version);

	}


	@Override
	public void start() {
		super.start();
		lolDesc();
	}
	
	public void lolDesc() {
		System.out.println("리그오브 레전드는 세계 최고의 MOBA(Multiplayer Online Battle Arena) 게임입니다.");
	}
	
	
}
