import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main<s> {

    private static final String PATH = "/Users/aleksey/projects/files/";

    public static void main(String[] args) {
        File dir1 = new File(PATH+"src");
        File dir2 = new File(PATH+"res");
        File dir3 = new File(PATH+"savegames");
        File dir4 = new File(PATH+"temp");

        File dir1_1 = new File(PATH+"src/main");
        File dir1_2 = new File(PATH+"src/test");

        File dir2_1 = new File(PATH+"res/drawables");
        File dir2_2 = new File(PATH+"res/vectors");
        File dir2_3 = new File(PATH+"res/icons");



        File myFile1 = new File(PATH+"src/main/Main.java");
        File myFile2 = new File(PATH+"src/main/Utils.java");
        File myFile3 = new File(PATH+"temp/Temp.txt");

       if (myFile3.exists()) { myFile3.delete();}

        if (dir1.mkdir()) {System.out.println("Каталог создан: " + dir1.getAbsolutePath());}
        if (dir2.mkdir()) {System.out.println("Каталог создан: " + dir2.getAbsolutePath());}
        if (dir3.mkdir()) {System.out.println("Каталог создан: " + dir3.getAbsolutePath());}
        if (dir4.mkdir()) {System.out.println("Каталог создан: " + dir4.getAbsolutePath());}

        if (dir1_1.mkdir()) {System.out.println("Каталог создан: " + dir1_1.getAbsolutePath());}
        if (dir1_2.mkdir()) {System.out.println("Каталог создан: " + dir1_2.getAbsolutePath());}
        if (dir2_1.mkdir()) {System.out.println("Каталог создан: " + dir2_1.getAbsolutePath());}
        if (dir2_2.mkdir()) {System.out.println("Каталог создан: " + dir2_3.getAbsolutePath());}
        if (dir2_3.mkdir()) {System.out.println("Каталог создан: " + dir2_3.getAbsolutePath());}

        try {
            if (myFile1.createNewFile()) {
                String msg = "Файл был создан: " + myFile1.getName();
                writeInfoToFile(myFile1, msg);
            } else {
                String msg = "Файл уже существует: " + myFile1.getName();
                writeInfoToFile(myFile1, msg);
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            if (myFile2.createNewFile()) {
                String msg = "Файл был создан: " + myFile2.getName();
                writeInfoToFile(myFile1, msg);
            }  else {
                String msg = "Файл уже существует: " + myFile2.getName();
                writeInfoToFile(myFile2, msg);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void writeInfoToFile(File file, String msg) {
        File myFile3 = new File(PATH+"temp/Temp.txt");
        try (FileWriter writer = new FileWriter(myFile3, true)) {
            writer.write(msg+"\n");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    }



