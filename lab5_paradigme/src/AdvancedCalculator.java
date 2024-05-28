public class AdvancedCalculator extends IntCalculator{

    AdvancedCalculator(int state){
        super(state);
    }

    public AdvancedCalculator Division(int nr){
        state=state/nr;
        return this;
    }

    public AdvancedCalculator Pow(int nr){
        state=(int)Math.pow(state,nr);
        return this;
    }

    public AdvancedCalculator AnotherPow(int nr){
        state=(int)Math.pow(state,1.0/nr);
        return this;
    }

}
