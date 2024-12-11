package package10;

public class FrameDraw extends Draw{
    private final Draw child;

    public FrameDraw(Draw child){
        this.child=child;
    }


    @Override
    public int getWidth() {
        return child.getWidth()+2;
    }

    @Override
    public int getHeight() {
        return child.getHeight()+2;
    }

    @Override
    protected String getRow(int num) throws IllegalArgumentException {
        StringBuilder sb=new StringBuilder();
        if(num==0 || num==this.getHeight()-1){
            sb.append("@".repeat(this.getWidth()));
        }
        else{
            sb.append("@").append(this.child.getRow(num-1)).append("@");
        }
        return sb.toString();
    }
}
