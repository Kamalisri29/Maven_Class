package samplePkg;

import java.io.IOException;

public class TestingData {

	public static void main(String[] args) throws IOException {
		ParentClass pc=new ParentClass();
		pc.loginTest("browser", "userInfo");
		
		ParentClass.getData();
		
	}
	
}

