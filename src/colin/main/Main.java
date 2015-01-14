package colin.main;

import java.io.File;
import java.util.List;

import colin.analyzer.CodeAnalyzer;
import colin.util.FindSourceCodeFiles;

public class Main {
	
	public static void main(String[] args) {
		
		File parentDirectory = new File("E:\\程序设计\\JavaEE\\veidoo\\src");
		List<File> javaFiles = FindSourceCodeFiles.findJavaFiles(parentDirectory);
		
		CodeAnalyzer codeAnalyzer = new CodeAnalyzer();
		for (File javaFile : javaFiles) {
			try {
				codeAnalyzer.analyzeFile(javaFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(codeAnalyzer.getLineCount());
	}
}
