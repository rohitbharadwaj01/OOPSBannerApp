public class OOPSBannerApp {
    public static void main(String[] args) {
		OOPSBannerApp o1=new OOPSBannerApp();
		o1.UC4();
	}
	public void  UC4(){
        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
		String[] S = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "*   *",
                " *** "
        };
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " +
                               O[i] + "   " +
                               P[i] + "   " +
                               S[i]);
        }
    }
}
