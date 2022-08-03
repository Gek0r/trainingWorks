package test.com.training;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*
 * 1) Write a program for reading binary file
 * 
 * 2) Write a program for writing binary data into a file
 * 
 * 3) Write a program for reading text file using char stream
 * 
 * 4) Write a program for writing to text file using char stream.
 * 
 * 5) Write a program for BufferedReader and BufferedWriter.
 * 
 * 6) Create an object, serialize it and store in the file or Database.
 */

public class IOReadingAndWriting {

	public static void main(String[] args) {

		// create file directory for these to use

		FileWriter out = null;

		try {
			File file = new File("C:\\test-files");
			if (!file.exists()) {
				file.mkdirs();
				System.out.println("Dir created");
			}
			out = new FileWriter(file.getAbsolutePath() + "\\test.txt");

			out.write("test file");
			System.out.println("Files created");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		BinaryFile();
		TextFile();
		BufferedReadAndWrite();
		SerializeAndStore();
	}

	public static void BinaryFile() {
		// This one reads a binary byte stream and writes out
		FileInputStream source = null;
		FileOutputStream target = null;
		int temp = 0;

		try {
			try {
				// set the location for the input and output
				source = new FileInputStream("C:\\test-files\\\testinput.png");
				target = new FileOutputStream("C:\\test-files\\testoutput.png");
				// write the bytes to the new file
				while ((temp = source.read()) != -1) {
					target.write((byte) temp);
				}
				System.out.println("Task Completed");
				// check to see if the file or input are missing
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} finally {
			// once done close the files unless there is an IO exception
			try {
				if (source != null) {
					source.close();
				}
				if (target != null) {
					target.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void TextFile() {
		FileReader in = null;
		FileWriter out = null;

		try {
			// set the file locations
			in = new FileReader("C:\\test-files\\textsource.txt");
			out = new FileWriter("C:\\test-files\\textoutput");

			int c = 0;
			// while we can read in lines, output to the writer
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Writeout Completed!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close up the files and streams
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void BufferedReadAndWrite() {
		BufferedReader bReader = null;
		BufferedWriter bWriter = null;

		try {
			// read in the file location
			Reader reader = new FileReader("C:\\test-files\\bufferinput.txt");
			bReader = new BufferedReader(reader);
			String lines = null;

			// set the output of the read in
			File outFile = new File("C:\\test-files\\bufferoutput.txt");
			Writer writer = new FileWriter(outFile);
			bWriter = new BufferedWriter(writer);

			while ((lines = bReader.readLine()) != null) {
				// write out then flush the content
				bWriter.write(lines);
				bWriter.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close up the files and streams
			try {
				bReader.close();
				bWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void SerializeAndStore() {
		Pet e = new Pet(123, "Apollo", "1B2A5X3Z", 7);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("C:\\test-files\\pets.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			System.out.println("Serialization Complete!");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}

@Getter
@Setter
@AllArgsConstructor
class Pet implements Serializable {

	private static final long serialVersionUID = 5438L;

	private int id;

	private String petName;

	private transient String policyID;

	private int age;

}
