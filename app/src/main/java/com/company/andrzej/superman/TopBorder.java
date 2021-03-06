package com.company.andrzej.superman;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by Andrzej on 2016-01-25.
 */
public class TopBorder extends GameObject {
    private int score = 4;
    private Bitmap image;

    public TopBorder(Bitmap res, int x, int y, int h)
    {
        height = h;
        width = 20;

        this.x = x;
        this.y = y;

        dx = GamePanel.MOVESPEED;
        image = Bitmap.createBitmap(res, 0, 0, width, height);


    }
    public void update()
    {
        x+=dx;
    }
    public void draw(Canvas canvas)
    {
        try{canvas.drawBitmap(image,x,y,null);}catch(Exception e){};

    }


}
