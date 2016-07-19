package com.agroknow.cimmyt;

import com.agroknow.cimmyt.utils.Upload;

public class YouTubeUploader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
            System.err.println("Expects one parameter, that of the video!");                
            System.exit(1);
        } 
		
		
		Upload uploader=new Upload();
		
		uploader.upload(args[1]);
	}
	
	

}
