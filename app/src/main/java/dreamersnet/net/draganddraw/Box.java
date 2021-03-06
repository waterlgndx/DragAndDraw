package dreamersnet.net.draganddraw;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Canvas;

/**
 * Created by water on 11/6/2016.
 */

public class Box extends Shapes {
    private PointF mOrigin;
    private PointF mEnd;
    private Paint mPaint;

    public Box (PointF origin) {
        mOrigin = origin;
        mEnd = origin;
        mPaint = new Paint();
        mPaint.setARGB(0,0,0,0);
    }

    public Paint getPaint() { return mPaint; }

    public void setPaint(Paint p) {
        mPaint = p;
    }

    public PointF getEnd() {
        return mOrigin;
    }

    public void setEnd(PointF endPoint) {
        mEnd = endPoint;
    }

    public void draw(Canvas c) {
        float left = Math.min(mOrigin.x, mEnd.x);
        float right = Math.max(mOrigin.x, mEnd.x);
        float top = Math.min(mOrigin.y, mEnd.y);
        float bottom = Math.max(mOrigin.y, mEnd.y);
        c.drawRect(left,top,right,bottom, mPaint);
    }

    public void setOrigin(PointF origin) {
        mOrigin = origin;
    }

    public PointF getOrigin() {
        return mOrigin;
    }
}
