
public class SubstitutionCipher implements MessageEncoder{
	int shift;
	//how much we shift the char
	/**
	 * @param shift
	 */
	
	public  SubstitutionCipher(int shift){
		this.shift=shift;
	}
	
	public String encode(String plainText){
		String newString="";
		for (int i=0;i<plainText.length();i++){
			newString=newString+shifter(plainText.charAt(i));
			// add the chars to newString
		}
		return newString;
		//implement the interface MessageEncoder
	}
	/**
	 * @param letter
	 * @return
	 */
	
	private char shifter(char letter){
		return (char)(letter+this.shift);
		//shift the char
	}
}
