import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Skizze
{
    // Attribute
    GraphicsContext gc;     // Referenz auf die Zeichenfläche
    Lampe lampe;            // Referenz auf die Lampe
   
    // Konstruktor
    Skizze(GraphicsContext gc_)
    {
        gc = gc_;             // Wir erhalten eine Zeichenfläche und speichern sie in gc
        lampe = new Lampe(50,50,50, Color.YELLOW);  // Lampe wird erzeugt
        zeichnen();   // Es wird gezeichnet! 
    }

    // Wird aufgerufen, wenn auf den Button an geklickt wird
    void buttonGeklickt()
    {
        lampe.schalten();   // Die Lampe wird geschaltet
        zeichnen();         
    }
    
    // Es wird gezeichnet!
    // Diese Methode muss immer aufgerufen werden!
    void zeichnen()
    {
        // Zeichne die Lampe
        lampe.zeichnen(gc);
    }
    
}
