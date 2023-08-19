package recursion;

public class StringPalindrome {
	
	static boolean isPalin(String s, int l,int r) {
		if(l>=r)
			return true;
		if(s.charAt(l)!=s.charAt(r)) {
			return false;
		}
		return isPalin(s,l+1,r-1);
	}

	public static void main(String[] args) {
		String s="acbcat";
		int l=0;
		int r=s.length()-1;
		
		System.out.println(isPalin(s,l,r));

	}

}
