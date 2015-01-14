package colin.model;

import java.util.HashMap;

public class LineWidthHistorgram extends HashMap<Integer, Integer> {

	public void addLine(int lineCount, int lineSize) {
		this.put(lineCount, lineSize);
	}

}
