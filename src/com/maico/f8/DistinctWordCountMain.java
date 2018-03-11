package com.maico.f8;

public class DistinctWordCountMain {
	
	
	public static void main(String[] args) {
		LargerFileWriter largeFileWriter = new LargerFileWriter();
		ReadingLargeFile largeFileReader = new ReadingLargeFile();
//		largeFileWriter.writeToFile();
		largeFileReader.readingFileLineByLine();
		
	}

}
