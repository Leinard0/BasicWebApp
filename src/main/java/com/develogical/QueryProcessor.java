package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the Englih language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("mycelium")) {
            return "Mycelium creates constant connection without contant attention by replying" +
                   " to emails for you!";
        } else if (query.toLowerCase().contains("name")) {
            return "THAMAADA-Team";
        } else if (query.toLowerCase().contains("plus")) {
            return plus(query.toLowerCase());
        } else if (query.toLowerCase().contains("largest")) {
            return largest(query.toLowerCase());
        } else if (query.toLowerCase().contains("multiplied")) {
            return multiply(query.toLowerCase());
        } else if (query.toLowerCase().contains("minus")) {
            return minus(query.toLowerCase());
        }
        return "";
    }
    
    public String plus(String query){
        String[] ary = query.split(" ");
        return ""+Integer.parseInt(ary[2])+Integer.parseInt(ary[4]);
    }
    public String minus(String query){
        String[] ary = query.split(" ");
        return ""+(Integer.parseInt(ary[2])-Integer.parseInt(ary[4]));
    }
    public String multiply(String query){
        String[] ary = query.split(" ");
        return ""+(Integer.parseInt(ary[2])*Integer.parseInt(ary[5]));
    }
    public String largest(String query){
        String[] ary = query.split(" ");
        String[] ary2 = ary[8].split(",");
        return ""+ Math.max(Integer.parseInt(ary2[0]), Integer.parseInt(ary[9]));
    }
}
