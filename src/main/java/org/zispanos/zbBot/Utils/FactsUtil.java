package org.zispanos.zbBot.Utils;


import org.zispanos.zbBot.Objects.Constants;

public class FactsUtil {
    private static int randomNum;
    private static int prevNum;
    private static String donatormotd;



    public static String getFact() {
        randomNum = (int) (Math.random() * (21));
        if (randomNum == prevNum) {
            randomNum = (int) (Math.random() * (21));
        }
        prevNum = randomNum;
        donatormotd = Constants.donatormotd.get(randomNum);
        return donatormotd;
    }
    public static String getrandommotd() {
        randomNum = (int) (Math.random() * (21));
        if (randomNum == prevNum) {
            randomNum = (int) (Math.random() * (21));
        }
        prevNum = randomNum;
        donatormotd = Constants.randommotd.get(randomNum);
        return donatormotd;
    }
    public static String AternosBlacklist1() {
        randomNum = (int) (Math.random() * (2));
        if (randomNum == prevNum) {
            randomNum = (int) (Math.random() * (2));
        }
        prevNum = randomNum;
        donatormotd = Constants.donatormotd.get(randomNum);
        return donatormotd;
    }
    public static void Load(){

        /*
        Carga Los motd de donadores
        */

        Constants.donatormotd.add("A");
        Constants.donatormotd.add("Welcome to the cum zone");
        Constants.donatormotd.add("Emerece The Best Anarchy Youtuber");
        Constants.donatormotd.add("&4Trump 2020");
        Constants.donatormotd.add("Goper Infamous on Top");
        Constants.donatormotd.add("Infinium is the best clan");
        Constants.donatormotd.add("Fag free server");
        Constants.donatormotd.add("Infamous is god");
        Constants.donatormotd.add("Buy donator or sad");
        Constants.donatormotd.add("Cum in my ass and call me Obama");
        Constants.donatormotd.add("Fucked your Mom!");
        Constants.donatormotd.add("How to be sexual: Be boonoboi");
        Constants.donatormotd.add("Haha next one!");
        Constants.donatormotd.add("I bought this motd so you dont have too :)");
        Constants.donatormotd.add("This server is for big black men clan only. if you are not big black men you're gay.");
        Constants.donatormotd.add("löööööööööööööööng");
        Constants.donatormotd.add("ew Spanish. Just learn Latin and you speak all of them! :wink:");
        Constants.donatormotd.add("tps = brrrr");
        Constants.donatormotd.add("spanish be like: jajajhaahajahajbahashhs");
        Constants.donatormotd.add("Cube loves dicks");
        Constants.donatormotd.add("suck my cock till its dry");
        Constants.donatormotd.add("Ole!");

        /*
        Carga Los motds gratis
        */

        Constants.randommotd.add("Xd");
        Constants.randommotd.add("Like the cut g");
        Constants.randommotd.add("Only CramFags");
        Constants.randommotd.add("only mrc fags");
        Constants.randommotd.add("yo soy Groot!");
        Constants.randommotd.add("demoCRAZY = AnARchY");
        Constants.randommotd.add("popbob speaking here");
        Constants.randommotd.add("popbob, is that you?");
        Constants.randommotd.add("GG popbob, you just advanced to level thunderstorm!");
        Constants.randommotd.add("GG @Pistonmaster, you just advanced to level 6!");
        Constants.randommotd.add("we live in the matrix");
        Constants.randommotd.add("Im giving free cum at X 342 -Z 421");
        Constants.randommotd.add("^^^ server above this gay ^^^");
        Constants.randommotd.add("l2 go rip");
        Constants.randommotd.add("L2x9 just got fucked");
        Constants.randommotd.add("aWa de OwO");
        Constants.randommotd.add("Is a motd");
        Constants.randommotd.add("STFU NIGGER");
        Constants.randommotd.add("YourMomIsAHoe is the best 200b200t group");
        Constants.randommotd.add("JSJSJSJSJS");
        Constants.randommotd.add("Pinches jotos");
        Constants.randommotd.add("Onii-chan owo");
        Constants.randommotd.add("Onii Chan UwU");
        Constants.randommotd.add("XD");
        Constants.randommotd.add("Medio infamous");
        Constants.randommotd.add("Other");
        Constants.randommotd.add("El que Doxxe es gei");
        Constants.randommotd.add("Penis plus vagina equal semen");
        Constants.randommotd.add("no");
        Constants.randommotd.add("Leee dont suck my dick plsss");
        Constants.randommotd.add("6b6t is trash");
        Constants.randommotd.add("Minecraft’s Gloryhole");
        Constants.randommotd.add("Goper is simp");
        Constants.randommotd.add("69. No Doxxing");
        Constants.randommotd.add("01000101 01011010");
        Constants.randommotd.add("If the server crashes, we know that it was cube's brother");
        Constants.randommotd.add("Boono for admin 2021");
        Constants.randommotd.add("Fight Club every Saturday night");
        Constants.randommotd.add("Use /kill for auto dupe");
        Constants.randommotd.add("use / dupe to double your inventory");
        Constants.randommotd.add("I use a translator to speak to the Owner");
        Constants.randommotd.add("Alt F4 dupe on top");
        Constants.randommotd.add("yo no sé inglés B)");
        Constants.randommotd.add("Popbob sexdupe on top");
        Constants.randommotd.add("Mi inglés no es el mejor");
        Constants.randommotd.add("Are*");
        Constants.randommotd.add("Cube for President");
        Constants.randommotd.add("Hacks are illegals");
        Constants.randommotd.add("Wurst the best hack B)");
        Constants.randommotd.add("ez mad");
        Constants.randommotd.add("The world is off because it's an exploit");
        Constants.randommotd.add("Are you the real MrCramYT?");
        Constants.randommotd.add("Who sells bedrock?");
        Constants.randommotd.add("Penismaster");
        Constants.randommotd.add("Your ip is 127.0.0.1");
        Constants.randommotd.add("L2XLag");
        Constants.randommotd.add("Leeetard");
        Constants.randommotd.add("Get Ezzed by ZB Rewrite");
        Constants.randommotd.add("Hisparquia = Real Anarchy");
        Constants.randommotd.add("kfc client best girl");
        Constants.randommotd.add("Penis hack on top");
        Constants.randommotd.add("Free kits on 0 0");
        Constants.randommotd.add("WWE best Client for cPVP");
        Constants.randommotd.add("Phobos is gay");
        Constants.randommotd.add("Impact the BEST utility mod");
        Constants.randommotd.add("Mojang doesn't want us to use hacks");
        Constants.randommotd.add("Joining the server has been patched due to an exploit");
        Constants.randommotd.add("Why the hell are you reading this?");
        Constants.randommotd.add("Elytras deactivated at 19.99 TPS");
        Constants.randommotd.add("Haha imagine having your custom motd");
        Constants.randommotd.add("We love mbm");
        Constants.randommotd.add("Who was the retard who wrote this?!");
        Constants.randommotd.add("Free kits in  X 32442 Z -3268");
        Constants.randommotd.add("cum");
        Constants.randommotd.add("Z 16183 X 72563 Hausemaster's base");
        Constants.randommotd.add("GG @Replik, you just advanced to level 1!");
        Constants.randommotd.add("GG @Unzor, you just advanced to level 69!");

        /* Carga la blacklist de aternos */

        Constants.blacklistedaternos.add(".aternos");
        Constants.blacklistedaternos.add("aternos");
    }
}
