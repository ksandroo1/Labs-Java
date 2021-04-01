package laba1kruchek.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ClassesService classesService;

    @GetMapping("/lyear")
    public ResponseEntity method(

            @RequestParam(name = "input_year") int year
    ) {
        Leap_year leap_year = ClassesService.method(year);
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                leap_year.setAnswer("Visokosniy");
            }

        }
        return ResponseEntity.ok(leap_year);
    }
}