package com.loi.mwalima;

public class StringUtil {

    public static String fixSqlFieldValue(String value){
    //verdubbel single quates in sql string
        if(value == null){
            return null;
        }
        int lenght = value.length();

        StringBuilder fixedvalue = new StringBuilder((int)(lenght * 1.1));

        for(int i = 0; i < lenght; i++) {
            char c = value.charAt(i);
            if (c == '\'') {
                fixedvalue.append("\'\'");
            }else{
                fixedvalue.append(c);
            }
        }
        return fixedvalue.toString();
    }

    public static String encodeHtmlTag(String tag){
        if(tag == null){
            return null;
        }
        int length = tag.length();

        StringBuilder replacehtml = new StringBuilder(2 * length);

        for(int i = 0; i < length; i++){
            char c = tag.charAt(i);
            if(c== '<'){
                replacehtml.append("&lt;");
            }else if(c == '>'){
                replacehtml.append("&gt;");
            }else if(c == '&'){
                replacehtml.append("&amp;");
            }
            else if(c == '"'){
                replacehtml.append("&quot;");
            }
            else if(c == ' '){
                replacehtml.append("&nbsp;");
            }else{
                replacehtml.append(c);
            }
        }
        return replacehtml.toString();
    }
}
