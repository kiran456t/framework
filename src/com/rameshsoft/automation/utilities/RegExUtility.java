package com.rameshsoft.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.rameshsoft.automation.customisedexceptions.FrameworkException;

public interface RegExUtility 
{
public static boolean isValidPhNum(String mobileNum)
{
	boolean flag = true;
	String source = "(0|91)?[6-9][0-9]{9}";
	
	Pattern pattern = Pattern.compile(source);
	Matcher matcher = pattern.matcher(mobileNum);
	
	if (matcher.find()&&matcher.group().equalsIgnoreCase(mobileNum))
		flag = true;
	else
		flag = false;
	return flag;
}

/*public static boolean isValidEmail(String emial)
{
	// Pattern emailNamePtrn = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	boolean flag = true;		
	Pattern pattern = Pattern.compile("");
	Matcher mtch = emailNamePtrn.matcher(emial);
	        if(mtch.matches()){
	            return true;
	        }
	        return false;
}


}*/

}
