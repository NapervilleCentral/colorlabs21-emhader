
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
         Picture MeandDogGrey1 = new Picture("images\\MeandDog GREY SCALE.jpg");
         Picture MeandDogGrey2 = new Picture("images\\MeandDog GREY SCALE.jpg");
         
         //MeandDogGrey1.explore();
         //method 1 change
         Pixel [] pixels1;
         pixels1 = MeandDog.getPixels();
         int total = 0, avg = 0;
         
         for (Pixel spot : pixels1)
         {
             total = spot.getRed() + spot.getGreen() + spot.getBlue();
             avg = total/3;
             spot.setRed(avg);
             spot.setGreen(avg);
             spot.setBlue(avg);
         }
        
         Color darkBlue = new Color(15, 21, 128);
         Color red = new Color(252, 3, 28);
         Color lightBlue = new Color(95, 207, 227);
         Color offWhite = new Color(247, 225, 227);
         
         for (Pixel spot : pixels1)
         {
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();
            if ( r < 64 && g < 64 && b < 64) spot.setColor(darkBlue);
            else if (r >=64 && r < 128 && g >= 64 && g < 128 && b >=64 && b<128) spot.setColor(red);
            else if (r >=128 && r < 192 && g >= 128 && g < 192 && b >=128 && b<192) spot.setColor(lightBlue);
            else if (r >=192 && r < 256 && g >= 192 && g < 256 && b >=192 && b<256) spot.setColor(offWhite);
         }
         //MeandDog.explore();
         MeandDog.write("images\\MeandDog Meth1 Final.jpg");
         
         //method 2 change
         Pixel [] pixels2;
         pixels2 = MeandDogGrey1.getPixels();
         int minr = 255;
         int maxr = 0;
         int ming = 255;
         int maxg = 0;
         int minb = 255;
         int maxb = 0;
         for (Pixel spot : pixels2)
         {
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();/*
            if (r > maxr) maxr = r;
            if (r < minr) minr = r;
            if (g > maxg) maxg = g;
            if (g < ming) ming = g;
            if (b > maxb) maxb = b;
            if (b < minb) minb = b;/**/
            if ( r < 20 && g < 20 && b < 20) spot.setColor(darkBlue);
            else if (r >=20 && r < 40 && g >= 20 && g < 40 && b >=20 && b<40) spot.setColor(red);
            else if (r >=40 && r < 125 && g >= 40 && g < 125 && b >=40 && b<125) spot.setColor(lightBlue);
            else if (r >=125 && g >= 125 && b >=125) spot.setColor(offWhite);
         }
         
         //System.out.println(maxr+" "+maxg+" "+maxb);
         //System.out.println(minr+" "+ming+" "+minb);
         //MeandDogGrey1.explore();
         //MeandDogGrey1.write("images\\MeandDog Meth2 Final.jpg");
         
         /**
          * custom color palette
          */
         Color Grey = new Color(93, 120, 122);
         Color darkGrey = new Color(74, 89, 91);
         Color darkTeal = new Color(1, 87, 95);
         Color teal = new Color(1, 116, 127);
         
         //MeandDogGrey2.write("images\\MeandDog2.jpg");
         
    }//main       
}//class
