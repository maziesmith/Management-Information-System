import java.util.HashMap;

public class Collection_frame {
	
	private HashMap<String, String> hashmap = new HashMap<String, String>();

    public HashMap<String, String> getHashmap() {
        return hashmap;
    }

    public HashMap<String, String> setHashmap(String mobile,String email,String fnumber) {
        this.hashmap = hashmap;
        hashmap.put("mobilekey", mobile);
        hashmap.put("mail", email);
        hashmap.put("fnumberkey", fnumber);
		return hashmap;
    }
    
	public static  void hashmap(String mobile,String email,String visitinghrs,String research)
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("mobile", mobile);
		hm.put("email", email);
		hm.put("fmobile", visitinghrs);
		hm.put("research", research);
		
	}

}
