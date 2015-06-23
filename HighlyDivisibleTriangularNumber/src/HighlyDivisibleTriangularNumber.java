public class HighlyDivisibleTriangularNumber {
	private long numTriang;
	private int numSoma;
	private int numDiv;
	
	public HighlyDivisibleTriangularNumber(){
		this.numTriang = 1;
		this.numSoma = 2;
		this.numDiv = 1;
	}
	
	private boolean temQuinhentos(long num){
		int cont = 0;
		int i = 1;
		while(i <= num){
			if(cont >= 500){
				return true;
			}
			else{
				if((num%i) == 0){
					cont++;
				}
			}
			i++;
		}
		return false;
	}
	
	public void realizaCalc(){
		while(true){
			numTriang = numTriang + numSoma;
			System.out.println("Número: " + numTriang);
			if(temQuinhentos(numTriang)){
				System.out.println("É este -> " + numTriang);
				break;
			}
			numSoma++;
		}
	}
	
}
