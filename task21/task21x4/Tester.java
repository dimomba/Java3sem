package task21x4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class Tester {
    public static void main(String[] args) throws IOException {
        ArrayList<File> alFiles = findFiles("C:\\Users\\Dmitry\\Downloads\\Новая папка");

        int i;
        for(i = 0; i < alFiles.size() && i < 5; ++i) {
            System.out.println(((File)alFiles.get(i)).getName());
        }

        for(i = 0; i < alFiles.size() && i < 5; ++i) {
            PrintStream ex10 = System.out;
            Object var10001 = alFiles.get(i);
            ex10.println("Файл " + ((File)var10001).getName());
            System.out.println(readFile((File)alFiles.get(i)));
        }

    }

    public static ArrayList<File> findFiles(String stPAth) throws IOException {
        ArrayList<File> alFiles = new ArrayList();
        Iterator ex2 = Files.walk(Paths.get(stPAth)).filter((x$0) -> {
            return Files.isRegularFile(x$0, new LinkOption[0]);
        }).toList().iterator();

        while(ex2.hasNext()) {
            Path path = (Path)ex2.next();
            alFiles.add(new File(path.toUri()));
        }

        return alFiles;
    }

    public static String readFile(File file) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream(file);
        String stResult = "";

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            try {
                while((line = bufferedReader.readLine()) != null) {
                    stResult = stResult + line;
                    stResult = stResult + "\n";
                }
            } catch (Throwable ex7) {
                try {
                    bufferedReader.close();
                } catch (Throwable var6) {
                    ex7.addSuppressed(var6);
                }

                throw ex7;
            }

            bufferedReader.close();
            return stResult;
        } catch (IOException ex8) {
            throw new RuntimeException(ex8);
        }
    }
}
