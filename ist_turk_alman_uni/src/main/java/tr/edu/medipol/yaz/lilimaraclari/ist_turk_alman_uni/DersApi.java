package tr.edu.medipol.yaz.lilimaraclari.ist_turk_alman_uni;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController()
@RequestMapping("/ders")
public class DersApi {
	
	@GetMapping("/ekle")
	public Ders dersEkle(@RequestParam String name) {
		Ders ders=new Ders(name);
		DersVeriServisi.dersEkle(ders);
		return ders;
	}
	
	@PostMapping("/sil")
	public Ders dersSilme(@RequestBody String name){		
	//	Ders ders=new Ders(name);
		DersVeriServisi.dersSil(name);
		return (Ders) DersVeriServisi.dersListele();
		
	}
	@GetMapping("/sil2")
	public Ders derssilme(@RequestParam String name) {
		DersVeriServisi.dersSil(name);
		return (Ders) DersVeriServisi.dersListele();
	}
	
	@GetMapping("/listele")
	public List<Ders> listele(){
		return DersVeriServisi.dersListele();

	}
	

		
		
	
	
	
	
		
}


