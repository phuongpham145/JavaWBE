public class Quadratic {
      private float a , b , c ;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public Quadratic(float a , float b , float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return this.b*this.b - 4*this.a*this.c ;
    }

    public double getRoot1(){
            return (-b + Math.pow(getDiscriminant(),0.5)/2*a);
    }

    public double getRoot2(){
            return (-b - Math.pow(getDiscriminant(),0.5)/2*a);
    }


}

