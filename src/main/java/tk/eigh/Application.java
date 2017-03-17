package tk.eigh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Application {
    
    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Show me a message";
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
