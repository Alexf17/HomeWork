package de.telran.hw_9.Lotery;

public class Source {
   private int[]winnerNumbers = new int[Constants.COUNT_SET_SIZE];
   private int lucky;
   private int luckyCounter;
   private int range = 50;

   public void runLottery() {
       luckyCounter = 1;
       while (luckyCounter <= Constants.COUNT_SET_SIZE) {
           lucky = (int) (1 + Math.random() * ((range - 1) + 1));
           switch (luckyCounter) {
               case 1:
                   winnerNumbers[0] = lucky;
                   luckyCounter++;
                   break;
               case 2:
                   if (winnerNumbers[0] != lucky) {
                       winnerNumbers[1] = lucky;
                       luckyCounter++;
                       break;
                   }

               case 3:
                   if (winnerNumbers[0] != lucky && winnerNumbers[1] != lucky) {
                       winnerNumbers[2] = lucky;
                       luckyCounter++;
                       break;
                   }

               case 4:
                   if (winnerNumbers[0] != lucky && winnerNumbers[1] != lucky && winnerNumbers[2] != lucky) {
                       winnerNumbers[3] = lucky;
                       luckyCounter++;
                       break;
                   }

               case 5:
                   if (winnerNumbers[0] != lucky && winnerNumbers[1] != lucky && winnerNumbers[2] != lucky && winnerNumbers[3] != lucky) {
                       winnerNumbers[4] = lucky;
                       luckyCounter++;
                       break;
                   }

           }
       }
   }

    public int[] getWinnerNumbers() {
        return winnerNumbers;
    }
}
