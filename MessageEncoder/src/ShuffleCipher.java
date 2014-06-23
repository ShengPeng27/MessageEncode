
public class ShuffleCipher implements MessageEncoder {
	int n;
	//the times we do shuffle
	/**
	 * @param n
	 */
	public ShuffleCipher(int n){
		this.n=n;
	}
	

	public String encode(String plainText){
		String newString=plainText;
		for (int i=0;i<n;i++){
			newString=shuffler(newString);
		}
		return newString;
		//implements the MessageEncode
	}
	/**
	 * @param message
	 * @return
	 */
	private String shuffler(String message){
		String newMessage1;
		//first half
		String newMessage2;
		//second half
		StringBuilder newMessage = new StringBuilder();
		int halfLength;
		Boolean isOdd = message.length()%2 != 0;
		
	
		if (isOdd)
			
			halfLength=(message.length()+1)/2;
		//when the length of message is odd, we cannot use message.length()/2.
		//If the length is 9, message.length()/2 will be 4;however, we want 
		//the length of the first half is 5. 
		else
			halfLength=message.length()/2;
		
		//determine the length of first half and second half
					
		newMessage1=message.substring(0,halfLength);
		newMessage2=message.substring(halfLength, message.length());
		if (isOdd){
		for (int i=0;i<(halfLength-1);i++){
			newMessage=newMessage.append(newMessage1.charAt(i));
			newMessage=newMessage.append(newMessage2.charAt(i));
		}
		
			newMessage=newMessage.append(newMessage1.charAt(halfLength-1));
			//when the length of message is odd, we cannot append the last 
			//letter in the loop, since there is no more letter in the second
			//half when i is equal to halfLength-1
		}
		else{
			for (int i=0;i<halfLength;i++){
				newMessage=newMessage.append(newMessage1.charAt(i));
				newMessage=newMessage.append(newMessage2.charAt(i));
			}
		}
		//build the string newMessage
		return newMessage.toString();
	}
}
