package com.sonhlt.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //annotation xác định class này là Controller
public class HomeController {
    //Khi người dùng truy cập vào qua phương thức GET thì sẽ được đưa tới đây để xử lý
    @GetMapping("/")
    public String homePage() {
        //Trả về trang index.html (trang chủ)
        return "index";
    }

    //Có thể tạo thêm mapping cho các endpoint khác tại đây
}
