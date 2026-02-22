public class OOPSBannerApp {
    public static void main(String[] args) {

		String[] words = {

        String.join(" ", "   ***   ", "   ***   ", "****** ", "***** "),
		String.join(" ", " **   ** ", " **   ** ", "*  **", " **      "),
		String.join(" ", "**     **", "**     **", "*  *  ", "**       "),
		String.join(" ", "**     **", "**     **", "*** ", "  *****  "),
		String.join(" ", "**     **", "**     **", "*   ", "      ** "),
		String.join(" ", " **   ** ", " **   ** ", "*   ", " **   **"),
		String.join(" ", "   ***   ", "   ***   ", "*   ", "  *****  ")
		};
		
		for (String word : words){
			System.out.println(word);
		}
    }
}