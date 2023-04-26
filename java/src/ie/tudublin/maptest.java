package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class maptest extends PApplet
{

    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        colorMode(HSB);
        background(0);

        border = width * 0.1f;
    }
    
    public float border;

    void drawGrid()
    {
        stroke(255, 0, 255);
        textAlign(CENTER, CENTER);
        textSize(20);
        for(int i = -5; i <=5; i ++)
        {
            float x = map(i, -5, 5, border, width - border);
            line(x, border, x, height - border);
            line(border, x, width - border, x);
            fill(255);
            text(i, x, border * 0.5f);
            text(i, border * 0.5f, x);
        }
    }

    

    public void draw()
    {
        fill(255);
        noStroke();
        drawGrid();
    }
}