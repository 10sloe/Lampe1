import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Lampe
{
    // Attribute
    int zustand;       // Zustand der Lampe
                       // 0 steht für aus, 1 steht für an                 
    int x;             // x-Koordinate der linken oberen Ecke
    int y;             // y-Koordinate der linken oberen Ecke 
    int d;             // Durchmesser der Lampe
    Color farbe;       // Die Farbe der Lampe
    // Konstruktor    
    Lampe(int x_, int y_,int d_, Color farbe_)
    {
        zustand = 0;  // Am Anfang ist die Lampe aus
        x = x_;
        y = y_;
        d = d_;
        farbe = farbe_;
    }

    //Methoden
    void schalten()
    {
        zustand = 1;
    }


    void zeichnen(GraphicsContext gc)
    {
        // Jede Lampe hat einen schwarzen Rand
        gc.setStroke(Color.BLACK);
        gc.strokeOval(x,y,d,d);
        
        // Wenn die Lampe aus ist
        if(zustand == 0)
        {
            gc.setFill(Color.DARKGRAY);  
            gc.fillOval(x,y,d,d); 
        }
        // Wenn die Lampe an ist
        if(zustand == 1)
        {
            gc.setFill(farbe);  
            gc.fillOval(x,y,d,d); 
        }
    }

}
