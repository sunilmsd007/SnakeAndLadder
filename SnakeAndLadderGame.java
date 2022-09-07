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
			 if(i>100)
				 position=i-diceNumber;
			 else
				 position=i;
			break;
		case SNAKE:
			position-=diceNumber;
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
