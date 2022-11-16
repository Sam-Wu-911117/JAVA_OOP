class Position{
    private double px,py,pz;

    public Position(Position p) {
        this.px=p.px;
        this.py=p.py;
        this.pz=p.pz;
    }

    public double getPx() {
        return px;
    }

    public double getPy() {
        return py;
    }

    public double getPz() {
        return pz;
    }
    public Position(){
        px=0;py=0;pz=0;
    }
    public Position(double px ,double py ,double pz){
        this.px=px;
        this.py=py;
        this.pz=pz;
    }
    public void setX(double x){
        this.px=x;
    }

    public String toString() {
        return "(px, py, pz) = ("+getPx()+", "+getPy()+", "+getPz()+")";
    }
}
class Roatation{
    private double rx,ry,rz;

    public double getRx() {
        return rx;
    }

    public double getRy() {
        return ry;
    }

    public double getRz() {
        return rz;
    }
    public Roatation(){
        rx=0;ry=0;rz=0;
    }
    public Roatation(double rx, double ry ,double rz){
        this.rx=rx;
        this.ry=ry;
        this.rz=rz;
    }
    public String toString() {
        return "(rx, py, pz) = ("+getRx()+", "+getRy()+", "+getRz()+")";
    }
}
class Cube{
    private Position p;
    private Roatation r;
    private double length;
    public Position getP(){
        return new Position(p);
    }

    public Cube(){
        this(0,0,0,0,0,0,0);
    }
    public Cube(double px,double py,double pz,double rx,double ry,double rz,double length ) {
        this.p = new Position(px, py, pz);
        this.r = new Roatation(rx, ry, rz);
        this.length = length;
    }


    public String toString() {
        return "中心: "+p.toString()+",\n"+"旋轉: "+r.toString()+",\n"+"長度: "+length;
    }

}

    public class Main {
    public static void main(String[] args) {
       Cube c= new Cube(3,4,5,30,40,50,10);
        System.out.println(c);

        Position p1 =c.getP();
        System.out.println(p1);

        p1.setX(7);
        System.out.println(p1);
        System.out.println(c);
    }
}