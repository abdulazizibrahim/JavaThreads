import javax.swing.JOptionPane;

class threads{
    public static void main(String[] args) {

        Runnable countEven = () -> {
            int even = 0;
            for (int i = 1; i < 10000; i++) {
                
                if(i % 2 == 0)
                {
                    even = even + 1;
                }
            }
            JOptionPane.showMessageDialog(null,"even count ==> "+even);
        };

        Runnable countPrime = () -> {
            int prime = 0;
            for(int i = 1 ; i <= 10000 ; i++)
            {
        
                int count = 0;
                for(int j = 1 ; j <= i ; j++)	
                {
                    if(i % j == 0)
                        count = count+1;
                }
                if(count == 2)
                    prime = prime + 1;
            }
            JOptionPane.showMessageDialog(null,"prime count ==> "+prime);

        };

        new Thread (countEven).start();
        new Thread (countPrime).start();
    }
}