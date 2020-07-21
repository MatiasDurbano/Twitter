import java.util.List;

import com.Interfaces.Network;
import com.Twitter.TwitterNetworkImpl;

public class main {

	public static void main(String[] args) {
		Network a = new TwitterNetworkImpl();
		List<String> b = a.get();
//	    for(String c :b) {
//	    	System.out.println(c);
//	    }
	}

}
