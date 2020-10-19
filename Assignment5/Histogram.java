import acm.program.*; 
import acm.util.*; 
import java.io.*; 

public class Histogram extends ConsoleProgram {
	
	public void run() {
		 initHistogram();
		 readScoresIntoHistogram();
		 printHistogram();
		 }
	private void initHistogram() {
		
		int[] histogramArray = new int[11];
		 for (int i = 0; i <= 10; i++) {
		 histogramArray[i] = 0; 
	}
   }
	private void readScoresIntoHistogram() {
		 try {
		 BufferedReader rd
		 = new BufferedReader(new FileReader("MidtermScores.txt"));
		 while (true) {
		 String line = rd.readLine();
		 if (line == null) break;
		 int score = Integer.parseInt(line);
		 if (score < 0 || score > 100) {
		 throw new ErrorException("That score is out of range");
		 } else {
		 int range = score / 10;
		 int[] histogramArray;
		histogramArray[range]++;
		 }
		 }
		 } catch (IOException ex) {
		 throw new ErrorException(ex);
		 }
		}
	private void printHistogram() {
		 for (int range = 0; range <= 10; range++) {
		 String label;
		 switch (range) {
		 case 0: label = "00-09"; break;
		 case 10: label = " 100"; break;
		 default:
		 label = (10 * range) + "-" + (10 * range + 9);
		 break;
		 }
		 int[] histogramArray;
		String stars = createStars(histogramArray[range]);
		 println(label + ": " + stars);
		 }
		 }
	private String createStars(int n) {
		 String stars = "";
		 for (int i = 0; i < n; i++) {
		 stars += "*";
		 }
		 return stars;
		 } 
	private static final  String = "MidtermScores.txt"; 
  } 

