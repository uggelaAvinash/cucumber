package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
WebDriver driver;
@Given("Open Edge Browser")
public void open_edge_browser() {
   driver=new EdgeDriver();
}

@Given("Open URL demo.guru99.com\\/v4")
public void open_url_demo_guru99_com_v4() {
  driver.get("https://demo.guru99.com/v4");
  driver.manage().window().maximize();
}

@When("Login Id Login Password")
public void login_id_login_password() {
	driver.findElement(By.name("uid")).sendKeys("mngr564832");
	driver.findElement(By.name("password")).sendKeys("panUrEj");
}

@When("Click On Submit")
public void click_on_submit() {
	driver.findElement(By.name("btnLogin")).click();
}

@Then("Redirect to Bankpage")
public void redirect_to_bankpage() {
WebElement image=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/center/img[1]"));
	
	if(image.isDisplayed()) {
		System.out.println("login success");
	}
	else {
	    System.out.println("login failed");
		
	}
}

}
