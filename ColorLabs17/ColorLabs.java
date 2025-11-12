
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
        
        Pixel [] pixels1; //creates array
        pixels1 = beach.getPixels(); // puts all the pixels inside the array
        
        Pixel [] pixels2;
        pixels2 = grove.getPixels();
        
        Pixel [] pixels3;
        pixels3 = cat.getPixels();
        
        Pixel [] pixels4;
        pixels4 = temple.getPixels();
        
        Pixel [] pixels5;
        pixels5 = arch.getPixels();
        
        Pixel [] pixels6;
        pixels6 = forest.getPixels();
        
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
        
        /*
        //darken
        for(Pixel spot4 : pixels4)//temple
        {
            spot4.setRed((int)(spot4.getRed()*.5));
            spot4.setGreen((int)(spot4.getGreen()*.5));
            spot4.setBlue((int)(spot4.getBlue()*.5));
        }/**/
        //temple.explore();
        
        //change color
        for (Pixel spot4 : pixels4)//temple
        {
            if(spot4.getRed() > 180 && spot4.getGreen() > 180)
            {
              spot4.setColor(Color.green);
            }
        }
        temple.explore();
        
        //colorify
        for (Pixel spot5 : pixels5)//arch
        {
            spot5.setRed((int)(spot5.getRed()*.7));
            spot5.setGreen((int)(spot5.getGreen()*.7));
            spot5.setBlue((int)(spot5.getBlue()*1.7));
        }
        arch.explore();
        
        for (Pixel spot6 : pixels6)//forest
        {
           spot6.setRed((int)(spot6.getRed()*2.86));
           spot6.setGreen((int)(spot6.getGreen()*1.75));
           spot6.setBlue((int)(spot6.getBlue()*2.309)); 
        }
        forest.explore();
    }
}
