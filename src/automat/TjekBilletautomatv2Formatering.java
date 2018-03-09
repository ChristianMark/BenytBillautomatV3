package automat;

public class TjekBilletautomatv2Formatering
{
	public static void main(String[] arg)
	{
		Billetautomatv2 automat = new Billetautomatv2();

		int antalFejl = 0;
		int retur;
		
		
		automat.indsaetPenge(100);
                for (int i = 0; i < 5; i++){
                    automat.koebBilletter(i, 8);
                }
                automat.endeligtKoeb();
        }
}