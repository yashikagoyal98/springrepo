package com.zensar.spring.poems;
/*Author: Yahika Goyal
Creation Date: 27 july 2019 4:18PM
Modified Date: 27 july 2019 4:18PM
Version: 1.0
Copyright: zensar Tchnologies.All rights preserved
Description: It represents a twinke twinkle Poem*/
public class TwinkleTwinkle implements Poems {

	private final static String LINES []= {
			"Twinkle Twinkle Little Star",
			"How I Wonder What You Are",
			"Up Above The World So High",
			"Like A Diamond In The Sky"
	};
	
	public void recite() {
		// TODO Auto-generated method stub

	for(String line:LINES)
		System.out.println(line);
	}

}
