package com.example.tarea5;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tarea5 {

    String str;
    String max_v;
    int ascii;
    int count;
    int max;
    int[] result_arr = new int[26];
    String result;

    @RequestMapping("/")
    public String index(@RequestParam String[] content) {
        setString(content);
        return countChars();
//        return setReturn();
    }



    public void setString(String[] paragraph) {
        str = String.join("", paragraph);
        str = str.toLowerCase();
    }

    public String countChars() {
        result = "";
        for (int i = 0; i < 10; i++) {
            ascii = 97;
            max = 0;
            for (int j = 0; j < 26; j++) {
                count = 0;
                for (int k = 0; k < str.length(); k++) {
                    if ((int) str.charAt(k) == ascii) {
                        count++;
                        if (max < count) {
                            max = count;
                            max_v = String.valueOf(str.charAt(k));
                        }
                    }
                }
                ascii++;
            }
            System.out.println(Character.toString((char) ascii) + " has " + count);
            System.out.println(max_v);
            str = str.replaceAll(max_v, "");
            str = str.trim();
            result = result + "<br>" + "* " + max_v + " = " + max + " ";
            if (max < 10) {
                result = result + " ";
            }
            for (int k = 0; k < max; k++) {
                result = result + "*";
            }
        }
        return result;
    }
}