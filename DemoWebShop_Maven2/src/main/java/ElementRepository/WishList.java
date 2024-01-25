package ElementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishList {
	public class WishlistPage {

		
		@FindBy(name ="removefromcart")
		private WebElement removeFromCartCheckbox;
		
		
		@FindBy(name =" updatecart")
		private WebElement UpdateWishlistButton;
		
		@FindBy(name= "addtocartbutton")
		private WebElement addToCartButton;
		
	}

	
}
