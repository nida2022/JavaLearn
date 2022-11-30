package InnerClass.AnnonymusClass;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter {

    public static void main(String[] args) {
        File f = new File("src/main/java/InnerClass");
        for(String name : f.list()){
         //   System.out.println(name);
        }
        /*Annonymus Class:*/
        for(String name : f.list(new FilenameFilter() {
          @Override
           public boolean accept(File dir, String name) {
             return name.contains("An");
             }
        }))
        {
            System.out.println(name);
        }


    }
}
