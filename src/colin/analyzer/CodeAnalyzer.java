package colin.analyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import colin.model.LineWidthHistorgram;

/**
 * 
 * @author ColinWang{wjdwjd@mail.com}
 * @date Jan 14, 2015
 */
public class CodeAnalyzer {
	private int lineCount;
	private int maxLineWidth;
	private int widestLineNumber;
	private LineWidthHistorgram lineWidthHistorgram;
	private int totalChars;

	public CodeAnalyzer() {
		lineWidthHistorgram = new LineWidthHistorgram();
	}

	public void analyzeFile(File javaFile) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(javaFile));
		String line;
		while ((line = br.readLine()) != null) {
			measureLine(line);
		}
		br.close();
	}

	private void measureLine(String line) {
		lineCount++;
		int lineSize = line.length();
		totalChars += lineSize;
		lineWidthHistorgram.addLine(lineCount, lineSize);
		recordWidestLine(lineSize);
	}

	private void recordWidestLine(int lineSize) {
		if (lineSize > maxLineWidth) {
			maxLineWidth = lineSize;
			widestLineNumber = lineCount;
		}
	}

	public int getLineCount() {
		return lineCount;
	}

	public int getMaxLineWidth() {
		return maxLineWidth;
	}

	public int getWidestLineNumber() {
		return widestLineNumber;
	}

	public LineWidthHistorgram getLineWidthHistorgram() {
		return lineWidthHistorgram;
	}

	public int getTotalChars() {
		return totalChars;
	}

	public void setLineCount(int lineCount) {
		this.lineCount = lineCount;
	}

	public void setMaxLineWidth(int maxLineWidth) {
		this.maxLineWidth = maxLineWidth;
	}

	public void setWidestLineNumber(int widestLineNumber) {
		this.widestLineNumber = widestLineNumber;
	}

	public void setLineWidthHistorgram(LineWidthHistorgram lineWidthHistorgram) {
		this.lineWidthHistorgram = lineWidthHistorgram;
	}

	public void setTotalChars(int totalChars) {
		this.totalChars = totalChars;
	}

}
