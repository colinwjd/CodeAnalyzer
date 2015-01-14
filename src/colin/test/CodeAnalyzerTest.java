package colin.test;

import java.io.File;
import java.util.List;

import colin.analyzer.CodeAnalyzer;

public class CodeAnalyzerTest {

	
	public static void main(String[] args) {
		
		File parentDirectory = new File("E:\\程序设计\\JavaEE\\veidoo");
		
		CodeAnalyzer codeAnalyzer = new CodeAnalyzer();
		List<File> javaFiles = CodeAnalyzer.findJavaFiles(parentDirectory);
		
		for (File file : javaFiles) {
			try {
				codeAnalyzer.analyzeFile(file);
				System.out.println(codeAnalyzer.getLineCount());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
