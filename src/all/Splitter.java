package all;

import java.util.ArrayList;
import java.util.List;

public class Splitter implements SplitterInterface
{

	@Override
	public List<String> split(String original) {
		ArrayList<String> split_list = new ArrayList<String>();
		
		if (original.length() > 4) {	
			split_list.add(original.substring(0, 4).toLowerCase());
			split_list.add(original.substring(4).toLowerCase());
		} else {
			split_list.add(original.toLowerCase()); 
		}
		
		return split_list;
	}
}
