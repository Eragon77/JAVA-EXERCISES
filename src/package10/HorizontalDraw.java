package package10;

import java.util.Arrays;

public final class HorizontalDraw extends Draw{
    private final Draw[] children;

    public HorizontalDraw(Draw... children) throws IllegalArgumentException{
        if(children.length==0)
            throw new IllegalArgumentException("HorizontalDraw: one Draw is needed at least");
        this.children=children;
    }


    //Larghezza->somma di tutte le larghezze
    @Override
    public int getWidth() {
        return Arrays.stream(children).mapToInt(Draw::getWidth).sum();
    }

    //Altezza->altezza massima
    @Override
    public int getHeight() {
        return Arrays.stream(children).mapToInt(Draw::getHeight).max().orElse(0);
    }

    @Override
    protected String getRow(int num) throws IllegalArgumentException {
        StringBuilder sb=new StringBuilder();

       if(num>=this.getHeight() || num<0)
           throw new IllegalArgumentException("invalid num");

        for(Draw child:children){
            if(num<child.getHeight())
                sb.append(child.getRow(num));
            else
                sb.append(" ".repeat(child.getWidth()));
        }

        return sb.toString();

    }

}