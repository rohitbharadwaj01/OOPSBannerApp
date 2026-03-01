public class OOPSBannerApp5 {

    public static void main(String[] args) {
		OOPSBannerApp5 o1=new OOPSBannerApp5();
		o1.UC5();
	}
	public void UC5(){
		String[] banner = {
			String.join("    ","*****","    ","*****","    ","*****","    ","*****"),
			String.join("    ","*   *","    ","*   *","    ","*   *","    ","*    "),
			String.join("    ","*   *","    ","*   *","    ","*****","    ","*****"),	
			String.join("    ","*   *","    ","*   *","    ","*    ","    ","    *"),
			String.join("    ","*   *","    ","*   *","    ","*    ","    ","    *"),
			String.join("    ","*****","    ","*****","    ","*    ","    ","*****")
        };
        for (String line : banner) {
            System.out.println(line);
        }
    }
}