package com.tanky.MrVan.Util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FileUtils {

	public List<String> getListFileName() {
		
		File file = new File("/home/tanky/Downloads");
		
		List<String> listImg = new ArrayList<>();
        String[] fileList = file.list();
        for(String name:fileList){
        	listImg.add(name);
        }
		
        return listImg;
		
	}
	
}

