
/**
 * Write a description of class ColorLabs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;//acsesses color class in awt library
import java.util.*; // * lets you import everything
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class ColorLabs
{
    public static void main(String[] args)
    {
        Picture beach = new Picture("images\\beach.jpg");
        Picture grove = new Picture("images\\gorge.jpg");
        Picture cat = new Picture("images\\kitten2.jpg");
        Picture temple = new Picture("images\\temple.jpg");
        Picture arch = new Picture("images\\arch.jpg");
        Picture forest = new Picture("images\\CumberlandIsland.jpg");
        
        //beach.explore();
        //grove.explore();
        //temple.explore();
        //arch.explore();
        //forest.explore();
        //cat.explore();
        
        Pixel [] pixels1; //creates array
        pixels1 = beach.getPixels(); // puts all the pixels inside the array
        Pixel [] pixels2;
        pixels2 = grove.getPixels();
        Pixel [] pixels3;
        pixels3 = cat.getPixels();
        int negate;
        int r, g, b;
        int avg = 0, total = 0;
        
        //inverse color
        for (Pixel spot1 : pixels1) // beach
        {
            negate = spot1.getRed();
            negate = (int)(255-negate);
            spot1.setRed(negate);
            negate = spot1.getBlue();
            negate = (int)(255-negate);
            spot1.setBlue(negate);
            negate = spot1.getGreen();
            negate = (int)(255-negate);
            spot1.setGreen(negate);
        }
        beach.explore();
        
        //grey scale
        for (Pixel spot2 : pixels2)//grove 
        {
            total = (spot2.getRed() + spot2.getGreen() + spot2.getBlue());
            avg = total/3;
            spot2.setRed(avg);
            spot2.setGreen(avg);
            spot2.setBlue(avg);
        }
        grove.explore();
        
        //lighten
        for(Pixel spot3 : pixels3)//cat
        {
            spot3.setRed((int)(spot3.getRed()*1.5));
            spot3.setGreen((int)(spot3.getGreen()*1.5));
            spot3.setBlue((int)(spot3.getBlue()*1.5));
        }
        cat.explore();
        /**/
    }
}
