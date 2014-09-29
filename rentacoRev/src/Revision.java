class Revision {
	private String im ;
	private int numero ;
	
	public Revision(String im, int numero){
		this.setIm(im);
		this.numero = numero;
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
