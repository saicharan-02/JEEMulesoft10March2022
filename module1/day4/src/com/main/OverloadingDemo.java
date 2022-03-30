package com.main;

import com.abc.Camera;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		Camera camera = new Camera();
		camera.cameraClick();
		camera.cameraClick("Panaroma");				
	}

}
