
/**
Evan Hader
12//11//2025
Sheperd Farrie
i wil change things in my selfie
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    public static void main(String[] args)
    {
          /*
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         /**/
         
         //relative path
         Picture MeandDog = new Picture("images\\Me and Dog.jpg");
         
         
         Pixel [] pixels;
         pixels = MeandDog.getPixels();
         int total = 0, avg = 0;
         
         for (Pixel spot : pixels)
         {
             total = spot.getRed() + spot.getGreen() + spot.getBlue();
             avg = total/3;
             spot.setRed(avg);
             spot.setGreen(avg);
             spot.setBlue(avg);
         }
                     
         //MeandDog.explore();
         
         //method 1 change
         Color darkBlue = new Color(15, 21, 128);
         Color red = new Color(252, 3, 28);
         Color lightBlue = new Color(95, 207, 227);
         Color offWhite = new Color(247, 225, 227);
         
         for (Pixel spot : pixels)
         {
            if (spot.getRed() <10 && spot.getGreen() < 10 && spot.getBlue() < 10)
            {
                spot.setColor(darkBlue);
            }
            if (spot.getRed() <10 && spot.getGreen() < 10 && spot.getBlue() < 10)
            {
                spot.setColor(darkBlue);
            }
            if (spot.getRed() <10 && spot.getGreen() < 10 && spot.getBlue() < 10)
            {
                spot.setColor(darkBlue);
            }
            if (spot.getRed() <10 && spot.getGreen() < 10 && spot.getBlue() < 10)
            {
                spot.setColor(darkBlue);
            }
         }
         MeandDog.explore();
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */
         Color Grey = new Color(93, 120, 122);
         Color darkGrey = new Color(74, 89, 91);
         Color darkTeal = new Color(1, 87, 95);
         Color teal = new Color(1, 116, 127);
         
         
         //MeandDog.write("images\\MadDog1");
         
    }//main       
}//class
