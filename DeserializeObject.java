import java.io.*;
public class DeserializeObject
{
    public static void main ( String[] argv ) throws Exception
    {
        FileInputStream     fis = new FileInputStream( argv[0] );
        ObjectInputStream   ois = new ObjectInputStream( fis );
        ois.readObject();
        ois.close();
        fis.close();
    }
}
