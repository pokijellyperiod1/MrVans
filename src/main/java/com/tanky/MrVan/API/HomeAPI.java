package com.tanky.MrVan.API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanky.MrVan.Entity.GeneralValue_Entity;
import com.tanky.MrVan.Repo.GeneralValue_Repo;
import com.tanky.MrVan.dto.Benefit;
import com.tanky.MrVan.dto.GeneralValue;
import com.tanky.MrVan.dto.Mission;
import com.tanky.MrVan.dto.Vision;
import com.tanky.MrVan.dto.contact;

@RestController
@RequestMapping("/api/content")
public class HomeAPI {

	
	@GetMapping("/introduction")
	public contact intro() {
		contact contact = new contact();
		contact.setHeader("“Con đường ngắn nhất để chạm đến trái tim là ... đi qua dạ dày”. Chúng tôi yêu sức khỏe của mình và tin " + 
				"chắc rằng bạn cũng thế. Để có 1 trái tim khỏe mạnh thì việc cho bao tử tiếp nhận những thực phẩm an " + 
				"toàn, chất lượng là cần thiết. Công ty TNHH Green Gro ra đời với tiêu chí như thế");
		
		List<Benefit> listBenefit = new ArrayList();
		Benefit benefit = new Benefit();
		benefit.setName("Chuyên cung cấp nguyên liệu, thực phẩm tươi sạch");
		
		List<String> lists = new ArrayList();
			lists.add("Nấm bào ngư xám/ Nấm mối đen: Trại nấm chính chủ của gia đình, sản xuất theo công " + 
					"nghệ thông minh kép kín, an toàn vệ sinh. Từng sản phẩm luôn được lựa chọn kỹ lưỡng trao " + 
					"đến tay người tiêu dùng.");
			lists.add("Xúc xích tươi: Nếu bạn là tín đồ của xúc xích nhưng chẳng thể tìm ra nơi sản xuất an toàn vệ " + 
					"sinh thực phẩm tại khu vực Thành Phố Hồ Chí Minh hay xa hơn là khắp 63 Tỉnh, Thành Phố " + 
					"còn lại của Việt Nam ? Đừng lo lắng XÚC XÍCH MR. VANS hứa hẹn 1 cực phẩm chạm " + 
					"thẳng đến con tim kể cả những người khó tính.");
		benefit.setText(lists);
		
		listBenefit.add(benefit);
		
		Benefit benefit2 = new Benefit();
		benefit2.setName("Cơm trưa văn phòng");
		List<String> lists2 = new ArrayList();
		lists2.add("Từ những nguyên liệu tươi ngon, giá thành hợp lý, bạn không phải nghĩ " + 
				"“TRƯA NAY ĂN GÌ?”. Hãy để Mr.Vans giao tận nơi, phục vụ tận chổ, không những ăn ngon mà " + 
				"còn nhiều khuyến mãi cho KH thân thiết.");
		benefit2.setText(lists2);
		listBenefit.add(benefit2);
		
		contact.setParagraph(listBenefit);
		
		contact.setVision(new Vision(""));
		
		contact.setMission(new Mission("Bằng chính sự tận tâm và trách nhiệm của mình, Mr.Vans sẽ luôn đồng hành thấu hiểu khách hàng của " + 
				"mình như những người bạn. Mr.Vans cam kết sẽ mang đến những sản phẩm chất lượng tốt, có giá trị dinh " + 
				"dưỡng cao cũng như làm KH hài lòng về dịch vụ, giá cả, đóng góp một phần nào đó nâng cao sức khỏe " + 
				"của người tiêu dùng."));
		
		contact.setFooter("Chúng tôi hiểu KH của mình cần gì và luôn mong muốn đem lại giá trị tốt nhất cho KH. Đó cũng chính là " + 
				"khẩu hiệu hàng đầu của công ty “Thấu hiểu từng bữa cơm”");
		
		return contact;
		
	}

	@Autowired
	private GeneralValue_Repo generalValue_Repo;
	
	@PostMapping
	public GeneralValue_Entity post(@RequestBody GeneralValue_Entity entity) {
		return generalValue_Repo.save(entity);
	}
	
	@PutMapping("/{id}")
	private GeneralValue_Entity put(@RequestBody GeneralValue_Entity entity, @PathVariable String id) {
		GeneralValue_Entity newEntity = generalValue_Repo.findOneById(id);
		return generalValue_Repo.save(newEntity);
	}
	
	
	
	
	
	
	
	
}
