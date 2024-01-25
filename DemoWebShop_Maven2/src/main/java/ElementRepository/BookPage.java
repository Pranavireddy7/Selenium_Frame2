package ElementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage {

	public class BooksPage {

		
		@FindBy(xpath = "//a[text()='Fiction EX']")
		private WebElement Fixtionex;
		
		
		@FindBy(id="products-orderby")
		private WebElement sortdropdown;
		
		@FindBy(id="products-pagesize")
		private WebElement displaydropdon;

	}

}
