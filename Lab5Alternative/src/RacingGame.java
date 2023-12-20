import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RacingGame extends JFrame {
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;
    private JProgressBar progressBar3;

    public RacingGame() {
        setTitle("Гонки");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        Random rand = new Random();
        progressBar1 = new JProgressBar();
        progressBar2 = new JProgressBar();
        progressBar3 = new JProgressBar();

        add(progressBar1);
        add(progressBar2);
        add(progressBar3);

        setSize(300, 300);
        setVisible(true);

        startRace(rand);
    }

    private void startRace(Random rand) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    progressBar1.setValue(i);
                    try {
                        Thread.sleep(rand.nextInt(40, 100));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    progressBar2.setValue(i);
                    try {
                        Thread.sleep(rand.nextInt(40, 100));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    progressBar3.setValue(i);
                    try {
                        Thread.sleep(rand.nextInt(40, 100));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RacingGame();
            }
        });
    }
}