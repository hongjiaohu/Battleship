import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class StartButtom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButtom extends Actor
{
    
    /**
     * StartButtom is the constructor for objects of type StartButtom
     * 
     * @parame There are no parameters
     * @return an object of type StartButtom
     * 
     */
    public StartButtom()
    {
        GreenfootImage buttomImage = new GreenfootImage( 90, 90 );
        
        buttomImage.setColor( Color.BLACK );
        buttomImage.fillOval( 0, 0, 90, 90 );
        
        buttomImage.setColor( Color.WHITE );
        buttomImage.fillOval( 3, 3, 84, 84 );
        
        buttomImage.drawImage( new GreenfootImage("START", 30, Color.BLACK, new Color(0,0,0,0) ), 6, buttomImage.getHeight() / 3 );

        
        setImage( buttomImage );
    }
    
    /**
     * Act - do whatever the StartButtom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        if( Greenfoot.mouseClicked( this ) )
        {
            Greenfoot.setWorld( new PlayerWorld() );
            
        }
    }    
}
