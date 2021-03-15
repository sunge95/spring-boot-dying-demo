@Grab("org.springframework.boot:spring-boot-starter-thymeleaf:2.2.0.RELEASE")
@Grab("org.webjars:jquery:3.4.1")
@Controller
class HelloCliView {

    @RequestMapping("/")
    String home(Model model) {
        model.addAttribute("name","Hello World!")
        return "welcome"
    }
}
