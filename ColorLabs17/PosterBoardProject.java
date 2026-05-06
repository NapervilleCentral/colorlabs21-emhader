
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
  
  
  public static void sendIn()
  {
    Picture berserk = new Picture("images\\Berserk.jpg");
    sendIn(berserk.getWidth(), berserk.getHeight());
  }
  private static void sendIn(int width, int height)
  {
    Picture berserk = new Picture("images\\Berserk.jpg");
      Pixel target = null;
      Pixel prev = null;
    if(height < 10)
    {
        return;
    }
    else
    {
        for(int y = height/4; y < height/2; y++)
        {
            for(int x = width/4; x < width/2; x++)
            {
                  
            }
        }      
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
