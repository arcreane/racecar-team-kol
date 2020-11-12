package Car;

import com.company.Colors;

import java.util.Random;

public class Cars {
    private Colors colors;
    Random a_Random;
    private float m_fSpeed;
    private boolean m_bEventFinished;
    private float Speed;

    
    public Cars (){
        a_Random = new Random();
        m_bEventFinished = true;
    }
    public float getSpeed() {
        return Speed;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
        System.out.println(colors.getCouleur() + "naonldal,");
    }

    public boolean isEventFinished() {
        return m_bEventFinished;
    }




}

