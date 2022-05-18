public class Şarjör {
	
	
	    private int mermiKapasitesi, mermiSayisi;

	    public Şarjör(int mermiKapasitesi, int mermiSayisi) {
		this.mermiKapasitesi = mermiKapasitesi;
		this.mermiSayisi = mermiSayisi;

	    }

	    public void ates() {
		mermiSayisi--;
	    }

	    
	    public void sarjorYenile() {
		mermiSayisi=mermiKapasitesi;
	    }

	    
	    public int getmermiKapasitesi() {
 		return mermiKapasitesi;
	    }

	   
	    public void setmermiKapasitesi(int mermiKapasitesi) {
		this.mermiKapasitesi = mermiKapasitesi;
	    }

	   
	    public int getmermiSayisi() {
		return mermiSayisi;
	    }

     	
	    public void setmermiSayisi(int mermiSayisi) {
		this.mermiSayisi = mermiSayisi;
	    }
}
