public class OOPSBannerApp {
    public static void main(String[] args) {

		String[] words = new String[7];

        words[0] = String.join(" ", "   ***   ", "   ***   ", "****** ", "***** ");
		words[1] = String.join(" ", " **   ** ", " **   ** ", "*  **", " **      ");
		words[2] = String.join(" ", "**     **", "**     **", "*  *  ", "**       ");
		words[3] = String.join(" ", "**     **", "**     **", "*** ", "  *****  ");
		words[4] = String.join(" ", "**     **", "**     **", "*   ", "      ** ");
		words[5] = String.join(" ", " **   ** ", " **   ** ", "*   ", " **   **");
		words[6] = String.join(" ", "   ***   ", "   ***   ", "*   ", "  *****  ");
		
		for (String word : words){
			System.out.println(word);
		}
    }
}