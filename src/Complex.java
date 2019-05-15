public class Complex {
    private double Re,Im;
    Complex(double a,double b){
        Re=a;
        Im=b;
    }
    public double GetRe(){ return Re;}
    public double GetIm(){ return Im;}
    public void SetRe(double re){ Re=re;}
    public void SetIm(double im){ Im=im;}
    public void PrintC(){
        if (GetIm()>0) System.out.print(GetRe()+"+"+GetIm()+"i");
        if (GetIm()<0) System.out.print(GetRe()+" "+GetIm()+"i");
        if (GetIm()==0)System.out.print(GetRe());
    }
    public Complex sum(Complex b) { double sum_re,sum_im;
        sum_re=b.GetRe() + Re;
        sum_im=b.GetIm() + Im;

        return new Complex(sum_re,sum_im);
    }
    public Complex sub(Complex b) { double sum_re,sum_im;
        sum_re=Re-b.GetRe();
        sum_im=Im+(-b.GetIm());
        return new Complex(sum_re,sum_im);
    }
    public Complex mul(Complex b) { double sum_re,sum_im;
        sum_re=Re*b.GetRe()+Im*b.GetIm()*(-1);
        sum_im=Re*b.GetIm()+Im*b.GetRe();
        return new Complex(sum_re,sum_im);
    }


}