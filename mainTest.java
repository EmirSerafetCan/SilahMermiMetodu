public class mainTest {
    	
	
	    �arj�r sarjor;

	    public static void main(String[] args) {
		
		
		�arj�r sarjor= new �arj�r(0,0);
		
		
		Silah pistol = new Silah(0,sarjor);
		
		
		System.out.println(pistol.getSarjor().getmermiSayisi());
		pistol.seriAt�m(500);
		
		
		System.out.println(pistol.getSarjor().getmermiSayisi());
		pistol.mevcutSarjor();
		
		
		System.out.println(pistol.getSarjor().getmermiSayisi());
		
	}

}
