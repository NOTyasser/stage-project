package ma.yasser.stage_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class StageProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StageProjectApplication.class, args);
	}

}
