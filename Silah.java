public class Silah {
	
	    private int menzil,hedefMenzil;
	    private Şarjör sarjor ;

	    public Silah(int menzil,Şarjör sarjor) {
		this.menzil = menzil;
		this.sarjor=sarjor;
	    }
    	
	    
	    public void seriAtım(int hedefMenzil) {
		this.hedefMenzil=hedefMenzil;
		atesEt();
		this.sarjor.setmermiSayisi(sarjor.getmermiKapasitesi()-1);
		
    	}
	
    	public void setsarjor (Şarjör sarjor) {
		this.sarjor=sarjor;
    	}
    	
    	
    	public void mevcutSarjor() {
		this.setsarjor(new Şarjör(30,30));
	    }
    	
    	
    	public boolean atesEt() {
		if
		(this.menzil >= this.hedefMenzil) {
			System.out.println("Hedef Vuruldu");
			return true;
		}
		else 
		{
			System.out.println("Hedef Vurulamadı");
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
    	
    	
    	public Şarjör getSarjor() {
		return sarjor;
	    }
}