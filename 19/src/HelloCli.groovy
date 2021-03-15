@RestController
class HelloCli {
    @RequestMapping("/")
    String home() {
        "hello world"
    }
}