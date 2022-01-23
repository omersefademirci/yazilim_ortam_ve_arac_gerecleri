package tr.edu.medipol.yaz.lilimaraclari.ist_turk_alman_uni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class DersVeriServisi {
	public static final List<Ders> DERSLER=new ArrayList<>();
	private static String name2;
	static {
		DERSLER.add(new Ders("Yazılım Ortam ve Arac Gerecleri"));
		DERSLER.add(new Ders("Matematik"));
		DERSLER.add(new Ders("Cografya"));
		DERSLER.add(new Ders("Fizik"));
		DERSLER.add(new Ders("Tarih"));
	}
	public static List<Ders> dersListele(){
		return DERSLER;
	}
	public static void dersEkle(Ders ders) {
		DERSLER.add(ders);
	}
	public static void dersSil(String name) {
		//name2 = name1;
		List<String> list = new ArrayList<>();
		
		
		 int index= DERSLER.indexOf(name2);
		//DERSLER.remove(DERSLER.lastIndexOf(name1));
		DERSLER.remove(name);
		
	}
	

}
