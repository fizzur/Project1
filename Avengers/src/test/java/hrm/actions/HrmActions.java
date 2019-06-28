package hrm.actions;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDriverSetup;

public class HrmActions{
	
	HrmElements menubuttontest;
	
	public HrmActions() {
		this.menubuttontest = new HrmElements();
		PageFactory.initElements(HrmDriverSetup.driver, menubuttontest);
		
	}
	
	
	
	public String Hrmmenubuttonpage() {
		HrmDriverSetup.driver.get("https://www.orangehrm.com/");
		String title = HrmDriverSetup.driver.getTitle();
		return title;
		
	}
	public void feature(String feature) {
		menubuttontest.featurebutton.click();
	}



	}
	
	
	