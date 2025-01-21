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
		
		if (text.length() > 3) {	
			text_part_1 = original.substring(0, 4);
			text_part_2 = original.substring(4);
		} else {
			String 
		}
		
		text_part_1 = text_part_1.toLowerCase();
		text_part_2 = text_part_2.toLowerCase();
		
		split_list.add(text_part_1);
		split_list.add(text_part_2);
		
		return split_list;
	}
}
