class ArithmeticOp {
    public static void main(String args[]){
        int p=5,q=12,r=20,s;
        s=p+q;
        System.out.println(s);
        s=p%q;
        System.out.println("p%q is"+s);
        s*=r;
        System.out.println("s*=r is"+s);
        System.out.println(p);
        p++;
        System.out.println(p);
        double x=25.75,y=14.25,z;
        z=x-y;
        System .out.println("x-y is" +z);
        z-=2.50;
        System.out.println("z-=2.50 is "+z);
        System.out.println("Value of z before operation is"+z);
        z--;
        System.out.println("Value of z after operation is"+z);
        z=x/y;
        System .out.println("x/y is" +z);
    }
}