package package10;

public class Main {
    public static void main(String[] args){
        Draw h=new H(), e=new E(), l=new L(),o=new O(),star=new Star();
        Draw hello=new HorizontalDraw(star,h,e,l,l,o,star);
        System.out.println(hello);
        Draw frame =new FrameDraw(hello);
        System.out.println(frame);
    }
}
