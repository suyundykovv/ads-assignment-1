 package lecture1.ads1;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class ads1 extends JPanel {

    private int x, y;
    private int size;
    private int corner;

    public ads1(int x, int y, int size, int corner) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.corner = corner;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawH(g, x, y, size);
    }

    private void drawH(Graphics g, int x, int y, int size) {
        if (size <= 10) return;

        int halfSize = size / 2;
        int quarterSize = size / 4;

        g.drawLine(x, y, x, y + size);
        g.drawLine(x + size, y, x + size, y + size);
        g.drawLine(x, y + halfSize, x + size, y + halfSize);


        int newX, newY;
        switch (corner) {
            case 1:
                newX = x - quarterSize;
                newY = y - quarterSize;
                break;
            case 2:
                newX = x + size;
                newY = y - quarterSize;
                break;
            case 3:
                newX = x - quarterSize;
                newY = y + size;
                break;
            case 4:
                newX = x + size;
                newY = y + size;
                break;
            default:
                return;
        }

        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        drawH(g, newX, newY, halfSize);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Recursive H");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        ads1 panel = new ads1(150, 150, 100, 1);
        frame.add(panel);

        frame.setVisible(true);
    }
}
