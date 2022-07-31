import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Appendtofile {
	public static void main(String[] args) throws IOException {
		File file = new File("c://temp//newFile.txt");
		String data = "This data is appended";
		try {
		
		FileWriter writer = new FileWriter("file.txt", true);
		writer.write(data);
		System.out.println("Data appended successfully");
		writer.close();
	} catch (IOException e) {
		System.out.println("File append error..");
	}

}
}
