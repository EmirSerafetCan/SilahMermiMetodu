public class mainTest {
    	
	
	    Þarjör sarjor;

	    public static void main(String[] args) {
		
		
		Þarjör sarjor= new Þarjör(0,0);
		
		
		Silah pistol = new Silah(0,sarjor);
		
		
		System.out.println(pistol.getSarjor().getmermiSayisi());
		pistol.seriAtým(500);
		
		
		System.out.println(pistol.getSarjor().getmermiSayisi());
		pistol.mevcutSarjor();
		
		
		System.out.println(pistol.getSarjor().getmermiSayisi());
		
	}

}
