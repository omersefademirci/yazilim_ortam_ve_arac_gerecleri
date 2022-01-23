package tr.edu.medipol.yaz.lilimaraclari.ist_turk_alman_uni;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class DersApiTest {

	@Test
	void testDersEkle() {
		Ders ders =new Ders("Kullanıcı Arayüz Tasarım");
		DersVeriServisi.dersEkle(ders);
		
		assertEquals(DersVeriServisi.dersListele().contains(ders),true);
	}

	@Test
	void testDersSilme() {
		String ders="Matematik";
		DersVeriServisi.dersSil("Matematik");
		assertEquals(DersVeriServisi.dersListele().contains(ders),false);
		
	}

	@Test
	void testListele() {
		
		List<Ders> list= DersVeriServisi.dersListele();
		
		
		
		assertEquals(list, DersVeriServisi.dersListele());
		
		
	}

}
