package org.zispanos.zbBot.Utils;


import java.io.IOException;

public class PrioqUtil {

    public static String getPrioqNumber() throws IOException {
        String result = UrlReaderUtil.readStringFromURL("https://api.2b2t.dev/prioq");

        String[] array = UrlReaderUtil.StringArrayToArray(result);



        return array[array.length - 2];

    }
    public static String getPrioqTime() throws IOException {
        String result = UrlReaderUtil.readStringFromURL("https://api.2b2t.dev/prioq");

        String[] array = UrlReaderUtil.StringArrayToArray(result);

        String time1 = array[array.length -1];
        String time = time1.replaceAll("([\"])","");

        return time;
    }
}
