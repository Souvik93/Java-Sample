package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanFinder {
 public void panCardFinder() {
		String str="@WWWWWBHFPD8006Gaaaaa AHFPD8006Gtyyyy aaaaaaaaaCHFZD8006Gaaaaabb@!!!!!! \nghhhhhhk AHFPD8006Gtyyyy BHFPD8006Gaaaaa AHFPD8006Gtyyyy aaaaaaaaaBHFPD8006Gaaaaabb@!!!!!!ghhhhhhk AHFPD8006Gtyyyy ";
		System.out.println("Input String: \n"+str);
		Set<String> hs=new HashSet<String>();
		List<String> ls=new ArrayList<String>();
		Pattern p=Pattern.compile("[A-Z]{3}[ABCFGHLJPTK]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}");
		Matcher m=p.matcher(str);
		//System.out.println(m.start());
		//System.out.println(m.hasAnchoringBounds());
		while(m.find())
		{
			//System.out.println(m.start());
			//System.out.println(m.end());
			String pan=str.substring(m.start(), m.end());
			hs.add(pan);
			if(!ls.contains(pan))
				ls.add(pan);
		}
		//System.out.println(ls);
		System.out.println("\nSelected PAN Cards from the paragraph:");
		System.out.println(hs);
	}
 }
