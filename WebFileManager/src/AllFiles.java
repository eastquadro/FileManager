import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eastquadro on 13.07.2017.
 */
public class AllFiles {
 static    List<FileZ> dir = new ArrayList<FileZ>();
 static List<FileZ> file = new ArrayList<FileZ>();
 static List<String> adressStack = new ArrayList<String>();
 static String adress;

    public static String getFullAdress(String name)
    {
        String s = name;
        s = s.replace("\\","/");
        char[] sch = s.toCharArray();
        ArrayList<Character> bsch = new ArrayList<Character>();
        for(int i =0; i<sch.length+2;i++)
        {
            if(i==3)
            {
                bsch.add('/');
                bsch.add(sch[i]);
            }
            else if(i== sch.length)
            {
                bsch.add('/');
                break;
            }
            else
            {
                bsch.add(sch[i]);
            }
        }
        StringBuilder builder = new StringBuilder(bsch.size());
        for(Character ch: bsch)
        {
            builder.append(ch);
        }
        s = builder.toString();
        return  s;
    }
    public static void createFile(String name)
    {
        File file = new File(getAdress() + name);
        try {
            if (file.createNewFile()){

            }else{
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getAdress() {return adress;}
    public static void setAdress(String txt) {
        adress = txt;
    }
    public static List<FileZ> getDir(String path)
    {
        dir = new ArrayList<FileZ>();
        file = new ArrayList<FileZ>();
        walk(path);
        return dir;
    }

    public static List<FileZ> getFiles(String path) {return file;}



    public static void walk( String path ) {
        File root = new File( path );
        File[] list = root.listFiles();
        if (list == null) return;
        for ( File f : list ) {
            if ( f.isDirectory() ) {
                dir.add(new FileZ(getFullAdress(f.getAbsolutePath()),f.getName()));
            }
            else {
                file.add(new FileZ(getFullAdress(f.getAbsolutePath()),f.getName()));
            }
        }
    }
}
