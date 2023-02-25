package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        Color cervenaBarva;
        cervenaBarva=new Color(255,0,0);

        Color modraBarva;
        cervenaBarva=new Color(0, 55, 255);

        Color zelenaBarva;
        cervenaBarva=new Color(133, 231, 70);

        Color zlutaBarva;

        //Zmrzlina:
        zofka.setLocation(100.0,100.0);


        //Sněhulák:
        zofka.setLocation(100.0,100.0);

        //Mašinka:
        zofka.setLocation(100.0,100.0);




    }

    public void nakresliRovnostrannyTrojuhehlnik(double delkaStrany, Color barvaCary) {

        for (int i = 0; i < 3; i++) {
            zofka.setPenColor(barvaCary);
            zofka.move(delkaStrany);
            zofka.turnLeft(120);
        }
    }

    public void nakresliCtverec(double delkaStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(90);
        }
    }

    public void nakresliObdelnik(double delkaDelsiStrany, double delkaKratsiStrany, Color barvaCary) {

        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaKratsiStrany);
            zofka.turnLeft(90);
            zofka.move(delkaDelsiStrany);
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


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
