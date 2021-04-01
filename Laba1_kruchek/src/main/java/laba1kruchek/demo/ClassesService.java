package laba1kruchek.demo;


import org.springframework.stereotype.Service;

@Service
public class ClassesService {

public static Leap_year method(int year) {

    Leap_year leap_year = new Leap_year(year,"NeVisokosniy");

    return leap_year;
}

}

