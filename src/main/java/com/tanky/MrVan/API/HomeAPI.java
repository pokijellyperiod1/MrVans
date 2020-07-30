package com.tanky.MrVan.API;

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
import com.tanky.MrVan.dto.GeneralValue;

@RestController
@RequestMapping("/api/home")
public class HomeAPI {

	@GetMapping
	public GeneralValue_Entity generalValue() {
		GeneralValue_Entity generalValue = new GeneralValue_Entity();

		generalValue.setSlogan("Hãy để chúng tôi chăm sóc cái bụng của bạn");
		generalValue.setSubSlogan("Thực đơn ngon, gíá hạt dẻ cho một chiếc bụng đói mềm");
		generalValue.setText("Ngó sang menu chúng mình nhé...");
		
	
		

		Map<String, String> listCustomerCommand = new HashMap<String, String>();
		listCustomerCommand.put("Customer 1", "Very goood....");
		listCustomerCommand.put("Customer 2", "Good good....");
		listCustomerCommand.put("Customer 3", "Bad bad....");
		
		Map<String, String> sortlistCustomerCommand = listCustomerCommand.entrySet()
				.stream()
				.sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
				.collect(Collectors.toMap(
							Map.Entry::getKey,
							Map.Entry::getValue,
							(oldValue, newValue) -> oldValue,
							LinkedHashMap::new
						));
		
		
		Map<String, String> listsBenefit = new HashMap<String, String>();
		listsBenefit.put("Chúng tôi đặt tiêu chí phục vụ khách hàng lên hàng đầu", "Toàn bộ đội ngũ nhân viên của chúng tôi thấu hiểu một điều rằng thành công của chúng tôi nằm trong những giá trị mà chúng tôi đem lại cho khách hàng. Chính vì lẽ đó chúng tôi luôn cam kết mang lại cho khách hàng những giá trị nhiều hơn sự mong đợi.");
		listsBenefit.put("Đảm bảo chất lượng", "Nguồn thực phẩm tươi sạch nguồn gốc rõ ràng. Thực phẩm được chọn lọc kỹ càng, cam kết không sử dụng các hoá chất làm ảnh hưởng đến sức khỏe mọi người.");
		listsBenefit.put("Hương vị Sài Gòn", "Món ăn được chế biến hương vị đậm đà, phù hợp với nhiều thực khách sinh sống tại Sài Gòn.");
		
		listsBenefit.put("Thực đơn mới lạ mỗi ngày", "Thường xuyên thay đổi các món ăn từng ngày, từng tuần, từng tháng, không gây cảm giác chán ngán. Mang đến bữa trưa chất lượng, tiện lợi cho dân văn phòng.");
		listsBenefit.put("Giao hàng nhanh chóng, đúng giờ", "Chúng tôi với đội ngũ giao hàng chuyên nghiệp sẽ cố gắng giao món ăn đến quý khách 1 cách nhanh chóng, đúng giờ.");
		listsBenefit.put("Phần cơm đầy đủ chất dinh dưỡng", "Mỗi phần cơm Green Gro có: Món mặn, món xào, canh, đồ tráng miệng, tăm và giấy lau.");
		listsBenefit.put("Luôn lắng nghe khách hàng", "Đội ngũ Mr. Vans luôn luôn lắng nghe những phản hồi của khách hàng để cải thiện chất lượng sản phẩm và dịch vụ ngày một tốt hơn. ");
		listsBenefit.put("Sự tin tưởng", "Thành công của chúng tôi là đạt được sự tin tưởng của khách hàng cũng như mối quan hệ mật thiết với khách hàng. Chúng tôi mong muốn khách hàng như những người bạn thâm giao bền vững của chúng tôi.");
		
		
		Map<String, String> sortListBenefits = listsBenefit.entrySet()
															.stream()
															.sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
															.collect(Collectors.toMap(
																		Map.Entry::getKey,
																		Map.Entry::getValue,
																		(oldValue, newValue) -> oldValue,
																		LinkedHashMap::new
																	));
		
		
		
		generalValue.setCustomerCommand(sortlistCustomerCommand);
		generalValue.setListsBenefit(sortListBenefits);
		

		generalValue.setIntroduction("Công ty TNHH Green Gro là một công ty chuyên cung cấp và chế biến các mặt hàng thực phẩm, Xúc xích tươi, cơm trưa văn phòng. . .Với khẩu hiệu “Thấu hiểu từng bữa cơm”, chúng tôi với mong muốn mang đến cho mọi nhà những thực phẩm sạch, tươi ngon và những bữa cơm chất lượng đến với mọi người.");
		generalValue.setVision("Trong 5 năm tới, Mr. Vans sẽ trở thành thương hiệu hàng đầu cung cấp các loại thực phẩm tươi ngon đến với mọi nhà, cửa hàng, nhà hàng. Và đặc biệt sẽ đưa các sản phẩm đặc biệt của Việt Nam ra thị trường nước ngoài.");
		generalValue.setMission("Đối với người tiêu dùng: Mr. Vans xác định cho mình sứ mệnh trở thành người bạn đồng hành “Thấu hiểu từng bữa cơm” của các bạn, dịch vụ chúng tôi cũng cấp giúp khách hàng được sử dụng những thực phẩm tươi ngon, đảm bảo chất lượng, đặc biệt tiết kiệm thời gian và giảm thiểu chi phí");
		
		Map<String, String> contacts = new HashMap<String, String>();
		contacts.put("Địa chỉ", "236/3 Nguyễn Thái Bình, Phường 12, Quận Tân Bình, Hồ Chí Minh");
		contacts.put("Hotline", "05 646464 99");
		contacts.put("Email", "phumrvans@gmail.com");
		
		generalValue.setContact(contacts);
		
//		List<GeneralValue_Entity> generalValue = generalValue_Repo.findAll();
		
		return generalValue;
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
