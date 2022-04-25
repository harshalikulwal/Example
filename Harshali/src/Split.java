import java.util.*;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string ="192.34.64.0";
		List<String> list = new ArrayList<String>(Arrays.asList(string.split(" . ")));
	System.out.println(list.size());
	}

}
