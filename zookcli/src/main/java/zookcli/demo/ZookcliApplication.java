package zookcli.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZookcliApplication {

	public static void main(String[] args) {

		try {
			SpringApplication.run(ZookcliApplication.class, args);
			System.out.println("Server startup done.");
		}catch (Exception e){
			System.out.println("Server startup fail.");
			e.printStackTrace();
		}
	}

}
