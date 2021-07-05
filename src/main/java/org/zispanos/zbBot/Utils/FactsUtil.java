package org.zispanos.zbBot.Utils;


import org.zispanos.zbBot.Objects.Constants;

public class FactsUtil {
    private static int randomNum;
    private static int prevNum;
    private static String donatormotd;
    private static String dadjoke;
    private static String porcentajes;
    private static String cope;
    private static String based;
    private static String virgin;
    private static String cramfag;
    private static String uwunzorfan;


    public static String getFact() {
        randomNum = (int) (Math.random() * (76));
        if (randomNum == prevNum) {
            randomNum = (int) (Math.random() * (76));
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
    public static String getDadJoke() {
        randomNum = (int) (Math.random() * (130));
        if (randomNum == prevNum) {
            randomNum = (int) (Math.random() * (130));
        }
        prevNum = randomNum;
        dadjoke = Constants.dadjoke.get(randomNum);
        return dadjoke;
    }
    public static String getPorcentajes() {
        randomNum = (int) (Math.random() * (100));
        if (randomNum == prevNum) {
            randomNum = (int) (Math.random() * (100));
        }
        prevNum = randomNum;
        porcentajes = Constants.penis.get(randomNum);
        return porcentajes;
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

            /* Carga las Dad Jokes */

            Constants.dadjoke.add("Que hace una persona con ketchup en la oreja, escuchando salsa");
            Constants.dadjoke.add("¿Cuál es el vino más amargo? Vino mi suegra.");
            Constants.dadjoke.add("La nueva cocinera es un sol. ¿Cocina bien? No, lo quema todo.");
            Constants.dadjoke.add("Padre, ¿qué puedo hacer por mis pecados? Ora, hijo mío, ora. Las once y media, padre.");
            Constants.dadjoke.add("¿Cómo llama el vaquero a su hija? ¡Hiiiiiiiiiiiiiiiija!");
            Constants.dadjoke.add("¿Qué le dijo un techo a otro techo? Te echo de menos.");
            Constants.dadjoke.add("¿Qué le dijo el número dieciocho al número dos? ¡Veinte conmigo!");
            Constants.dadjoke.add("¿Porque metieron al rompecabezas a la cárcel? Porque estaba armado");
            Constants.dadjoke.add("¿Qué le dice un gusano a otro gusano? Me voy a dar una vuelta a la manzana.");
            Constants.dadjoke.add("¿Cómo puedes saber si hay un elefante debajo de tu cama? Porque estas tocando el techo con tu nariz.");
            Constants.dadjoke.add("¿Por qué el elefante no usa crema Nivea? Porque su patita no cabe en la lata");
            Constants.dadjoke.add("¿Qué planeta va después de Marte? Miércole");
            Constants.dadjoke.add("¿Cuál es el animal más viejo del mundo? La vaca porque aún se ve en blanco y negro.");
            Constants.dadjoke.add("¿Por qué algunos niños ponen azúcar debajo de la almohada? Para tener dulces sueños");
            Constants.dadjoke.add("¿Cómo saludan los mares y los océanos? Con una ola");
            Constants.dadjoke.add("Papá, ¿qué se siente tener un hijo tan guapo? No los sé hijo, pregúntale a tu abuelo…");
            Constants.dadjoke.add("¿Por qué algunos niños ponen azúcar debajo de la almohada? Para tener dulces sueños");
            Constants.dadjoke.add("¿Cómo puedes saber si hay un elefante debajo de tu cama? Porque estas tocando el techo con tu nariz.");
            Constants.dadjoke.add("¿Cómo saludan los mares y los océanos? Con una ola");
            Constants.dadjoke.add("¿Cómo se le conoce a un blanco en el guetto? Una victima");
            Constants.dadjoke.add("Esto son dos mosquitos que van en una moto y el de atrás le dice al de delante: ¡Oye, para, que se me ha metido una mosca en el ojo…!");
            Constants.dadjoke.add("¿Cómo se dice adivinador en japonés? Komosabe");
            Constants.dadjoke.add("¿Qué hace una ratita sentada en un banquito? ¡Esperando un ratito!");
            Constants.dadjoke.add("¿Cual es el desodorante favorito de los dinosaurios? El rex-ona");
            Constants.dadjoke.add("¿De qué murió el señor que inventó la almohada de piedra? De un almohadazo");
            Constants.dadjoke.add("Mamá, mamá, en el colegio me llaman mentiroso. Pero hijo, ¡Tú no vas al colegio!");
            Constants.dadjoke.add("¿Por qué el elefante no usa crema Nivea? Porque su patita no cabe en la lata");
            Constants.dadjoke.add("Pedrito, ¿qué planeta va después de Marte? Miércoles");
            Constants.dadjoke.add("Como se llama el hermano enfermo de hello kitty? Bronkitty.");
            Constants.dadjoke.add("¿Cuál es el colmo de un astronauta? Tener un hijo lunático.");
            Constants.dadjoke.add("¿Me das tu teléfono? Sí hombre, ¿y con qué llamo a mis amigos?.");
            Constants.dadjoke.add("¿Qué es una bodega? La mamá de los bodeguitos..");
            Constants.dadjoke.add("¿Porqué metieron al rompecabezas a la cárcel? Porque estaba armado");
            Constants.dadjoke.add("Iban volando 2 globitos, el papá y el hijo, van por el desierto, cuando el papá le dice a su hijo: ¡ten cuidado con los cactusssss !, y el hijo le contesta: ¿Cómo dicesssssss???");
            Constants.dadjoke.add("¿Cómo se dice puerta en inglés? – Door. -¿Y el que las vende? – Vende Door.");
            Constants.dadjoke.add("Cómo se llama el primo vegetariano de Bruce Lee? Pues, Broco Lee.");
            Constants.dadjoke.add("¡Profe, profe, me han robado! –  ¿Y qué te han quitado? – La tarea.\n");
            Constants.dadjoke.add("¿Qué le dijo la luna al sol? ” Eres tan grande y todavía no te dejan salir de noche “.");
            Constants.dadjoke.add("¿Qué le dice un árbol a otro árbol? – Nos han dejado plantados.");
            Constants.dadjoke.add("Había un hombre tan calvo, pero tan calvo, que hasta se le veían las ideas.");
            Constants.dadjoke.add("¿Qué hace un pato con una pata? – Caerse.");
            Constants.dadjoke.add("Niños no jueguen con fuego. – Y entonces Fuego se quedó sin amigos.");
            Constants.dadjoke.add("¿Cómo se dice ascensor en árabe? Ali Baba.");
            Constants.dadjoke.add("Erase una vez una mujer tan alta, pero tan alta que se cayó el lunes y llegó al suelo el viernes.");
            Constants.dadjoke.add("¿Cómo está tu mujer? Regular. – ¿Por qué, está enferma? – No, es que todas las demás están mejor.");
            Constants.dadjoke.add("¿Cómo se ríe un ojo? !Ojojojojojojo!.");
            Constants.dadjoke.add("Era un príncipe tan aburrido, tan aburrido… que cenicienta se marchó a las diez.");
            Constants.dadjoke.add("¿Cuál  es el santo de los zapatos? – San dalia.");
            Constants.dadjoke.add("Los matemáticos no orinan, hacen Pi Pi.");
            Constants.dadjoke.add("¿Me da una habitación con baño? – Le damos la habitación pero el baño se lo tiene que dar Ud mismo.");
            Constants.dadjoke.add("Oye se murió Amparo. – Vaya lo siento mucho ¿Y cómo está su marido?. -Desamparado.\n");
            Constants.dadjoke.add("¿Cuál es el colmo de Aladino?. – Tener mal genio.");
            Constants.dadjoke.add("¿Qué es un burro?. – Un caballo que no quiso estudiar.");
            Constants.dadjoke.add("¿Cuál es el colmo de un policia?. – Tener dos esposas.");
            Constants.dadjoke.add("¿Cómo se dice pañuelo en japonés?. – Sacamoko.");
            Constants.dadjoke.add("¿Qué le dice un pato a otro pato?. – Vamos empatados.");
            Constants.dadjoke.add("¿A dónde van las pulgas cuando se mueren?. – Al pulgatorio.");
            Constants.dadjoke.add("¿Qué le dijo la nariz al dedo?. – ¡Deja de meterte conmigo!.");
            Constants.dadjoke.add("Papá, papá, en la escuela te dicen el gallo. – Y Kikiriquihaga.");
            Constants.dadjoke.add("¿Qué le dijo el 0 al 8?. – Me gusta tu cinturón.");
            Constants.dadjoke.add("¿Cuál es el colmo de un ladrón?. – Llamarse Esteban Dido.");
            Constants.dadjoke.add("¿Cuál es el baile favorito del tomate?. – La salsa.");
            Constants.dadjoke.add("¿Qué pasa si una vaca se traga un vidrio?. – La leche le sale cortada.");
            Constants.dadjoke.add("¿Qué hace una vaca pensando?. – Hace leche concentrada.");
            Constants.dadjoke.add("Mamá mi tarea a conmovido al maestro. – ¿Cómo lo sabes Pepito?. – Porque dijo que daba pena.");
            Constants.dadjoke.add("¿Pepito por qué le pegaste a tu hermana con la silla?. – ¡Porque el sofá estaba muy pesado mamá!.");
            Constants.dadjoke.add("¿Pepito y su tarea de matemáticas?. – Se suicidó profe, tenía muchos problemas.");
            Constants.dadjoke.add("Mamá mamá en la escuela me dicen mentiroso. – Ay Pepito ni siquiera vas a la escuela.");
            Constants.dadjoke.add("Pepito ¿ud. como se imagina la escuela ideal?. – Cerrada todo el tiempo profe.");
            Constants.dadjoke.add("Mamá ya me aburrí de jugar al rompecabezas con Jaimito. – ¿Y eso por qué Pepito?. – Porque al primer piedrazo en la cabeza se pone a llorar.");
            Constants.dadjoke.add("Papá papá pásame otro shampoo, que este dice para cabello seco y yo ya me lo mojé.");
            Constants.dadjoke.add("Pepito le dijiste a tu hermanita que es fea y ahora está llorando, ve y dile que lo sientes. – Se va Pepito donde su hermanita y le dice: ¡Hermanita siento mucho que seas tan fea!.");
            Constants.dadjoke.add("Pepito, ¿qué harías si te estuvieras ahogando en alta mar? – ¡Llorar para desahogarme!.");
            Constants.dadjoke.add("Hijo, por qué vienes ebrio? – Mamá, pero tú me dijiste EMBRIAGATE! – Te dije ¡ABRIGATE Imbécil! A-B-R-I-G-A-T-E.");
            Constants.dadjoke.add("A qué te dedicas? – A mover vacas – Ahhh eres ganadero, – No, soy maestro de Zumba.");
            Constants.dadjoke.add("Amor parece que nunca me escuchas, – Y yo a ti amor.");
            Constants.dadjoke.add("Amorcito me veo vieja, gorda y fea ¿Qué tengo? – Razón amor, razón.");
            Constants.dadjoke.add("Mi vida, de ahora en adelante te llamaré Eva, por ser mi primera mujer, – Bueno, yo te llamaré Dálmata, por ser el 101.");
            Constants.dadjoke.add("¿Cuál es el colmo de un constructor? llamarse Armando Paredes.");
            Constants.dadjoke.add("Todo eran risas, hasta que nos dimos que el tartamudo quería jamón.");
            Constants.dadjoke.add("Mamá, en el colegio me llaman distraído, – Juanito tu vives en la casa de al frente.");
            Constants.dadjoke.add("Mi amor ¿Puedes cambiar al bebé? – Creí que nunca me lo pedirías, ¿Tú crees que nos darán por él una PS4?.");
            Constants.dadjoke.add("¿Tiene pastillas para la flojera? – Si. – Me pone una en la boca por favor.");
            Constants.dadjoke.add("No entiendo por qué no consigo pareja, – ¿Ya probaste quitándote el bigote?, – Aun no. – Pues hazlo Paola.");
            Constants.dadjoke.add("Mamá mamá en la escuela me llaman vaca, – ¿Quién hijo? – Muuuuuuuucha gente.");
            Constants.dadjoke.add("Éste era un jugador tan, pero tan malo que cuando metió un gol, en la repetición lo falló.");
            Constants.dadjoke.add("Camarero ¿qué tiene de entrada? – Pues, una puerta de vidrio.");
            Constants.dadjoke.add("Disculpe mi sopa tiene un pelo. – Ahhh, es un cabello de ángel. – ¿De ángel?. – Si, Ángel el cocinero.");
            Constants.dadjoke.add("¿Cuál es tu plato favorito? – El hondo, porque cabe más comida.");
            Constants.dadjoke.add("Doctor, doctor ¡Me duele aquí!. – Pues váyase allí.");
            Constants.dadjoke.add("¿Qué hace un vampiro con un tractor?. – Sembrar el miedo.");
            Constants.dadjoke.add("Mamá mamá, ya no quiero conocer a mi abuelito… Cállate y sigue escavando.");
            Constants.dadjoke.add("Cuál es el colmo de un bombero? Tener una mujer ardiente.");
            Constants.dadjoke.add("Cómo se dice subir en moto en árabe? Sube la raja a la Yamaha.");
            Constants.dadjoke.add("Papá, papá, Mamá se quiere tirar por la ventana – Pues dile a tu madre que le he puesto cuernos no alas.");
            Constants.dadjoke.add("Cuál es el colmo de un enano? Que un policía le diga ¡ALTO!.");
            Constants.dadjoke.add("¿Cuál es el vino más amargo? – Vino mi suegra.");
            Constants.dadjoke.add("Era un cocinero tan feo pero tan feo, que hacía llorar a las cebollas.");
            Constants.dadjoke.add("¿Como sacas a Superman del agua? Pues oxidado ya que es el hombre de acero.");
            Constants.dadjoke.add("Oye ¿tú estudias derecho? No, yo estudio sentado.");
            Constants.dadjoke.add("Un niño de tres años observaba sus testículos mientras su mamá le bañaba. “Mami” preguntó “¿Es este mi cerebro?””Todavía no”, contestó la madre.");
            Constants.dadjoke.add("¿Qué pasa si juntas a la maestra con un vampiro? – obtienes un examen de sangre.");
            Constants.dadjoke.add("Le dice un español a un chino: Hola, y el chino le contesta: Las 12:15.");
            Constants.dadjoke.add("Jaimito define “telepatía”. – Aparato de TV para la hermana de mi mamá.");
            Constants.dadjoke.add("¿Sabe Ud inglés?. – Si. – ¿Cómo se dice fiesta?. – Party. – Úselo en una frase. – Ayer me party los dientes en una bicicleta.");
            Constants.dadjoke.add("Un policía obeso cae sobre un ladrón – Fue detenido con todo el peso de la ley.");
            Constants.dadjoke.add("Si un argentino se contagia de ébola ¿éboludo?.");
            Constants.dadjoke.add("¿Cómo queda un mago después de comer? MAGOrdito.");
            Constants.dadjoke.add("Incendio en el zoológico – Sospechan de las llamas.");
            Constants.dadjoke.add("¿Qué le dice una impresora a la otra? – Esa hoja es tuya o es impresión mía.");
            Constants.dadjoke.add("¿Cómo se dice veterinario en inglés? DOGtor.");
            Constants.dadjoke.add("Era un chiste tan malo, tan malo, que le pegaba a los chistes más pequeños.");
            Constants.dadjoke.add("¿Cuál es el santo de los zapatos? – San Dalia.");
            Constants.dadjoke.add("Papá ¿Que hace una vaca en la calle? – No se, – Vacaminando Ja Ja Ja.");
            Constants.dadjoke.add("Doctor tengo todo el cuerpo cubierto de pelo ¿qué padezco? – Padece usted un osito.");
            Constants.dadjoke.add("Parece que su tos está mejor. – Si doctor, estuve practicando toda la noche.");
            Constants.dadjoke.add("¡Camarero! este filete tiene muchos nervios. – Normal, es que es la primera vez que se lo comen.");
            Constants.dadjoke.add("¿Qué coche usa Papá Noel? – Un renol.");
            Constants.dadjoke.add("Ana, no quiero presionarte pero necesito una respuesta ahora ¿él o yo?. – Él. – Te daré 2 días más.");
            Constants.dadjoke.add("¿De dónde son los mayas?. – De Mayami.");
            Constants.dadjoke.add("Si no hay vida en Marte, imagínate en Lunes.");
            Constants.dadjoke.add("Hola, ¿tiene un libro sobre el cansancio?. – No, están todos agotados.");
            Constants.dadjoke.add("¿Qué hace una abeja en un gimnasio?. – Zumba.");
            Constants.dadjoke.add("¿Qué le dice un pez a otro pez?. – Nada.");
            Constants.dadjoke.add("¿Cuál es la fruta más impaciente?. – La manzana, porque no es pera.");
            Constants.dadjoke.add("Hola, ¿hablo al hospital infantil?. – Ti, ¿Qué le lele?.");
            Constants.dadjoke.add("¿Cómo se dice 99 en chino?. – Cachi chien.");
            Constants.dadjoke.add("Me compré un reloj nuevo. – ¿Qué marca?. – La hora.");
            Constants.dadjoke.add("¿Cómo se dice dentista en japonés?. – Tekito Lacarie.");
            Constants.dadjoke.add("¿Qué pasa si juntas un chicle con una moto?. – Que tendrás una motochicleta.");
            Constants.dadjoke.add("¿Te cuento un chiste al revés?. – Bueno, pues primero ríete.");
            Constants.dadjoke.add("Mamá mamá en el colegio me dicen shampoo. – Ya Jhonson, no más lágrimas.");

            /*  Carga los % de penis */

            Constants.penis.add("0%");
            Constants.penis.add("1%");
            Constants.penis.add("2%");
            Constants.penis.add("3%");
            Constants.penis.add("4%");
            Constants.penis.add("5%");
            Constants.penis.add("6%");
            Constants.penis.add("7%");
            Constants.penis.add("8%");
            Constants.penis.add("9%");
            Constants.penis.add("10%");
            Constants.penis.add("11%");
            Constants.penis.add("12%");
            Constants.penis.add("13%");
            Constants.penis.add("14%");
            Constants.penis.add("15%");
            Constants.penis.add("16%");
            Constants.penis.add("17%");
            Constants.penis.add("18%");
            Constants.penis.add("19%");
            Constants.penis.add("20%");
            Constants.penis.add("21%");
            Constants.penis.add("22%");
            Constants.penis.add("23%");
            Constants.penis.add("24%");
            Constants.penis.add("25%");
            Constants.penis.add("26%");
            Constants.penis.add("27%");
            Constants.penis.add("28%");
            Constants.penis.add("29%");
            Constants.penis.add("30%");
            Constants.penis.add("31%");
            Constants.penis.add("32%");
            Constants.penis.add("33%");
            Constants.penis.add("34%");
            Constants.penis.add("35%");
            Constants.penis.add("36%");
            Constants.penis.add("37%");
            Constants.penis.add("38%");
            Constants.penis.add("39%");
            Constants.penis.add("40%");
            Constants.penis.add("41%");
            Constants.penis.add("42%");
            Constants.penis.add("43%");
            Constants.penis.add("44%");
            Constants.penis.add("45%");
            Constants.penis.add("46%");
            Constants.penis.add("47%");
            Constants.penis.add("48%");
            Constants.penis.add("49%");
            Constants.penis.add("50%");
            Constants.penis.add("51%");
            Constants.penis.add("52%");
            Constants.penis.add("53%");
            Constants.penis.add("54%");
            Constants.penis.add("55%");
            Constants.penis.add("56%");
            Constants.penis.add("57%");
            Constants.penis.add("58%");
            Constants.penis.add("59%");
            Constants.penis.add("60%");
            Constants.penis.add("61%");
            Constants.penis.add("62%");
            Constants.penis.add("63%");
            Constants.penis.add("64%");
            Constants.penis.add("65%");
            Constants.penis.add("66%");
            Constants.penis.add("67%");
            Constants.penis.add("68%");
            Constants.penis.add("69% Nice number");
            Constants.penis.add("70%");
            Constants.penis.add("71%");
            Constants.penis.add("72%");
            Constants.penis.add("73%");
            Constants.penis.add("74%");
            Constants.penis.add("75%");
            Constants.penis.add("76%");
            Constants.penis.add("77%");
            Constants.penis.add("78%");
            Constants.penis.add("79%");
            Constants.penis.add("80%");
            Constants.penis.add("81%");
            Constants.penis.add("82%");
            Constants.penis.add("83%");
            Constants.penis.add("84%");
            Constants.penis.add("85%");
            Constants.penis.add("86%");
            Constants.penis.add("87%");
            Constants.penis.add("88%");
            Constants.penis.add("89%");
            Constants.penis.add("90%");
            Constants.penis.add("91%");
            Constants.penis.add("92%");
            Constants.penis.add("93%");
            Constants.penis.add("94%");
            Constants.penis.add("95%");
            Constants.penis.add("96%");
            Constants.penis.add("97%");
            Constants.penis.add("98%");
            Constants.penis.add("99%");
            Constants.penis.add("100%");



        }
    }
