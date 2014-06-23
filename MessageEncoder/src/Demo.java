
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstitutionCipher aShift = new SubstitutionCipher(5);
		ShuffleCipher aShuffle = new ShuffleCipher (1);
		System.out.println(aShift.encode("encodeDemo"));
		System.out.println(aShuffle.encode("encodeDemo"));
	}

}
