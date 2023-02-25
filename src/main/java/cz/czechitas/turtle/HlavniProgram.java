package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        Color cernaBarva;
        cernaBarva = new Color(16, 14, 14);

        Color cervenaBarva;
        cervenaBarva = new Color(255, 0, 0);

        Color modraBarva;
        modraBarva = new Color(0, 55, 255);

        Color zlutaBarva;
        zlutaBarva = new Color(252, 222, 69);

        Color zelenaBarva;
        zelenaBarva = new Color(133, 231, 70);

        //Zmrzlina:
        zofka.setLocation(250.0, 150);
        nakresliKruh(1.2, zlutaBarva);
        zofka.turnLeft(90);
        nakresliRovnostrannyTrojuhehlnik(140, cervenaBarva);

        //Sněhulák:
        zofka.setLocation(500.0, 150.0);
        nakresliKruh(0.8, modraBarva);
        zofka.setLocation(520.0, 280.0);
        nakresliKruh(1.2, modraBarva);
        zofka.setLocation(540.0, 450.0);
        nakresliKruh(1.6, modraBarva);
        zofka.setLocation(580.0, 280.0);
        nakresliKruh(0.5, modraBarva);
        zofka.setLocation(385.0, 280.0);
        nakresliKruh(0.5, modraBarva);

        //Mašinka:
        zofka.turnLeft(30);
        zofka.setLocation(900.0, 300.0);
        nakresliObdelnik(75, 150, zelenaBarva);
        zofka.turnRight(90);
        nakresliObdelnik(100, 150, zelenaBarva);
        zofka.move(100);
        zofka.turnLeft(90);
        nakresliKruh(0.8, cervenaBarva);
        zofka.setLocation(800.0, 335.0);
        nakresliKruh(0.4, cervenaBarva);
        zofka.setLocation(880.0, 335.0);
        nakresliKruh(0.4, cervenaBarva);
        zofka.setLocation(745.0, 320);
        nakresliPrvouhlyTrojuhelnik(75, cernaBarva);

    }

    public void nakresliRovnostrannyTrojuhehlnik(double delkaStrany, Color barvaCary) {

        zofka.setPenColor(barvaCary);
        zofka.move(delkaStrany);
        zofka.turnLeft(120);
        zofka.move(delkaStrany);
        zofka.turnLeft(120);
        zofka.move(delkaStrany);
    }

    public void nakresliCtverec(double delkaStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(90);
        }
    }

    public void nakresliObdelnik(double delkaStranaA, double delkaStranaB, Color barvaCary) {

        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranaA);
            zofka.turnLeft(90);
            zofka.move(delkaStranaB);
            zofka.turnLeft(90);
        }
    }

    public void nakresliKruh(double polomer, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 360; i++) {
            zofka.move(polomer);
            zofka.turnLeft(1);
        }
    }

    public void nakresliPrvouhlyTrojuhelnik(double delkaOdvesny, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        var delkaPrepony = Math.sqrt(2 * Math.pow(delkaOdvesny, 2));
        zofka.move(delkaOdvesny);
        zofka.turnLeft(135);
        zofka.move(delkaPrepony);
        zofka.turnLeft(135);
        zofka.move(delkaOdvesny);

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
