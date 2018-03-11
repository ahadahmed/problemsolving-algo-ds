package com.maico.f8;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LargerFileWriter {
	
	
	private final String FILENAME = "E:\\eclipseworkspace\\filename.txt";

	public void writeToFile() {

		BufferedWriter bw = null;
		FileWriter fw = null;
		
		long startTime = System.currentTimeMillis();

		try {

			String content = "This is the content to write into file";

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			System.out.println("Start Writing--->>");
			for(int i = 0; i< 100; i++) {
				bw.write(content + i);
				bw.newLine();
			}

			System.out.println("Done");
			long endTime = System.currentTimeMillis();
			System.out.println("Time taken-->"+ (endTime - startTime)/1000 + " s");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}
