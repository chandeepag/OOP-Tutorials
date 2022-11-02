package Week3;

// should do again. Can't understand what the shit is happening in some areas
public class Question4 {
    private int cans;
    private int tokens;

    // addCan function
    public void addCans(int cans){
        this.cans+= cans;
    }

    // get the number of cans
    public int getCanCount(){
        return cans;
    }

    // Insert a token
    public void insertToken() throws Exception{
        this.tokens += 1;

        if (this.cans > 0){
            --this.cans;
            return;
        }
        throw new Exception("Not enough cans");
    }

    // check the number of tokens
    public int getTokenCount(){
        return tokens;
    }





}