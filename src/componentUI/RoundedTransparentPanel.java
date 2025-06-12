package componentUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dionisio Raditya Prasmada - 230712370
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedTransparentPanel extends JPanel {
    private float opacity = 0.8f; // Default opacity (0.0 - 1.0)
    private int cornerRadius = 20; // Default rounded corner radius

    public RoundedTransparentPanel() {
        setOpaque(false); // Supaya transparansi bisa diterapkan
    }

    public void setOpacity(float opacity) {
        this.opacity = Math.max(0f, Math.min(opacity, 1f)); // Clamp antara 0.0 dan 1.0
        repaint();
    }

    public float getOpacity() {
        return opacity;
    }

    public void setCornerRadius(int radius) {
        this.cornerRadius = Math.max(0, radius);
        repaint();
    }

    public int getCornerRadius() {
        return cornerRadius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Aktifkan anti-aliasing untuk hasil halus
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Atur warna dengan alpha (transparansi)
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
        g2.setColor(getBackground());

        // Gambar panel dengan rounded corner
        Shape shape = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
        g2.fill(shape);

        g2.dispose(); // Bersihkan context
        super.paintComponent(g); // Gambar komponen anak jika ada
    }
}
