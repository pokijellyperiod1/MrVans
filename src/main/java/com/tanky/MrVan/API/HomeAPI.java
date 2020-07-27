package com.tanky.MrVan.API;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanky.MrVan.dto.GeneralValue;
import com.tanky.MrVan.dto.Introduction;
import com.tanky.MrVan.dto.WhyChooseWe;
import com.tanky.MrVan.dto.home;

@RestController
@RequestMapping("/api/home")
public class HomeAPI {

	@GetMapping
	public GeneralValue generalValue() {
		GeneralValue generalValue = new GeneralValue();
		home Trang_Chu = new home();
		Trang_Chu.setSlogan("Hãy để chúng tôi chăm sóc cái bụng của bạn");
		Trang_Chu.setSubSlogan("Thực đơn ngon, gíá hạt dẻ cho một chiếc bụng đói mềm");
		Trang_Chu.setText("Ngó sang menu chúng mình nhé...");
		
		WhyChooseWe whychoosewe = new WhyChooseWe();
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
		
		
		
		whychoosewe.setCustomerCommand(sortlistCustomerCommand);
		whychoosewe.setListsBenefit(sortListBenefits);
		
		Introduction introduction = new Introduction();
		introduction.setIntroduction("Công ty TNHH Green Gro là một công ty chuyên cung cấp và chế biến các mặt hàng thực phẩm, Xúc xích tươi, cơm trưa văn phòng. . .Với khẩu hiệu “Thấu hiểu từng bữa cơm”, chúng tôi với mong muốn mang đến cho mọi nhà những thực phẩm sạch, tươi ngon và những bữa cơm chất lượng đến với mọi người.");
		introduction.setVision("Trong 5 năm tới, Mr. Vans sẽ trở thành thương hiệu hàng đầu cung cấp các loại thực phẩm tươi ngon đến với mọi nhà, cửa hàng, nhà hàng. Và đặc biệt sẽ đưa các sản phẩm đặc biệt của Việt Nam ra thị trường nước ngoài.");
		introduction.setMission("Đối với người tiêu dùng: Mr. Vans xác định cho mình sứ mệnh trở thành người bạn đồng hành “Thấu hiểu từng bữa cơm” của các bạn, dịch vụ chúng tôi cũng cấp giúp khách hàng được sử dụng những thực phẩm tươi ngon, đảm bảo chất lượng, đặc biệt tiết kiệm thời gian và giảm thiểu chi phí");
		
		Map<String, String> contacts = new HashMap<String, String>();
		contacts.put("Địa chỉ", "236/3 Nguyễn Thái Bình, Phường 12, Quận Tân Bình, Hồ Chí Minh");
		contacts.put("Hotline", "05 646464 99");
		contacts.put("Email", "phumrvans@gmail.com");
		
		introduction.setContact(contacts);
		
		generalValue.setHome(Trang_Chu);
		generalValue.setWhy_choose_we(whychoosewe);
		generalValue.setIntroductions(introduction);
		return generalValue;
	}
	
}
