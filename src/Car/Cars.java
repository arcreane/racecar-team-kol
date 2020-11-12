package Car;

import com.company.Colors;

import java.util.Random;

public class Cars {
    private Colors colors;
    Random a_Random;
    private boolean m_bEventFinished;

    public float speed;


    public Cars (){
        a_Random = new Random();
        m_bEventFinished = true;
    }
    public void setColors(Colors colors) {
        this.colors = colors;
        System.out.println(colors.getCouleur());

    }
    public void check(){

    }
    public boolean isEventFinished() {
        return m_bEventFinished;
    }

    public void write(){

        System.out.println("Ma vitesse est de : " + speed + "km/h");
    }



}

