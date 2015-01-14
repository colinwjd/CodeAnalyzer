package colin.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindSourceCodeFiles {
	
	public static List<File> findJavaFiles(File parentDirectory) {
		List<File> files = new ArrayList<File>();
		findJavaFiles(parentDirectory, files);
		return files;
	}

	private static void findJavaFiles(File parentDirectory, List<File> files) {
		for (File file : parentDirectory.listFiles()) {
			if (file.getName().endsWith(".java")) {
				files.add(file);
			} else if (file.isDirectory()) {
				findJavaFiles(file, files);
			}
		}
	}
	
}
