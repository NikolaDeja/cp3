public class Rectangle
{
    int l,w;//l-length, w=width

    void Show_l(){
        System.out.println("Lenght:" +l);
    }
    void Show_w(){
        System.out.println("Width:" +w);
    }
    int area(){
        return l*w;
    }
}