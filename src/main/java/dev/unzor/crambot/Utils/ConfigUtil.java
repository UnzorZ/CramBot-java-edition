package dev.unzor.crambot.Utils;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ConfigUtil {
    public static String cver = "default";
    public static String botVer = "default";
    private static File file = new File("config.json");
    
    public static void saveConfig() throws IOException {
        new Thread(() ->
        {
            try {
                GsonBuilder builder = new GsonBuilder();

                Gson gson = builder.setPrettyPrinting().create();

                Writer writer = Files.newBufferedWriter(Paths.get(file.getPath()));
                Map<String, String> map = new HashMap<>();

                map.put("ClientVersion",cver);
                map.put("BotVersion",botVer);

                gson.toJson(map, writer);
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }).start();
    }

    public enum Types {
        SEX,
        SED,
        LMFAO
    }

    public static String loadVersion(String current) throws IOException {
        String version;
        String line;
        if (current.equals("client")){
            line = Files.readAllLines(Paths.get(file.getPath())).get(2);
            String repl1 = line.replace("ClientVersion","").replace(":","");
            version = repl1.replaceAll("\"","").replace(" ","");
        }else{
            line = Files.readAllLines(Paths.get(file.getPath())).get(1);
            String repl1 = line.replace("BotVersion","").replace(":","").replace(",","");
            version = repl1.replaceAll("\"","").replace(" ","");
        }
        System.out.println(version);

        return version;
    }




}

