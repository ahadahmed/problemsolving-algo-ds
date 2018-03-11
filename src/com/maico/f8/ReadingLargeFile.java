package com.maico.f8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import net.agkn.hll.HLL;

public class ReadingLargeFile {

	private final String FILENAME = "E:\\eclipseworkspace\\filename.txt";
	private HLL hll = new HLL(14, 5);

	public void readingFileLineByLine() {
		FileInputStream inputStream = null;
		Scanner sc = null;
		try {
			inputStream = new FileInputStream(FILENAME);
			sc = new Scanner(inputStream, "UTF-8");
			long startTime = System.currentTimeMillis();
			System.out.println("Star Reading file -->");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
//				 System.out.println(line);
				String[] words = line.split(" ");
				for (String word : words) {
					this.hashing(word);
				}
			}

			long cardinality = hll.cardinality();
			System.out.println("Cardinality-->" + cardinality);
			System.out.println("End of Reading file");
			long endTime = System.currentTimeMillis();
			System.out.println("Time taken-->"+ (endTime - startTime)/1000 + " s");
			// note that Scanner suppresses exceptions
			if (sc.ioException() != null) {
				throw sc.ioException();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (sc != null) {
				sc.close();
			}
		}
	}

	public void hashing(String s) {
		final int seed = 123456;

		HashFunction hashFunction = Hashing.murmur3_128();
		long numberOfElements = 100_000_000;
		long toleratedDifference = 1_000_000;
		long hashedValue = hashFunction.newHasher().putString(s, Charset.defaultCharset()).hash().asLong();

		// final HLL hll = new HLL(13/*log2m*/, 5/*registerWidth*/);
		hll.addRaw(hashedValue);

	}

}
