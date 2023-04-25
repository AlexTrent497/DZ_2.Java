
import java.io.*;

import java.net.URL;

import java.util.logging.Logger;



public class Sem_2 {

    private static final Logger logger = Logger.getLogger(Sem_2.class.getName());



    public static void main(String[] args) throws IOException {

        String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";



        

        URL url = new URL(fileUrl);

        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;

        StringBuilder stringBuilder = new StringBuilder();

        while ((line = reader.readLine()) != null) {

            stringBuilder.append(line);

        }

        reader.close();

        String fileContent = stringBuilder.toString();



       

        fileContent = fileContent.replaceAll("%s", "Алекс");



      

        FileWriter writer = new FileWriter("example.txt");

        writer.write(fileContent);

        writer.close();



      

        BufferedReader fileReader = new BufferedReader(new FileReader("example.txt"));

        while ((line = fileReader.readLine()) != null) {

            logger.info(line);

        }

        fileReader.close();



      

        File file = new File("example.txt");

        file.delete();

    }

}










