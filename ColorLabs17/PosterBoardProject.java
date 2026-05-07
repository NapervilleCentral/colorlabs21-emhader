
/**
 * Write a description of class PosterBoardProject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;//acsesses color class in awt library
import java.util.*; // * lets you import everything
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class PosterBoardProject
{
    
    //public static Picture canvas = new Picture("images\\canvas.jpg");
    
    public static void main(String[] args)
    {
        Picture berserk = new Picture("images\\Berserk.jpg");
        berserk.explore();
    }
    
    
    
  //mirros across the vertical
    public static void mirrorVertical()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      int width = berserk.getWidth();
      int mirrorPoint = width/2;
      
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      //loop through all the rows
      for(int y = 0; y < berserk.getHeight(); y++)
      {
          //loop from 0 - middle (mirror point0
          for(int x = 0; x < mirrorPoint; x++)
          {
             leftPixel = berserk.getPixel(x,y);
             rightPixel = berserk.getPixel(width-1-x, y); 
             rightPixel.setColor(leftPixel.getColor());
          }
      }
      berserk.explore();
  }
  
  
  
  //makes all the red things more blue
  public static void redToBlue()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Pixel spot = null;
      for(int y = 0; y < berserk.getHeight(); y++)
      {
          for(int x = 0; x < berserk.getWidth(); x++)
          {
              spot = berserk.getPixel(x,y);
              spot.setBlue(spot.getRed());
          }
      }
      berserk.explore();
  }
  
  
  
  //makes all the red things more blue
  public static void aGrey()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Pixel spot = null;
      int avg;
      for(int y = 0; y < berserk.getHeight(); y++)
      {
          for(int x = 0; x < berserk.getWidth(); x++)
          {
              spot = berserk.getPixel(x,y);
              if(spot.getRed() < 100 && spot.getGreen() > 150)
              {
                  avg = (int)spot.getAverage();
                  spot.setRed(avg);
                 spot.setGreen(avg);
                 spot.setBlue(avg);
              }
          }
      }
      berserk.explore();
  }
  
  
    //inverts all the colors  
  public static void ColorInvert()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Pixel spot = null;
      int red;
      int green;
      int blue;
      for(int y = 0; y < berserk.getHeight(); y++)
      {
          for(int x = 0; x < berserk.getWidth(); x++)
          {
              spot = berserk.getPixel(x,y);
              red = 255-spot.getRed();
              green = 255-spot.getGreen();
              blue = 255-spot.getBlue();
              
              spot.setRed(red);
              spot.setGreen(green);
              spot.setBlue(blue);
          }
      }
      berserk.explore();
  }
  
  
  
  //overlap berserk and pipen image by averaging their colors
  public static void overlap()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Picture pipen = new Picture("images\\Pipen.jpg");
      
      Pixel spot1 = null;
      Pixel spot2 = null;
      
      int red;
      int green;
      int blue;
      for(int y = 0; y < berserk.getHeight(); y++)
      {
          for(int x = 0; x < berserk.getWidth(); x++)
          {
              spot1 = berserk.getPixel(x,y);
              spot2 = pipen.getPixel(x,y);
              red = (spot1.getRed() + spot2.getRed()) /2;
              green = (spot1.getGreen() + spot2.getGreen()) /2;
              blue = (spot1.getBlue() + spot2.getBlue()) /2;
              
              spot1.setRed(red);
              spot1.setGreen(green);
              spot1.setBlue(blue);
          }
      }
      berserk.explore();
  }
  
  
  
  
  //recursivley makes the image smaller in the middle
  public static void sendIn()
  {
    Picture berserk = new Picture("images\\Berserk.jpg");
    sendIn(berserk, 0, 0, berserk.getWidth(), berserk.getHeight());
    berserk.explore();
  }
  private static void sendIn(Picture pic, int startX, int startY, int width, int height)
  {
      //half
      int newWidth = width/2;
      int newHeight = height/2;
      
      //1/4th
      int offsetX = startX + (width-newWidth) / 2;
      int offsetY = startY + (height-newHeight) / 2;
      
      Pixel target = null;
      Pixel source = null;
    if(height < 1)
    {
        return;
    }
    else
    {
        for(int y = 0; y < newHeight; y++)
        {
            for(int x = 0; x < newWidth; x++)
            {
                  source = pic.getPixel(startX + x * 2, startY + y * 2);
                  target = pic.getPixel(offsetX + x, offsetY + y);
                  target.setColor(source.getColor());
            }
        }      
        sendIn(pic, offsetX, offsetY, newWidth, newHeight);
    }
  }
  
  
  
  /**
   * Add two ints to parameter and thats the palce where you want target to go onto
   * the canvas
   **/
  public static void copytoCanvas(Picture source, Picture target)
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      //# loop through columns (target x is starting point on Canvas)
      for(int sourceX = 0, targetX = 0; sourceX < source.getWidth();sourceX++, targetX++)
      {
         //loop thhrough the rows
         for(int sourceY = 0, targetY = 0; sourceY < source.getHeight();sourceY++, targetY++)
         {
              sourcePix = source.getPixel(sourceX, sourceY);
              targetPix = target.getPixel(targetX, targetY);
              targetPix.setColor(sourcePix.getColor());
         } 
      }
      berserk.explore();
  }
}
