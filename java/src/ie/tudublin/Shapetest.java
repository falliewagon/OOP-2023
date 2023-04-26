package ie.tudublin;

import processing.core.PApplet;

public class Shapetest extends PApplet
{

    public void settings()
    {
        size(1000, 1000);
    }

    public void setup()
    {
        colorMode(HSB);
    }

    //float off = 0;

    
    /*
    //Drawing of a circle
    public void draw()
    {
        background(0);
        fill(255);
        noStroke();

        int numCircles = (int) max(1, mouseX / 50.0f);
        float d = width / numCircles;
        for (int j = 0; j < numCircles; j++) {
            for (int i = 0; i < numCircles; i++) {
                float x = (d * 0.5f) + (d * i);
                float y = (d * 0.5f) + (d * j);
                float c = ((i + j) / ((numCircles - 1) * 2.0f)) * 255.0f;
                fill((c + off) % 256, 255, 255);
                circle(x, y, d);
            }
        }
        off += (mouseY / 50.0f);

    }
    */

    /*
    //Drawing of a rectangle
    public void draw()
    {
        background(0);
        fill(255);
        noStroke();

        int numRectangles = 10;
        float d = width / numRectangles;
        for(int j = 0; j < numRectangles; j++)
        {
            for(int i = 0; i < numRectangles; i++)
            {
                float x = (d * 0.5f) + (d * i);
                float y = (d * 0.5f) + (d * j);
                float c = ((j) / ((numRectangles - 1) * 2.0f)) * 255.0f;
                fill(c % 256, 255, 255);
                rect(y, x, d, d);
            }
        }
    }
    */

    public void draw()
    {
        fill(150);
        rect(100, 100, 100, 100);
    }
}