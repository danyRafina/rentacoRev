class Revision {
	private String im ;
	private int numero ;
	public static float pie;
	
	public Revision(String im, int numero){
		this.setIm(im);
		this.numero = numero;
	}
	public static float getPie() {
		return pie;
	}
	public static void setPie(float pie) {
		Revision.pie = pie;
	}
	public int getNumero(){
		return this.numero;
	}
	public String getIm() {
		return im;
	}
	public void setIm(String im) {
		this.im = im;
	}
}
