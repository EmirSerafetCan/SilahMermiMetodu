public class Silah {
	
	    private int menzil,hedefMenzil;
	    private �arj�r sarjor ;

	    public Silah(int menzil,�arj�r sarjor) {
		this.menzil = menzil;
		this.sarjor=sarjor;
	    }
    	
	    
	    public void seriAt�m(int hedefMenzil) {
		this.hedefMenzil=hedefMenzil;
		atesEt();
		this.sarjor.setmermiSayisi(sarjor.getmermiKapasitesi()-1);
		
    	}
	
    	public void setsarjor (�arj�r sarjor) {
		this.sarjor=sarjor;
    	}
    	
    	
    	public void mevcutSarjor() {
		this.setsarjor(new �arj�r(30,30));
	    }
    	
    	
    	public boolean atesEt() {
		if
		(this.menzil >= this.hedefMenzil) {
			System.out.println("Hedef Vuruldu");
			return true;
		}
		else 
		{
			System.out.println("Hedef Vurulamad�");
			return true;
		}
     	}
    	
    	
    	public int getMenzil() {
		return menzil;
    	}
     	
    	
    	public void setmenzil(int menzil) {
		this.menzil = menzil;
	    }
    	
    	
    	public int getHedefMenzil() {
	  	return hedefMenzil;
	    }
	   
    	
    	public void sethedefMenzil(int hedefMenzil) {
		this.hedefMenzil = hedefMenzil;
	    }
    	
    	
    	public �arj�r getSarjor() {
		return sarjor;
	    }
}