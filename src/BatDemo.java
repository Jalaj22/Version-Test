import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BatDemo {

	@Test
	@Parameters("browser")
	public static void main1(@Optional("Chrome") String browser) {

		System.out.println("Value of browser:" + browser);
	}

}
