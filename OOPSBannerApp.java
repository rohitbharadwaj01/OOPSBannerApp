public class OOPSBannerApp{

    public static void main(String[] args) {
		OOPSBannerApp o1=new OOPSBannerApp();
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
