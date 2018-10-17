package org.cameron.practice;

import java.io.File;
import java.io.FilenameFilter;

public class FileAccept implements FilenameFilter{// Demo22

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith("txt");
	}

}
