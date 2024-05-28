public class IntCalculator {
    public int state;

    IntCalculator(int state){
        this.state=state;
    }
    public IntCalculator Add(int nr){
        state=state+nr;
        return this;
    }
   public IntCalculator Substract(int nr){
        state=state-nr;
        return this;
    }
    public IntCalculator Multiply(int nr){
        state=state*nr;
        return this;
    }
   public int Result(){
        return state;
    }
    public IntCalculator(){
        state=0;
    }
}
