package hwAnnotationSaver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@SaveTo(path = "e:\\file.txt")
public class TextContainer {

   protected String s = "Лаба 7 сделанаааа!";

    @Saver
    public void save(String path) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
                writer.println(this.s);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
