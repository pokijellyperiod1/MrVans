package com.tanky.MrVan.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Component
public class FileUtils_TanKy {

	
	public static String encoder(String imagePath) {
		  String base64Image = "";
		  File file = new File(imagePath);
		  try (FileInputStream imageInFile = new FileInputStream(file)) {
		    // Reading a Image file from file system
		    byte imageData[] = new byte[(int) file.length()];
		    imageInFile.read(imageData);
		    base64Image = Base64.getEncoder().encodeToString(imageData);
		  } catch (FileNotFoundException e) {
		    System.out.println("Image not found" + e);
		  } catch (IOException ioe) {
		    System.out.println("Exception while reading the Image " + ioe);
		  }
		  return base64Image;
		}
	
	
	public static void decoder(String base64Image, String pathFile) {
		  try (FileOutputStream imageOutFile = new FileOutputStream(pathFile)) {
		    // Converting a Base64 String into Image byte array
		    byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
		    imageOutFile.write(imageByteArray);
		   

	        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
					"cloud_name", "dbqzpdgpi",
					"api_key", "463648723862277",
					"api_secret", "Bo1MvViceCLF9E0HB6hOz9MBC10"
					));
	    	

	        Map<String, String> map = cloudinary.uploader().upload(imageByteArray,
	                    ObjectUtils.asMap("resource_type", "auto"));
		    
		    
		  } catch (FileNotFoundException e) {
		    System.out.println("Image not found" + e);
		  } catch (IOException ioe) {
		    System.out.println("Exception while reading the Image " + ioe);
		  }
		  
		  
		  
		
		}

//	public static void main(String[] args) throws Exception {
//		String path = "/home/tanky/Pictures/product-12.jpg";
//		String outputFileName = "/home/tanky/Pictures/NEWIAMGESSSS_copy.jpg";
//		String imageEncode = encoder(path);
//		decoder(imageEncode, outputFileName);
//		
//		
//
//	}

}
