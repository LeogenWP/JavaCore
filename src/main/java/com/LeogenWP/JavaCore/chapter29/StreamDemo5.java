package com.LeogenWP.JavaCore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phonenum;

    public NamePhone(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }
}

public class StreamDemo5 {
    public static void main(String[] args) {
        List<NamePhoneEmail>  myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Garry","123","gary123@mail.ru"));
        myList.add(new NamePhoneEmail("Barry","345","bary345@mail.ru"));
        myList.add(new NamePhoneEmail("Darry","567","dary567@mail.ru"));

        System.out.println("Origin elements from a list: ");
        myList.stream().forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();
        Stream<NamePhone> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name,a.phonenum)
        );
        System.out.println(" name and phone: ");
        nameAndPhone.forEach((a) -> System.out.println(a.name + " " +  a.phonenum));
    }

}
