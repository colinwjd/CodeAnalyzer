package colin.model;

import java.util.HashMap;

/**
 * 
 * @author ColinWang{wjdwjd@mail.com}
 * @date Jan 14, 2015
 */
public class LineWidthHistorgram extends HashMap<Integer, Integer> {

	public void addLine(int lineCount, int lineSize) {
		this.put(lineCount, lineSize);
	}

}
