package com.example.schoolweb22.Controller;


import com.example.schoolweb22.repository.AdminRepository;
import com.example.schoolweb22.service.AdminService;
import com.example.schoolweb22.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class TeachersController {

    final AdminService adminService;

    final
    AdminRepository adminRepository;

    final AuthService authService;

    @GetMapping("/teachers")
    public String TeachersPage(){
        return "";
        //teachers page html
    }

//    @PostMapping("teachers/login")
//    public String login(HttpServletRequest req, HttpServletResponse res, @ModelAttribute AdminDto adminDto, Model model){
//        String return_url = req.getParameter("return_url");
//        Admin admin = authService.getAdmin(adminDto.getPhone_number(), adminDto.getPassword());
//        if(admin==null){
//            return "redirect:/teachers/login?error&return_url="+ (return_url!=null?return_url:"/dashboard/most-sold");
//        }
//        res.addCookie(authService.generateToken(admin));
//        if(return_url!=null && return_url.startsWith("/")){
//            return "redirect:"+req.getParameter("return_url");
//        }
//        return "redirect:/dashboard/most-sold";
//    }
}
