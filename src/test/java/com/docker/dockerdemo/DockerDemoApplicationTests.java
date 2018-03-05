package com.docker.dockerdemo;

import com.docker.dockerdemo.test.DockerTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DockerDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void gitTest(){
		DockerTest dockerTest = new DockerTest();
		dockerTest.gitDemo();
	}

}
