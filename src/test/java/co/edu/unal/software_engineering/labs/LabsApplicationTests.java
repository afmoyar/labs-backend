package co.edu.unal.software_engineering.labs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//this is just a test

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabsApplicationTests{

	@Test
	public void contextLoads( ){
		LabsApplication.main( new String[]{ } );
	}

}