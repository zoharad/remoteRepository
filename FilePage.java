import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePage {

	public static void main(String[] args) throws IOException 
	{
		Openfile();
	}
	static int k=0;
	private static String url;
	private static String fetchTime;
	private static int length;
	private static String modifiedTime;
	private static String type;
	private static String[] outLink = new String[100];
	public static void Openfile() throws IOException
	{
		FileReader fr = new FileReader("1.txt");
		
		BufferedReader br = new BufferedReader(fr); 
		String aline;
		
		int lineCount = 0;
		String [] wValue = new String[1000];
		while ((aline = br.readLine()) != null)
		{
			wValue[lineCount]=aline;
			lineCount++;
			System.out.println(aline);
		}
		
		for (int i=0; i<lineCount;i++)
		{
			
			switch(i){
			case 0:
				url = wValue[i].substring(5, wValue[i].length());
				break;
			case 1:
				fetchTime = wValue[i].substring(12, wValue[i].length());
				break;
			case 2:
				length = Integer.parseInt(wValue[i].substring(8, wValue[i].length()));
				break;
			case 3:
				modifiedTime = wValue[i].substring(15, wValue[i].length());
				break;
			case 4:
				type = wValue[i].substring(6, wValue[i].length());
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				//(int j=0; j<10;j++){
				
					outLink[k]= wValue[i];
					k++;
				break;
			
			}
		}
		System.out.println("1-url: "+ url);
		System.out.println("2-fetch_time: "+ fetchTime);
		System.out.println("3-length: "+ length);
		System.out.println("4-modified_time: "+ modifiedTime);
		System.out.println("5-type: "+ type);
		
		for(int j=0; j<k;j++)
		{
			System.out.println(j +": " +outLink[j]);
		}
		fr.close();
		br.close();
		//fw.
//		if(aline == null)
//		{
//			wValue = new String[2*lineCount];
//		}
//		FileWriter fw = new FileWriter("filename.txt", true);
//		for (int i = 0; i < lineCount; i++ )
//		{
//			fw.write(wValue[i]);
//		}
//		fw.close();

	}
}
