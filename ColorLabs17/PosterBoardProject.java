
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
    
    public static Picture canvas = new Picture("images\\canvas.jpg");
    
    public static void main(String[] args)
    {
        Picture ColorInvert = new Picture("images\\BerserkCI.jpg");
        Picture GreyScale = new Picture("images\\BerserkGS.jpg");
        Picture MirroVertical = new Picture("images\\BerserkMV.jpg");
        Picture POverlap = new Picture("images\\BerserkOL.jpg");
        Picture rotated = new Picture("images\\BerserkR180.jpg");
        Picture Recursive = new Picture("images\\BerserkRS.jpg");
        
        copytoCanvas(ColorInvert,  canvas, 0, 0);
        copytoCanvas(GreyScale,  canvas, GreyScale.getWidth(), 0);
        copytoCanvas(MirroVertical,  canvas, (MirroVertical.getWidth()*2), 0);
        copytoCanvas(POverlap,  canvas, 0, POverlap.getHeight());
        copytoCanvas(rotated,  canvas, rotated.getWidth(), rotated.getHeight());
        copytoCanvas(Recursive,  canvas, (Recursive.getWidth()*2), Recursive.getHeight());
        
        canvas.explore();
        //canvas.write("images\\FinalCallege.jpg");
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
       //#------------------------------
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
  public static void greyScale()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Pixel spot2 = null;
      int avg, total;
      for(int y = 0; y < berserk.getHeight(); y++)
      {
          for(int x = 0; x < berserk.getWidth(); x++)
          {
              spot2 = berserk.getPixel(x,y);
              total = (spot2.getRed() + spot2.getGreen() + spot2.getBlue());
            avg = total/3;
            spot2.setRed(avg);
            spot2.setGreen(avg);
            spot2.setBlue(avg);
          }
      }
      //#---------------------------
  }
  
  
    //inverts all the colors  
  public static void ColorInvert()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Pixel spot = null;
      int red, green, blue;
      
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
      //#-------------------------
  }
  
  
  
  //overlap berserk and pipen image by averaging their colors
  public static void overlap()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Picture pipen = new Picture("images\\Pipen.jpg");
      
      Pixel spot1 = null;
      Pixel spot2 = null;
      
      int red, green, blue;
      
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
      //#-------------------------
  }
  
public static void EMOverlap()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Picture ethon = new Picture("images\\Eathon.jpg");
      Picture manny = new Picture("images\\manny.jpg");
      
      Pixel spot1 = null;
      Pixel spot2 = null;
      Pixel spot3 = null;
      
      int red, green, blue;
      
      for(int y = 0; y < berserk.getHeight(); y++)
      {
          for(int x = 0; x < berserk.getWidth(); x++)
          {
              spot1 = berserk.getPixel(x,y);
              spot2 = ethon.getPixel(x,y);
              spot3 = manny.getPixel(x,y);
              red = (spot1.getRed() + spot2.getRed() + spot3.getRed()) /3;
              green = (spot1.getGreen() + spot2.getGreen() + spot3.getGreen()) /3;
              blue = (spot1.getBlue() + spot2.getBlue() + spot3.getBlue()) /3;
              
              spot1.setRed(red);
              spot1.setGreen(green);
              spot1.setBlue(blue);
          }
      }
      berserk.explore();
  }
  
  public static void EathonOverlap()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Picture pipen = new Picture("images\\Eathon.jpg");
      
      Pixel spot1 = null;
      Pixel spot2 = null;
      
      int red, green, blue;
      
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
  
  
  

  
  public static void MannyOverlap()
  {
      Picture berserk = new Picture("images\\Berserk.jpg");
      Picture pipen = new Picture("images\\manny.jpg");
      
      Pixel spot1 = null;
      Pixel spot2 = null;
      
      int red, green, blue;
      
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
    //#----------------------
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
  
  
  

// rotates berserk image 180 degrees
public static void rotate180()
{
    Picture berserk = new Picture("images\\Berserk.jpg");

    int width = berserk.getWidth();
    int height = berserk.getHeight();

    Picture rotated = new Picture(width, height);

    Pixel oldPixel = null;
    Pixel newPixel = null;

    for(int y = 0; y < height; y++)
    {
        for(int x = 0; x < width; x++)
        {
            oldPixel = berserk.getPixel(x, y);

            // 180 degree rotation formula
            newPixel = rotated.getPixel(width - 1 - x, height - 1 - y);

            newPixel.setColor(oldPixel.getColor());
        }
    }
    //#---------------------------
    //rotated.write("images\\BerserkR180.jpg");
}
  
  
  
  /**
   * Add two ints to parameter and thats the palce where you want target to go onto
   * the canvas
   **/
  public static void copytoCanvas(Picture source, Picture target, int x, int y)
  {
      
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      //# loop through columns (target x is starting point on Canvas)
      for(int sourceX = 0, targetX = x; sourceX < source.getWidth();sourceX++, targetX++)
      {
         //loop thhrough the rows
         for(int sourceY = 0, targetY = y; sourceY < source.getHeight();sourceY++, targetY++)
         {
              sourcePix = source.getPixel(sourceX, sourceY);
              targetPix = target.getPixel(targetX, targetY);
              targetPix.setColor(sourcePix.getColor());
         } 
      }
    
  }
  
 
}
