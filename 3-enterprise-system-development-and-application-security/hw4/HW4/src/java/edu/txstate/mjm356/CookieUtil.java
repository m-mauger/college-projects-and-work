/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.mjm356;

import java.util.Arrays;
import javax.servlet.http.Cookie;

/**
 *
 * @author Owner
 */
public class CookieUtil {
        public static String getCookieValue(Cookie[] cookies, String cookieName){
        String cookieValue = "";
        Cookie cookie = Arrays.asList(cookies).stream()
                                .filter(c -> c.getName().equals(cookieName))
                                .findAny()
                                .orElse(null);
        if (cookie != null){
            cookieValue = cookie.getValue();
        }
        return cookieValue;
    }
}
