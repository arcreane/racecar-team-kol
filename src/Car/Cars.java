package Car;

import com.company.Colors;

public class Cars {
    private Engine m_engine;
    private int beforeLeftWheel;
    private int beforeRightWheel;
    private int backLeftWheel;
    private int backRightWheel;
    private Colors colors;

    public Cars (){

    }

    public void setColors(Colors colors) {
        this.colors = colors;
        System.out.println(colors.getCouleur() + "naonldal,");
    }
}
