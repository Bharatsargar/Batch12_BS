package Test;

public class Xpath {

	public static void main(String[] args) {
		// Absolute Xpath
		// Copy full xpath
		// navigate parent immididate child var
		//it is lengthy for find elements
		// /html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
		// Single slash
		// Whenever we don't have name and id the we can use absolute xpath
		
		// Relative Xpath 
		// Copy Xpath = Cnrl+F =Pest we get the relative xpath
		// Double slash
		// //*[@id="email"]
	// X path by attributes:
		// //tagname[@attrubute='attribute value']
		// Ex : //input[@name='email']
	// X path by text:
		// //tagname[@text()='text value']
		// Ex //a[text()='Forgotten password?']
	// X path by contains:
		// //tagname[contains(attribute,'value')]
		//Ex: //button[contains(@id,'u_0_5_aW')] this id is dynamic it will change after refresh
	// X path by index------in this situation we select the perticular Webelment in multiple web elements
			// Ex : multiple radio button but select one by index 
			// (//input[@type='radio'])[2]
	
	
	
	
	}
	
	
	
	
	
	
	

}
