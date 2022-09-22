package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("mycelium")) {
            return "Mycelium creates constant connection without contant attention by replying" +
                   " to emails for you!";
        } else if (query.toLowerCase().contains("name")) {
            return "THAMAADA-Team";
        } else if query.toLowerCase().contains("916") {
            return "916";
        } else if query.toLowerCase().contains("9") {
            return "18";
        }
        return "";
    }
}
