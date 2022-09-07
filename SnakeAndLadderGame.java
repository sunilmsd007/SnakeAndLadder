package snakeAndLadder;

public class SnakeAndLadderGame {

	static int position=0;
        public static final int LADDER=1;
	public static final int SNAKE=2;
        public static void main(String[] args) {
           
           while(position<100) {
           int diceNumber=(int) Math.floor(Math.random()*10)%6 + 1;
           System.out.println("Dice Number is: " +diceNumber);
           int checkMovement= (int) Math.floor(Math.random()*10)%3;
		switch(checkMovement) {
		case LADDER:
                        int i= position+=diceNumber;
			 if(i>100){
				  position=i-diceNumber;
                                  System.out.println("OOPS! You can't go more than winning position so stay in same position");
                                 }
			 else{
				 position=i;
                                 System.out.println("It's LADDER! Climb Up by" +" " +diceNumber+ " "+ "steps");
                                }
			break;
		case SNAKE:
			position-=diceNumber;
                        System.out.println("It's SNAKE! Go back by" +" " +diceNumber+ " "+ "steps");
			break;
		default:
			System.out.println("stay in same position");
		}
                if(position<0)
			position=0;
		System.out.println("Current position is: " +position);
		}
  }
}
