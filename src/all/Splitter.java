package all;

import java.util.ArrayList;
import java.util.List;

public class Splitter implements SplitterInterface
{

	@Override
	public List<String> split(String original) {
		ArrayList<String> split_list = new ArrayList<String>();
		
		String text_part_1;
		String text_part_2;
		String text_short;
		
		if (original.length() > 3) {	
			split_list.add(original.substring(0, 4).toLowerCase());
			split_list.add(original.substring(4).toLowerCase());
		} else {
			split_list.add() 
		}
		
		return split_list;
	}
}
